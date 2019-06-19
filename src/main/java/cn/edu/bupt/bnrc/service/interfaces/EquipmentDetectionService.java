package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.Detection;

import java.util.List;


public interface EquipmentDetectionService {
    int insertEquipmentDetection(Detection equipmentDetection);

    List<Detection> selectByUserAndDetectTime(int userId, String detectTime);

    int updateByPrimaryKey(Detection equipmentDetection);

    int updateByDetection(Detection equipmentDetection);

    int deleteByPrimaryKey(String equipmentTime);

    int deleteByUserAndTime(int userId,String detectTime);

    List<Detection> queryEquipmentByUser(int userId);
}
