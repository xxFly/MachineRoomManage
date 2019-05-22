package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.EquipmentDetectionMapper;
import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentDetectionServiceImpl implements EquipmentDetectionService {
    @Autowired
    private EquipmentDetectionMapper equipmentDetectionMapper;

    @Override
    public int insertEquipmentDetection(EquipmentDetection equipmentDetection) {
        return equipmentDetectionMapper.insert(equipmentDetection);
    }

    @Override
    public EquipmentDetection selectByPrimaryKey(String equipmentTime) {
        return equipmentDetectionMapper.selectByPrimaryKey(equipmentTime);
    }

    @Override
    public int updateByPrimaryKey(EquipmentDetection equipmentDetection) {
        return equipmentDetectionMapper.updateByPrimaryKey(equipmentDetection);
    }

    @Override
    public int deleteByPrimaryKey(String equipmentTime) {
        return equipmentDetectionMapper.deleteByPrimaryKey(equipmentTime);
    }

    @Override
    public List<EquipmentDetection> queryEquipmentByUser(String userId) {
        return equipmentDetectionMapper.selectByUserId(userId);
    }
}
