package cn.edu.bupt.bnrc.dao;

import cn.edu.bupt.bnrc.pojo.Permission;
import cn.edu.bupt.bnrc.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Component
public interface ShiroDao {

    /**
     * 根据账号获取账号密码
     * @param username
     * @return UserPojo
     */
    User getUserByUserName(String username);

    /**
     * 根据username获取角色id
     * @param userId
     * @return LIST
     */
    int getUserRoleByUserId(int userId);


    /**
     * 根据角色id获取该账号的权限id
     * @param roleId
     * @return List
     */
    List<Integer> getPermissionIdsByRoleId(int roleId);

    Permission getPermissionById (int permissionIds);

}
