package com.crossoft.controller;

import com.crossoft.service.MaterialConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Snow on 8/4/2017.
 */
@Controller
public class MaterialConfigController {

    @Autowired
    MaterialConfigService materialConfigService;

    @RequestMapping("/addMaterial")
    public void addMaterialReq(){
        String param = "{\"quid\":\"BOM002,TEST,B\",\"curVersion\":\"N\",\"id\":\"BOM002\",\"memo\":\"新建测试物料\",\"bomFk\":\"BOM,TEST,ITEM002\",\"name\":\"PROITEM0010\",\"plant\":\"TEST\",\"statusFk\":\"NEW\",\"matTypeFk\":\"PROCRE\",\"version\":\"B\",\"measureUnit\":\"KL\",\"lotSize\":\"99\"}";
        materialConfigService.addMaterialData(param);
    }

    @RequestMapping("/getMaterialList")
    public void getMaterialListReq(){
        Map map = new HashMap<String,String>();
        map.put("id","002");
        List list = materialConfigService.getMaterialList(map);
    }

    @RequestMapping("/updateMaterial")
    public void updateMaterialReq(){
        String param = "{\"quid\":\"BOM002,TEST,B\",\"curVersion\":\"N\",\"id\":\"BOM002\",\"memo\":\"更新测试物料\",\"bomFk\":\"BOM,TEST,ITEM002\",\"name\":\"PROITEM0010\"," +
                "\"plant\":\"TEST\",\"statusFk\":\"UP\",\"matTypeFk\":\"PRO\",\"version\":\"B\",\"measureUnit\":\"L\",\"lotSize\":\"99\"}";
        materialConfigService.updateMaterial(param);
    }

    @RequestMapping("/deleteMaterial")
    public void deleteMaterialReq(){
        String materialId = "BOM001,TEST,A";
        materialConfigService.deleteMaterial(materialId);
    }

}
