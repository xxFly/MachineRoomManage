package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.Machineroom;

import java.util.List;

public interface EquipmentService {
    int insertEquipment(Equipment equipment);

    int deleteEquipmentById(int equipmentId);

    int updateEquipment(Equipment equipment);

    Equipment selectByEquipmentId(int equipmentId);

    List<Equipment> queryByRoomIds(List machineRoomIdList);

    Equipment checkExist(int mrId, int cabId, String equipName);
}
