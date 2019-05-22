package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import cn.edu.bupt.bnrc.pojo.EquipmentDetectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentDetectionMapper {
    int countByExample(EquipmentDetectionExample example);

    int deleteByExample(EquipmentDetectionExample example);

    int deleteByPrimaryKey(String equipTime);

    int insert(EquipmentDetection record);

    int insertSelective(EquipmentDetection record);

    List<EquipmentDetection> selectByExample(EquipmentDetectionExample example);

    EquipmentDetection selectByPrimaryKey(String equipTime);

    int updateByExampleSelective(@Param("record") EquipmentDetection record, @Param("example") EquipmentDetectionExample example);

    int updateByExample(@Param("record") EquipmentDetection record, @Param("example") EquipmentDetectionExample example);

    int updateByPrimaryKeySelective(EquipmentDetection record);

    int updateByPrimaryKey(EquipmentDetection record);

    List<EquipmentDetection> selectByUserId (String userId);
}