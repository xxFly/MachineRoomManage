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
     * 根据角色id获取该账号的权限
     * @param roleId
     * @return List
     */
    List<Permission> getPermissionsByRoleId(String roleId);

    /**
     * 根据userId获取角色id
     * @param id
     * @return LIST
     */
    List<String> getUserRoleByUserId(String id);

}
