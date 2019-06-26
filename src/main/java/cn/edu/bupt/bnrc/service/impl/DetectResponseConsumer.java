package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.pojo.Detection;
import cn.edu.bupt.bnrc.service.interfaces.DetectionService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

public class DetectResponseConsumer  implements MessageListener {
    @Autowired
    private DetectionService detectionService = new DetectionServiceImpl();
    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("receive getBody:{}"+new String(message.getBody()) );
            String msg = new String(message.getBody());
//        String msg = "{\"item_list\": [{\"class\": \"7\",\"class\": \"NONE\", \"confidence\": 0.9999382495880127, \"box\": [2184.646728515625, 569.4885864257812, 3331.9697265625, 866.6381225585938], \"position\": 32}, {\"class\": \"8\",\"class\": \"NONE\", \"confidence\": 0.9999198913574219, \"box\": [2188.62353515625, 1537.0194091796875, 3290.340087890625, 758.8983154296875], \"position\": 29}, {\"class\": \"System_X3650_M4\", \"confidence\": 0.9997506737709045, \"box\": [2127.903564453125, 2565.073974609375, 3563.540771484375, 764.6014404296875], \"position\": 25}], \"request_id\": 31, \"path\": \"/diskb/lee/yolo/darknet/data/VOC2007/JPEGImages/rack06.view02.IMG_1368.jpg\"}";
            JSONObject msgJson = JSONObject.parseObject(msg);
            int detectId = Integer.parseInt(msgJson.getString("request_id"));
            JSONArray itemArray = msgJson.getJSONArray("item_list");
            JSONObject item = (JSONObject) itemArray.get(0);
            String detectBrand = item.getString("class");
            String detectLocation = item.getString("position");
            String detectExtra = item.getString("box");
            String detectTime = "_" + detectId + "_0";
//            Detection detection = new Detection(Integer.parseInt(detectId),0,detectBrand,"",detectLocation,detectTime,detectExtra) ;
            Detection detection = new Detection();
            detection.setDetectId(detectId);
            detection.setDetectBrand(detectBrand);
            detection.setDetectLocation(detectLocation);
            detection.setDetectTime(detectTime);
            detection.setDetectExtra(detectExtra);
            System.out.println(detection.toString());
            detectionService.updateByPrimaryKeySelective(detection);
            if(itemArray.size() > 1){
                Detection d = detectionService.selectByPrimaryKey(detectId);
                int userId = d.getUserId();
                String time = d.getDetectTime().split("_")[0];
//            String detectTime = d.getDetectTime();
                for (int i = 1; i < itemArray.size(); i++) {
                    item = (JSONObject) itemArray.get(i);
                    detectBrand = item.getString("class");
                    detectLocation = item.getString("position");
                    detectExtra = item.getString("box");
                    detectTime = time + "_" + detectId + "_" + i;
//            Detection detection = new Detection(Integer.parseInt(detectId),0,detectBrand,"",detectLocation,detectTime,detectExtra) ;
                    detection = new Detection();
                    detection.setDetectId(detectId + i);
                    detection.setUserId(userId);
                    detection.setDetectBrand(detectBrand);
                    detection.setDetectVersion("");
                    detection.setDetectLocation(detectLocation);
                    detection.setDetectTime(detectTime);
                    detection.setDetectExtra(detectExtra);
                    System.out.println(detection.toString());
                    detectionService.insertEquipmentDetection(detection);
                }
            }
        }catch (Exception e){
            System.out.println("failed receive message");
        }
    }
}
