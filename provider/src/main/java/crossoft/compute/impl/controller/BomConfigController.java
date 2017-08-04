package crossoft.compute.impl.controller;

import crossoft.compute.bean.BomBean;
import crossoft.compute.mapper.BomConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

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

}
