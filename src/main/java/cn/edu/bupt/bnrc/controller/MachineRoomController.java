package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.impl.EquipmentServiceImpl;
import cn.edu.bupt.bnrc.service.impl.MachineRoomServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
import cn.edu.bupt.bnrc.service.interfaces.MachineRoomService;
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



    @RequestMapping("/queryAllRoomsAndCabinet")
    @ResponseBody
    @CrossOrigin
    public Map<String, Object> login(HttpServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = request.getParameter("user_id");
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
}
