package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.MachineroomMapper;
import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.service.interfaces.MachineRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineRoomServiceImpl implements MachineRoomService {
    @Autowired
    private MachineroomMapper machineroomMapper ;

    @Override
    public List queryMachineMap() {
        return machineroomMapper.queryMachineMap();
    }



    @Override
    public int insertRoom(Machineroom machineroom) {
        return machineroomMapper.insert(machineroom);
    }


    @Override
    public int updateRoom(Machineroom machineroom) {
        return 0;
    }

    @Override
    public Machineroom selectByRoomname(String mrName) {
        return machineroomMapper.selectByRoomname(mrName);
    }

    @Override
    public List<Machineroom> queryAllRooms(int userId) {
        return machineroomMapper.queryAllRooms(userId);
    }

    @Override
    public List<String> queryAllRoomIds(int userId) {
        return machineroomMapper.queryAllRoomIds(userId);
    }
}
