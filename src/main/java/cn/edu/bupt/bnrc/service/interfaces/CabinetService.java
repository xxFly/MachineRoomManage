package cn.edu.bupt.bnrc.service.interfaces;

import java.util.List;

public interface CabinetService {
    public int getIdByRoomidAndCabname(int roomId, String cabName);

    List queryCabinetMap();
}
