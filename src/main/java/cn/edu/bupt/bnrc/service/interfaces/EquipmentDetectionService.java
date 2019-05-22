package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EquipmentDetectionService {
    int insertEquipmentDetection(EquipmentDetection equipmentDetection);

    EquipmentDetection selectByPrimaryKey(String equipmentTime);

    int updateByPrimaryKey(EquipmentDetection equipmentDetection);

    int deleteByPrimaryKey(String equipmentTime);

    List<EquipmentDetection> queryEquipmentByUser(String userId);
}
