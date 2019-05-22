package cn.edu.bupt.bnrc.service.interfaces;

import cn.edu.bupt.bnrc.pojo.User;
import org.springframework.amqp.core.Message;

import java.util.List;

public interface UserService {

    int insertUser(User user);

    int deleteUserById(String id);

    int updateUser(User user);

    User selectByUser(User user);

    List<User> queryAllUser();

    User selectByPrimaryKey(String userId);


}
