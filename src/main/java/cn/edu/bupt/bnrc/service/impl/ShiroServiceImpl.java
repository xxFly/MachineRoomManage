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
        return shiroDao.getUserByUserName(username);
    }

    public int getUserRoleByUserId(int userId){
        return shiroDao.getUserRoleByUserId(userId);
    }
    public List<Integer> getPermissionIdsByRoleId(int roleId) {
        //获取到用户角色userRole
        List<Integer> permissionIds = new ArrayList<Integer>();
        permissionIds = shiroDao.getPermissionIdsByRoleId(roleId);
//        if (roleId!=null&&roleId.size()!=0) {
//            //根据roleid获取peimission
//            for (String i : roleId) {
//                perArrary.addAll(shiroDao.getPermissionsByRoleId(i));
//            }
//        }

        System.out.println(permissionIds);
        return permissionIds;
    }

    public Permission getPermissionById(int permissionId){
        return shiroDao.getPermissionById(permissionId);
    }


}
