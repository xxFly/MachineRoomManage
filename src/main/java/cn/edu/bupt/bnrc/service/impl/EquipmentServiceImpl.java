package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.EquipmentMapper;
import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Override
    public int insertEquipment(Equipment equipment) {
        return equipmentMapper.insert(equipment);
    }

    @Override
    public int deleteEquipmentById(String equipId) {
        return equipmentMapper.deleteByPrimaryKey(equipId);
    }

    @Override
    public int updateEquipment(Equipment equipment) {
        return equipmentMapper.updateByPrimaryKey(equipment);
    }

    @Override
    public Equipment selectByEquipmentId(String equipmentId) {
        return equipmentMapper.selectByPrimaryKey(equipmentId);
    }

    //查找某些机房内的设备
    @Override
    public List<Equipment> queryByRoomIds(List machineRoomIdList) {
        return equipmentMapper.queryByRoomIds(machineRoomIdList);
    }

}
