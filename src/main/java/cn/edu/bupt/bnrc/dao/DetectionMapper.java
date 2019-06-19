package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.Detection;
import cn.edu.bupt.bnrc.pojo.DetectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetectionMapper {
    int countByExample(DetectionExample example);

    int deleteByExample(DetectionExample example);

    int deleteByPrimaryKey(Integer detectId);

    int insert(Detection record);

    int insertSelective(Detection record);

    List<Detection> selectByExample(DetectionExample example);

    Detection selectByPrimaryKey(Integer detectId);

    int updateByExampleSelective(@Param("record") Detection record, @Param("example") DetectionExample example);

    int updateByExample(@Param("record") Detection record, @Param("example") DetectionExample example);

    int updateByPrimaryKeySelective(Detection record);

    int updateByPrimaryKey(Detection record);

    int updateByDetection(Detection record);

    List<Detection> selectByUserAndDetectTime(@Param("userId")int userId,@Param("detectTime")String detectTime);

    List<Detection> selectByUserId (int userId);

    int deleteByUserAndTime(@Param("userId")int userId, @Param("detectTime")String detectTime);
}