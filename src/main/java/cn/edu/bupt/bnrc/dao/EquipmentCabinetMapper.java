package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.EquipmentCabinet;
import cn.edu.bupt.bnrc.pojo.EquipmentCabinetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentCabinetMapper {
    int countByExample(EquipmentCabinetExample example);

    int deleteByExample(EquipmentCabinetExample example);

    int deleteByPrimaryKey(String equipCabId);

    int insert(EquipmentCabinet record);

    int insertSelective(EquipmentCabinet record);

    List<EquipmentCabinet> selectByExample(EquipmentCabinetExample example);

    EquipmentCabinet selectByPrimaryKey(String equipCabId);

    int updateByExampleSelective(@Param("record") EquipmentCabinet record, @Param("example") EquipmentCabinetExample example);

    int updateByExample(@Param("record") EquipmentCabinet record, @Param("example") EquipmentCabinetExample example);

    int updateByPrimaryKeySelective(EquipmentCabinet record);

    int updateByPrimaryKey(EquipmentCabinet record);
}