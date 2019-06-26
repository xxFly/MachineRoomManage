package cn.edu.bupt.bnrc.generatid;

public class Snowflake {
    // Twitter 纪元时间：2010-11-04 09:42:54 657，算法中的时间戳从这一时刻开始计时
    private long twepoch = 1288834974657L;

    // 机器 ID 用 5 位二进制数表示
    private long workerIdBits = 5L;
    // 数据中心 ID 用 5 位二进制数表示
    private long datacenterIdBits = 5L;
    // 最大的机器 ID：2^5 - 1
    private long maxWorkerId = -1L ^ (-1L << workerIdBits);
    // 最大的数据中心 ID：2^5 - 1
    private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);

    // 时间戳内的序列号用 12 位二进制数表示
    private long sequenceBits = 12L;

    // 机器 ID 左移 12 位，也就是右起第 12 到 16 位表示机器 ID
    private long workerIdShift = sequenceBits;
    // 数据中心 ID 左移 17 位，也就是右起第 17 到 21 位表示数据中心 ID
    private long datacenterIdShift = sequenceBits + workerIdBits;
    // 时间戳左右 22 位，也就是右起第 22 到 62 位表示数据中心 ID，63 位为 Long 型的符号位
    private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;
    // 序列号的掩码，值为 4095，(sequence + 1) & sequenceMask == 0，则表示序列号大于4095，应该重新生成序列号
    private long sequenceMask = -1L ^ (-1L << sequenceBits);

    // 系统最后记录的时间戳
    private long lastTimestamp = -1L;

    // 机器 ID
    private long workerId;
    // 数据中心 ID
    private long datacenterId;
    // 序列号
    private long sequence;

    public Snowflake(long workerId, long datacenterId, long sequence) {
        // sanity check for workerId
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
        }


        this.workerId = workerId;
        this.datacenterId = datacenterId;
        this.sequence = sequence;
        System.out.printf("worker starting. timestamp left shift %d, datacenter id bits %d, worker id bits %d, sequence bits %d, workerid %d",
                timestampLeftShift, datacenterIdBits, workerIdBits, sequenceBits, workerId);
    }

    public long getWorkerId() {
        return workerId;
    }

    public long getDatacenterId() {
        return datacenterId;
    }

    public long getTimestamp() {
        return System.currentTimeMillis();
    }

    public synchronized long nextId() {
        long timestamp = timeGen();

        if (timestamp < lastTimestamp) {
            System.err.printf("clock is moving backwards.  Rejecting requests until %d.", lastTimestamp);
            throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds",
                    lastTimestamp - timestamp));
        }

        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            if (sequence == 0) {
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0;
        }

        lastTimestamp = timestamp;
        return ((timestamp - twepoch) << timestampLeftShift) |
                (datacenterId << datacenterIdShift) |
                (workerId << workerIdShift) |
                sequence;
    }

    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis();
    }

    //---------------测试---------------
//    public static void main(String[] args) {
//        Snowflake worker = new Snowflake(1, 1, 1);
//        for (int i = 0; i < 30; i++) {
//            System.out.println(worker.nextId());
//        }
//    }

}
