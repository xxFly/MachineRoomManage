package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.Machineroom;

import java.util.List;

public interface EquipmentService {
    int insertEquipment(Equipment equipment);

    int deleteEquipmentById(String equipId);

    int updateEquipment(Equipment equipment);

    Equipment selectByEquipmentId(String equipmentId);

    List<Equipment> queryByRoomIds(List machineRoomIdList);
}
