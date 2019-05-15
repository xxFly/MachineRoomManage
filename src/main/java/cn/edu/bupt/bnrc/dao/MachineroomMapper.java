package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.pojo.MachineroomExample;
import cn.edu.bupt.bnrc.pojo.MachineroomKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineroomMapper {
    int countByExample(MachineroomExample example);

    int deleteByExample(MachineroomExample example);

    int deleteByPrimaryKey(MachineroomKey key);

    int insert(Machineroom record);

    int insertSelective(Machineroom record);

    List<Machineroom> selectByExample(MachineroomExample example);

    Machineroom selectByPrimaryKey(MachineroomKey key);

    int updateByExampleSelective(@Param("record") Machineroom record, @Param("example") MachineroomExample example);

    int updateByExample(@Param("record") Machineroom record, @Param("example") MachineroomExample example);

    int updateByPrimaryKeySelective(Machineroom record);

    int updateByPrimaryKey(Machineroom record);

    List<Machineroom> queryAllRooms(String userId);

    List<String> queryAllRoomIds(String user_id);
}