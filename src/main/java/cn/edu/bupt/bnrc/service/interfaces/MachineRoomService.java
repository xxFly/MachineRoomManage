package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.pojo.User;

import java.util.List;

public interface MachineRoomService {
    int insertRoom(Machineroom machineroom);


    int updateRoom(Machineroom machineroom);

    Machineroom selectByRoom(Machineroom machineroom);

    List<Machineroom> queryAllRooms(String userId);

    List<String> queryAllRoomIds(String userId);

}
