package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.EquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    int countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(String equipId);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);

    Equipment selectByPrimaryKey(String equipId);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);

    List<Equipment> queryByRoomIds(List machineRoomIdList);
}