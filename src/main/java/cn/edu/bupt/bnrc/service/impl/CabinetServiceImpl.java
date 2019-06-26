package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.CabinetMapper;
import cn.edu.bupt.bnrc.service.interfaces.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService {
    @Autowired
    private CabinetMapper cabinetMapper;
    @Override
    public int getIdByRoomidAndCabname(int roomId, String cabName) {
        return cabinetMapper.getIdByRoomidAndCabname(roomId,cabName);
    }
    @Override
    public List queryCabinetMap() {
        return cabinetMapper.queryCabinetMap();
    }
}
