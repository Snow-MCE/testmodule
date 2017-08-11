package com.crossoft.controller;

import com.crossoft.service.BomConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Snow on 8/3/2017.
 */
@Controller
public class BomConfigController {

    @Autowired
    BomConfigService bomConfigService;

    @RequestMapping("/addBom")
    public void addBomReq() {
        String param = "{\"quid\":\"BOM,TEST,ITEM002\",\"id\":\"ITEM002\",\"adopted\":\"N\",\"bomType\":\"VITRUE\",\"curVersion\":\"Y\",\"plant\":\"TEST\",\"version\":\"B\",\"name\":\"测试新增物料\",\"bomTem\":\"Y\",\"statusFk\":\"新增\",\"dateEffect\":\"2017-10-01 14:30:41\",\"dateExpire\":\"2020-10-08 14:30:41\"}";
        bomConfigService.addBomData(param);
    }

    @RequestMapping("/deleteBom")
    public void deleteBomReq() {
        String quid = "BOM,TEST,ITEM002";
        bomConfigService.deleteBom(quid);
    }

    @RequestMapping("/updateBom")
    public void updateBomReq() {
        String param = "{\"quid\":\"BOM,TEST,ITEM002\",\"id\":\"ITEM002\",\"adopted\":\"Y\",\"bomType\":\"TEST_UP\",\"curVersion\":\"Y\",\"plant\":\"TEST\",\"version\":\"B\",\"name\":\"测试更新物料\",\"bomTem\":\"N\",\"statusFk\":\"更新\",\"dateEffect\":\"2017-10-01 14:30:41\",\"dateExpire\":\"2020-10-08 14:30:41\"}";
        bomConfigService.updateBom(param);
    }

    @RequestMapping("/getBomList")
    public void getBomListReq() {
        Map map = new HashMap();
        map.put("quid","BOM,TEST,ITEM001");
        List list = bomConfigService.bomListByBom(map);
    }

    @RequestMapping("/addBomComponent")
    public void addBomComponentReq() {
        String param = "{\"id\":\"BomComponent,10,ITEM20\",\"sequence\":\"10\",\"assembleOperationFk\":\"OPERATION,TEST,OPER10\",\"bomFk\":\"BOM,TEST,ITEM020\",\"bomComponentType\":\"测试新增\",\"disassembleOperationFk\":\"OPERATION,TEST,OPER20\"," +
                "\"assyDataTypeFk\":\"COM_TEST\",\"maximumNc\":\"34\",\"materialFk\":\"ITEM20,TEST,A\",\"maximumUsage\":\"80\",\"qty\":\"100\",\"assembleAsReq\":\"Y\",\"enabled\":\"Y\",\"useItemDefaults\":\"A\",\"testPart\":\"ITEM0100\"}";
        bomConfigService.addComponent(param);
    }

    @RequestMapping("/updateBomComp")
    public void updateBomCompReq() {
        String param = "{\"id\":\"BomComponent,10,ITEM20\",\"sequence\":\"10\",\"assembleOperationFk\":\"OPERATION,TEST,OPER10\",\"bomFk\":\"BOM,TEST,ITEM020\",\"bomComponentType\":\"测试更新\",\"disassembleOperationFk\":\"OPERATION,TEST,OPER110\"," +
                "\"assyDataTypeFk\":\"COM_TEST_UP\",\"maximumNc\":\"40\",\"materialFk\":\"ITEM20,TEST,A\",\"maximumUsage\":\"80\",\"qty\":\"100\",\"assembleAsReq\":\"Y\",\"enabled\":\"Y\",\"useItemDefaults\":\"A\",\"testPart\":\"ITEM0100\"}";
        bomConfigService.updateComponent(param);
    }

    @RequestMapping("/deleteBomComponent")
    public void deleteBomComponentReq() {
        String param = "BomComponent,60,ITEM001";
        bomConfigService.deleteComponent(param);
    }

    @RequestMapping("/reDistBomComp")
    public void reDistBomCompReq() {
        String param = "{\"newId\":\"BomComponent,50,ITEM003\",\"newBomFk\":\"BOM,TEST,ITEM003\",\"sourceId\":\"BomComponent,50,ITEM002\"}";
        bomConfigService.reDisBomComp(param);
    }

    /*
    * Key = bomFk,materialFk
    * 根据物料或物料清单查询组件
    */
    @RequestMapping("/getBomComponent")
    public void getBomComponentReq() {
        Map map = new HashMap();
        map.put("bomFk","BOM,TEST,ITEM001");
        List list = bomConfigService.getBomComponent(map);
    }

}
