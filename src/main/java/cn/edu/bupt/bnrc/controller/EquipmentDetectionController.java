package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.dao.EquipmentDetectionMapper;
import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import cn.edu.bupt.bnrc.service.impl.EquipmentDetectionServiceImpl;
import cn.edu.bupt.bnrc.service.impl.EquipmentServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentDetectionService;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
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

    @RequestMapping("/queryEquipment")
    @ResponseBody
    @CrossOrigin
    public Map<String, EquipmentDetection> queryEquipment(String equipTime){
        Map<String,EquipmentDetection> map = new HashMap<>();
        EquipmentDetection equipmentDetection = equipmentDetectionService.selectByPrimaryKey(equipTime);
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
        System.out.println(equip.get("equipValue[equipId]")[0]);
        String equipId = equip.get("equipValue[equipId]")[0];
        String equipCabId = equip.get("equipValue[equipCabId]")[0];
        String mrId = equip.get("equipValue[mrId]")[0];
        String equipName = "";
        String equipLength = "";
        String equipWidth = "";
        String equipHeight = "";
        String equipBrand = equip.get("equipValue[equipBrand]")[0];
        String equipVersion = equip.get("equipValue[equipVersion]")[0];
        String equipLocation = equip.get("equipValue[equipLocation]")[0];
        String equipPicture = "";
        String equipType = equip.get("equipValue[equipType]")[0];
        String equipRemark = "";
        String equipTime = equip.get("equipValue[equipTime]")[0];
        String userId = equip.get("equipValue[userId]")[0];
        Equipment equipment = new Equipment(equipId, equipCabId, mrId, equipName,
                equipLength, equipWidth, equipHeight, equipBrand, equipVersion, equipLocation, equipPicture, equipType, equipRemark);
        EquipmentDetection equipmentDetection = new EquipmentDetection(equipTime,userId, equipBrand, equipVersion, equipLocation);
        Equipment result = equipmentService.selectByEquipmentId(equipId);
        String key = "result";
        String value ;
        try{
            if(result == null){
                equipmentService.insertEquipment(equipment);
            }else{
                equipmentService.updateEquipment(equipment);
            }
            equipmentDetectionService.updateByPrimaryKey(equipmentDetection);
            value = "true";
        }catch (Exception e){
            value = "false";
        }

//        System.out.println(equipValue);

        map.put(key,value);
        return map;
    }

    @RequestMapping("/deleteEquipment")
    @ResponseBody
    @CrossOrigin
    public Map<String, String> editEquipment(String equipTime){
        Map<String,String> map = new HashMap<>();
        String key = "result";
        String value ;
        try {
            equipmentDetectionService.deleteByPrimaryKey(equipTime);
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
    public Map<String, List<EquipmentDetection>> queryEquipmentByUser(String userId){
        Map<String,List<EquipmentDetection>> map = new HashMap<>();
        String key = "equipmentDetectionList";
        List<EquipmentDetection> equipmentDetectionList = equipmentDetectionService.queryEquipmentByUser(userId);
        map.put(key,equipmentDetectionList);
        return map;
    }
}
