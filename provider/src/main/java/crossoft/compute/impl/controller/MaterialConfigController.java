package crossoft.compute.impl.controller;

import crossoft.compute.bean.MaterialBean;
import crossoft.compute.mapper.MaterialConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Snow on 8/4/2017.
 */
@Controller
public class MaterialConfigController {

    @Autowired
    MaterialConfigMapper materialConfigMapper;

    public void addMaterial(){
        MaterialBean materialBean = new MaterialBean();
        materialBean.setQuid("BOM002,TEST,A");
        materialBean.setCurVersion("Y");
        materialBean.setId("BOM002");
        materialBean.setLotSize(new BigDecimal(1));
        materialBean.setMemo("测试物料");
        materialBean.setBomFk("BOM,TEST,ITEM001");
        materialBean.setName("测试用物料BOM001");
        materialBean.setPlant("TEST");
        materialBean.setStatusFk("NEW");
        materialBean.setMatTypeFk("ORDER");
        materialBean.setVersion("A");
        materialBean.setMeasureUnit("ZHI");
        materialConfigMapper.addMaterial(materialBean);
    }

    public List<MaterialBean> getMaterialList(){
        List list = materialConfigMapper.materialListById("BOM002");
        return list;
    }

    public void updateMaterial(){
        MaterialBean materialBean = new MaterialBean();
        materialBean.setQuid("BOM001,TEST,A");
        materialBean.setCurVersion("N");
        materialBean.setMeasureUnit("KG");
        materialBean.setName("更新物料操作");
        materialBean.setStatusFk("UPDATE");
        materialBean.setMatTypeFk("PRODUCT");
        materialBean.setMaxBinLife(new BigDecimal(12));
        materialBean.setTimeSens("N");
        materialBean.setQtyLimit("10000");
        materialBean.setRouterFk("ROUTER,RT001");
        materialConfigMapper.updateMaterial(materialBean);
    }

    public void deleteMaterial(){
        materialConfigMapper.deleteMaterial("BOM002,TEST,A");
    }

}
