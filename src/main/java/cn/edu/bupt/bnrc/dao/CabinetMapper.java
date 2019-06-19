package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.Cabinet;
import cn.edu.bupt.bnrc.pojo.CabinetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CabinetMapper {
    int countByExample(CabinetExample example);

    int deleteByExample(CabinetExample example);

    int deleteByPrimaryKey(Integer cabId);

    int insert(Cabinet record);

    int insertSelective(Cabinet record);

    List<Cabinet> selectByExample(CabinetExample example);

    Cabinet selectByPrimaryKey(Integer cabId);

    int updateByExampleSelective(@Param("record") Cabinet record, @Param("example") CabinetExample example);

    int updateByExample(@Param("record") Cabinet record, @Param("example") CabinetExample example);

    int updateByPrimaryKeySelective(Cabinet record);

    int updateByPrimaryKey(Cabinet record);

    int getIdByRoomidAndCabname(@Param("mrId")int mrId, @Param("cabName")String cabName);
}