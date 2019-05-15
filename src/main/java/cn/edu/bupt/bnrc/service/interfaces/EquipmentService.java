package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.EquipmentKey;
import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.pojo.MachineroomKey;

import java.util.List;

public interface EquipmentService {
    int insertEquipment(Equipment equipment);

    int deleteEquipmentById(EquipmentKey key);

    int updateEquipment(Equipment equipment);

    Machineroom selectByEquipment(Equipment equipment);

    List<Equipment> queryByRoomIds(List machineRoomIdList);
}
