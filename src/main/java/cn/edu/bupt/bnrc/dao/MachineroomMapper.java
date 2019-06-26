package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.pojo.MachineroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineroomMapper {
    int countByExample(MachineroomExample example);

    int deleteByExample(MachineroomExample example);

    int deleteByPrimaryKey(Integer mrId);

    int insert(Machineroom record);

    int insertSelective(Machineroom record);

    List<Machineroom> selectByExample(MachineroomExample example);

    Machineroom selectByPrimaryKey(Integer mrId);

    int updateByExampleSelective(@Param("record") Machineroom record, @Param("example") MachineroomExample example);

    int updateByExample(@Param("record") Machineroom record, @Param("example") MachineroomExample example);

    int updateByPrimaryKeySelective(Machineroom record);

    int updateByPrimaryKey(Machineroom record);

    List<Machineroom> queryAllRooms(int userId);

    List<String> queryAllRoomIds(int userId);

    Machineroom selectByRoomname(String roomName);

    List queryMachineMap();


}