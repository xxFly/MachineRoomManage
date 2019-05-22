package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import cn.edu.bupt.bnrc.service.impl.EquipmentServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService = new EquipmentServiceImpl();

    @RequestMapping("/edit")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> editEquipment(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        Map<String,String[]> equip = request.getParameterMap();
        System.out.println(equip.entrySet().toString());
        System.out.println("-------"+equip.get("equipValue[equipId]")[0]);
        String equipId = equip.get("equipValue[equipId]")[0];
        String equipCabId = equip.get("equipValue[equipCabId]")[0];
        String mrId = equip.get("equipValue[mrId]")[0];
        String equipName = equip.get("equipValue[equipName]")[0];
        String equipLength = "";
        String equipWidth = "";
        String equipHeight = "";
        String equipBrand = equip.get("equipValue[equipBrand]")[0];
        String equipVersion = equip.get("equipValue[equipVersion]")[0];
        String equipLocation = equip.get("equipValue[equipLocation]")[0];
        String equipPicture = "";
        String equipType = equip.get("equipValue[equipType]")[0];
        String equipRemark = "";
//        String equipTime = equip.get("equipValue[equipTime]")[0];
//        String userId = equip.get("equipValue[userId]")[0];
        Equipment equipment = new Equipment(equipId, equipCabId, mrId, equipName,
                equipLength, equipWidth, equipHeight, equipBrand, equipVersion, equipLocation, equipPicture, equipType, equipRemark);
        String key = "result";
        String value ;
        try{
            equipmentService.updateEquipment(equipment);
            value = "true";
        }catch (Exception e){
            value = "false";
        }
        map.put(key,value);
        return map;
    }

    @RequestMapping("/delete")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> deleteEquipment(String deviceId){
        Map<String,String> map = new HashMap<>();
        System.out.println("-----------"+deviceId);
        String key = "result";
        String value ;
        try{
            equipmentService.deleteEquipmentById(deviceId);
            value = "true";
        }catch (Exception e){
            value = "false";
        }
        map.put(key,value);
        return map;
    }

    @RequestMapping("/add")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> addEquipment(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        Map<String,String[]> equip = request.getParameterMap();
        System.out.println(equip.entrySet().toString());
        System.out.println("-------"+equip.get("equipValue[equipId]")[0]);
        String equipId = equip.get("equipValue[equipId]")[0];
        String equipCabId = equip.get("equipValue[equipCabId]")[0];
        String mrId = equip.get("equipValue[mrId]")[0];
        String equipName = equip.get("equipValue[equipName]")[0];
        String equipLength = "";
        String equipWidth = "";
        String equipHeight = "";
        String equipBrand = equip.get("equipValue[equipBrand]")[0];
        String equipVersion = equip.get("equipValue[equipVersion]")[0];
        String equipLocation = equip.get("equipValue[equipLocation]")[0];
        String equipPicture = "";
        String equipType = equip.get("equipValue[equipType]")[0];
        String equipRemark = "";
//        String equipTime = equip.get("equipValue[equipTime]")[0];
//        String userId = equip.get("equipValue[userId]")[0];
        Equipment equipment = new Equipment(equipId, equipCabId, mrId, equipName,
                equipLength, equipWidth, equipHeight, equipBrand, equipVersion, equipLocation, equipPicture, equipType, equipRemark);
        String key = "result";
        String value ;
        try{
            equipmentService.insertEquipment(equipment);
            value = "true";
        }catch (Exception e){
            value = "false";
        }
        map.put(key,value);
        return map;
    }
}
