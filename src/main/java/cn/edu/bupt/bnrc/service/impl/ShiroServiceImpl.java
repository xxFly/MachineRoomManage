package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.ShiroDao;
import cn.edu.bupt.bnrc.pojo.Permission;
import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.interfaces.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
@Service("shiroService")
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private ShiroDao shiroDao;

    public User getUserByUserName(String username) {
        //根据账号获取账号密码
        User userByUserName = shiroDao.getUserByUserName(username);
        return userByUserName;
    }

    public List<Permission> getPermissionsByUser(User user) {
        //获取到用户角色userRole
        List<String> roleId = shiroDao.getUserRoleByUserId(user.getUserId());
        List<Permission> perArrary = new ArrayList<Permission>();

        if (roleId!=null&&roleId.size()!=0) {
            //根据roleid获取peimission
            for (String i : roleId) {
                perArrary.addAll(shiroDao.getPermissionsByRoleId(i));
            }
        }

        System.out.println(perArrary);
        return perArrary;
    }


}
