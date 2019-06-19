package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.Detection;
import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.Machineroom;
import cn.edu.bupt.bnrc.service.impl.EquipmentDetectionServiceImpl;
import cn.edu.bupt.bnrc.service.impl.EquipmentServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/equipmentDetection")
public class EquipmentDetectionController {
    @Autowired
    private EquipmentDetectionService equipmentDetectionService = new EquipmentDetectionServiceImpl();
    @Autowired
    private EquipmentService equipmentService = new EquipmentServiceImpl();
    @Autowired
    private UserService userService;
    @Autowired
    private MachineRoomService machineRoomService;
    @Autowired
    private CabinetService cabinetService;

    @RequestMapping("/queryEquipment")
    @ResponseBody
    @CrossOrigin
    public Map<String, List<Detection>> queryEquipment(String userName, String detectTime){
        Map<String, List<Detection>> map = new HashMap<>();
        int userId = userService.selectUseridByUsername(userName);
        List<Detection> equipmentDetection = equipmentDetectionService.selectByUserAndDetectTime(userId,detectTime+"%");
        System.out.println("-----------detectTime"+detectTime);
        System.out.println(equipmentDetection.toString());
        String key = "equipmentDetection";
        map.put(key,equipmentDetection);
        return map;
    }

    @RequestMapping("/editEquipment")
    @ResponseBody
    @CrossOrigin
    public Map<String, String> editEquipment(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        Map<String,String[]> equip = request.getParameterMap();
        System.out.println(equip.entrySet().toString());
//        System.out.println(equip.get("equipValue[equipId]")[0]);
//        int equipId = equip.get("equipValue[equipId]")[0];
        int equipId = 0;
        String equipCabName = equip.get("equipValue[equipCabName]")[0];
        String mrName = equip.get("equipValue[mrName]")[0];
        System.out.println("'''''''mrName"+mrName+" "+equipCabName);
        Machineroom mr = machineRoomService.selectByRoomname(mrName);
        int mrId = mr.getMrId();
        System.out.println("================");
        System.out.println(mrId);
        int equipCabId = cabinetService.getIdByRoomidAndCabname(mrId, equipCabName);


        String equipName = equip.get("equipValue[equipName]")[0];;
        String equipLength = "";
        String equipWidth = "";
        String equipHeight = "";
        String equipBrand = equip.get("equipValue[equipBrand]")[0];
        String equipVersion = equip.get("equipValue[equipVersion]")[0];
        String equipLocation = equip.get("equipValue[equipLocation]")[0];
        String equipPicture = "";
        String equipType = equip.get("equipValue[equipType]")[0];
        String equipRemark = "";
        String equipTime = equip.get("equipValue[detectTime]")[0];
        String userName = equip.get("equipValue[userName]")[0];
        int userId = userService.selectUseridByUsername(userName);
        String equipExtra = "";
        Equipment equipment = new Equipment(equipId, equipCabId, mrId, equipName,
                equipLength, equipWidth, equipHeight, equipBrand, equipVersion, equipLocation, equipPicture, equipType, equipRemark, equipExtra);
        Detection equipmentDetection = new Detection(equipId,userId, equipBrand, equipVersion, equipLocation, equipTime, equipExtra);
        String key = "result";
        String value ;
        Equipment eq = equipmentService.checkExist(mrId, equipCabId, equipName);
        if(eq == null){
            try{
                equipmentService.insertEquipment(equipment);
                equipmentDetectionService.updateByDetection(equipmentDetection);
                value = "true";
            }catch (Exception e){
                value = "修改失败";
            }
        }else {
            try{
                equipmentService.updateEquipment(equipment);
                equipmentDetectionService.updateByDetection(equipmentDetection);
                value = "true";
            }catch (Exception e){
                value = "修改失败";
            }
        }

//        System.out.println(equipValue);

        map.put(key,value);
        return map;
    }

    @RequestMapping("/deleteEquipment")
    @ResponseBody
    @CrossOrigin
    public Map<String, String> deleteEquipment(String userName, String detectTime){
        System.out.println("---------------delete"+userName+" "+detectTime);
        int userId = userService.selectUseridByUsername(userName);
        Map<String,String> map = new HashMap<>();
        String key = "result";
        String value ;
        try {
            equipmentDetectionService.deleteByUserAndTime(userId,detectTime);
            value = "true";
        }catch (Exception e){
            value = "false";
        }
        map.put(key,value);
        return map;
    }

    @RequestMapping("/queryEquipmentByUser")
    @ResponseBody
    @CrossOrigin
    public Map<String, List<Detection>> queryEquipmentByUser(String userName){
        int userId = userService.selectUseridByUsername(userName);
        Map<String,List<Detection>> map = new HashMap<>();
        String key = "equipmentDetectionList";
        List<Detection> equipmentDetectionList = equipmentDetectionService.queryEquipmentByUser(userId);
        map.put(key,equipmentDetectionList);
        return map;
    }
}
