package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.DetectionMapper;
import cn.edu.bupt.bnrc.pojo.Detection;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentDetectionServiceImpl implements EquipmentDetectionService {
    @Autowired
    private DetectionMapper detectionMapper;

    @Override
    public int insertEquipmentDetection(Detection equipmentDetection) {
        return detectionMapper.insert(equipmentDetection);
    }

    @Override
    public List<Detection> selectByUserAndDetectTime(int userId, String detectTime) {
        return detectionMapper.selectByUserAndDetectTime(userId, detectTime);
//        return null;
    }

    @Override
    public int updateByPrimaryKey(Detection equipmentDetection) {
        return detectionMapper.updateByPrimaryKey(equipmentDetection);
    }

    @Override
    public int updateByDetection(Detection equipmentDetection) {
        return detectionMapper.updateByDetection(equipmentDetection);
    }

    @Override
    public int deleteByPrimaryKey(String equipmentTime) {
        return 0;
//        return detectionMapper.deleteByPrimaryKey(equipmentTime);
    }

    @Override
    public int deleteByUserAndTime(int userId, String detectTime) {
        return detectionMapper.deleteByUserAndTime(userId,detectTime);
    }

    @Override
    public List<Detection> queryEquipmentByUser(int userId) {
        return detectionMapper.selectByUserId(userId);
    }
}
