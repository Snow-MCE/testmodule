package crossoft.compute.impl.controller;

import crossoft.compute.bean.BomBean;
import crossoft.compute.bean.BomComponentBean;
import crossoft.compute.mapper.BomConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Snow on 8/3/2017.
 */
@Controller
public class BomConfigController {

    @Autowired
    BomConfigMapper bomConfigMapper;

    public List<BomBean> bomListByBom(Object name) {
        return bomConfigMapper.bomListByBom("");
    }

    public void addBomData(){
        BomBean bomBean = new BomBean();
        bomBean.setQuid("BOM,TEST,ITEM001");
        bomBean.setId("ITEM001");
        bomBean.setAdopted("N");
        bomBean.setBomType("BOM_SPLIT");
        bomBean.setCurVersion("Y");
        bomBean.setPlant("TEST");
        bomBean.setVersion("A");
        bomBean.setName("function 测试物料");
        bomConfigMapper.addBom(bomBean);
    }

    public void addComponent() {
        BomComponentBean componentBean = new BomComponentBean();
        componentBean.setId("BomComponent,60,ITEM001");
        componentBean.setSequence(new BigDecimal(60));
        componentBean.setAssembleOperationFk("OPERATION,TEST,OPER002");
        componentBean.setBomFk("BOM,TEST,ITEM001");
        componentBean.setBomComponentType("测试");
        componentBean.setDisassembleOperationFk("OPERATION,TEST,OPER008");
        componentBean.setAssyDataTypeFk("BOM_TEST");
        componentBean.setMaximumNc((double) 46);
        componentBean.setMaterialFk("BOM002,TEST,A");
        componentBean.setMaximumUsage(35.876);
        componentBean.setQty( 34.765 );
        componentBean.setAssembleAsReq("Y");
        componentBean.setEnabled("Y");
        componentBean.setUseItemDefaults("A");
        componentBean.setTestPart("ITEM0080");
        bomConfigMapper.addBomComponent(componentBean);
    }

    public void delteComponent(){
        BomComponentBean componentBean = new BomComponentBean();
        componentBean.setId("BomComponent,60,ITEM001");
        bomConfigMapper.deleteBomComponent(componentBean);
    }

    public void reDisBomComp(){
        Map map = new HashMap<String,String>();
        map.put("newId","BomComponent,50,ITEM003");
        map.put("newBomFk","BOM,TEST,ITEM003");
        map.put("sourceId","BomComponent,50,ITEM002");
        bomConfigMapper.reDistributeBomComponent(map);
    }

}
