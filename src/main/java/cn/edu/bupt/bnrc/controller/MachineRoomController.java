package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.impl.EquipmentServiceImpl;
import cn.edu.bupt.bnrc.service.impl.MachineRoomServiceImpl;
import cn.edu.bupt.bnrc.service.impl.UserServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
import cn.edu.bupt.bnrc.service.interfaces.MachineRoomService;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.ConsoleHandler;

@Controller
@RequestMapping("/machineRoom")
public class MachineRoomController {
    @Autowired
    private MachineRoomService machineRoomService = new MachineRoomServiceImpl();

    @Autowired
    private EquipmentService equipmentService = new EquipmentServiceImpl();

    @Autowired
    private UserService userService = new UserServiceImpl();



    @RequestMapping("/queryAllRoomsAndCabinet")
    @ResponseBody
    @CrossOrigin
    public Map<String, Object> queryAllRoomsAndCabinet(HttpServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userName = request.getParameter("user_name");
        int userId = userService.selectUseridByUsername(userName);
        List<Machineroom> machineroomList = machineRoomService.queryAllRooms(userId);
        List machineroomIdList = machineRoomService.queryAllRoomIds(userId);
//        System.out.println(machineroomIdList.get(0));
//        List list = new ArrayList<>();
//        list.add("001");
//        list.add("002");
        List<Equipment> equipmentList = equipmentService.queryByRoomIds(machineroomIdList);
        result.put("machineroomList",machineroomList);
        result.put("equipmentList",equipmentList);
//        System.out.println(equipmentList.get(0));
        return result;
    }

    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public Map<String, String> insertRoom(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        Map<String,String[]> room = request.getParameterMap();
        System.out.println("--------"+room.entrySet().toString());
//        System.out.println("-------"+room.get("equipValue[equipId]")[0]);
//        String mrId = room.get("machineRoom[mrId]")[0];
        int mrId = 0;
        String mrName = room.get("machineRoom[mrName]")[0];
        String mrLocation = room.get("machineRoom[mrLocation]")[0];
        String mrLength = room.get("machineRoom[mrLength]")[0];
        String mrWidth = room.get("machineRoom[mrWidth]")[0];
        String mrHeight = room.get("machineRoom[mrHeight]")[0];
        int userId = Integer.parseInt(room.get("machineRoom[userId]")[0]);
        String mrPicture = "";
        String mrModel = "";
        String mrRemark = "";
        String mrExtra = "";

        Machineroom machineroom = new Machineroom(mrId, userId, mrName, mrLength, mrWidth, mrHeight, mrPicture, mrModel, mrLocation, mrRemark, mrExtra);
        System.out.println(machineroom.toString());
        String key = "result";
        String value ;
        Machineroom m = machineRoomService.selectByRoomname(mrName);

        if(m == null){
            try{
                machineRoomService.insertRoom(machineroom);
                value = "添加成功";
            }catch (Exception e){
                value = "插入失败";
            }
        }else{
            value = "该机房已存在";
        }
        map.put(key,value);
        return map;
    }
}
