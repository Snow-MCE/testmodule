package com.crossoft.service;

import com.crossoft.domain.BomBean;
import com.crossoft.domain.BomComponentBean;
import com.crossoft.mapper.BomConfigMapper;
import com.crossoft.util.JsonConvertUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Snow on 8/8/2017.
 */
@Repository("bomConfigService")
public class BomConfigService {

    @Autowired
    BomConfigMapper bomConfigMapper;

    public List<BomBean> bomListByBom(Map map) {

        return bomConfigMapper.bomListByBom(map);
    }

    public void addBomData(String param){
        JsonConvertUtil util = new JsonConvertUtil();
        BomBean bomBean = null;
        Object obj = null;
        try {
            obj  = util.jsonToBean( param, BomBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bomBean = (BomBean) obj;
        bomConfigMapper.addBom(bomBean);
    }

    public void deleteBom(String bomQuid) {
        bomConfigMapper.delteBom(bomQuid);
    }

    public void updateBom(String param){
        JsonConvertUtil util = new JsonConvertUtil();
        BomBean bomBean = null;
        Object obj = null;
        try {
            obj  = util.jsonToBean( param, BomBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bomBean = (BomBean) obj;
        bomConfigMapper.updateBom(bomBean);
    }

    public void addComponent(String param) {
        JsonConvertUtil util = new JsonConvertUtil();
        BomComponentBean componentBean = null;
        Object obj = null;
        try {
            obj  = util.jsonToBean( param, BomComponentBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        componentBean = (BomComponentBean) obj;
        bomConfigMapper.addBomComponent(componentBean);
    }

    public void updateComponent(String param) {
        JsonConvertUtil util = new JsonConvertUtil();
        BomComponentBean componentBean = null;
        Object obj = null;
        try {
            obj  = util.jsonToBean( param, BomComponentBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        componentBean = (BomComponentBean) obj;
        bomConfigMapper.updateBomComponent(componentBean);
    }

    public void deleteComponent(String bomComponentId){
        BomComponentBean componentBean = new BomComponentBean();
        componentBean.setId( bomComponentId );
        bomConfigMapper.deleteBomComponent(componentBean);
    }

    public void reDisBomComp(String param){

        JSONObject jsonObj = JSONObject.fromObject(param);

        Map map = new HashMap<String,String>();
        map.put("newId", jsonObj.getString("newId") );
        map.put("newBomFk", jsonObj.getString("newBomFk") );
        map.put("sourceId", jsonObj.getString("sourceId") );

        bomConfigMapper.reDistributeBomComponent(map);
    }

    // 根据物料清单的名字或物料的名字 获得物料组件清单LIST
    public List<BomComponentBean> getBomComponent(Map map){
        List list = bomConfigMapper.bomComponentList(map);
        return list;
    }
}
