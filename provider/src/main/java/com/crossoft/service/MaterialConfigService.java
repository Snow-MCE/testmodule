package com.crossoft.service;

import com.crossoft.domain.MaterialBean;
import com.crossoft.mapper.MaterialConfigMapper;
import com.crossoft.util.JsonConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Snow on 8/8/2017.
 */
@Repository("materialConfigService")
public class MaterialConfigService {

    @Autowired
    MaterialConfigMapper materialConfigMapper;

    public List getMaterialList(Map map){
        return materialConfigMapper.materialListById(map);
    }

    public void addMaterialData(String param){
        JsonConvertUtil util = new JsonConvertUtil();
        MaterialBean materialBean = null;
        Object obj = null;
        try {
            obj  = util.jsonToBean( param, MaterialBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        materialBean = (MaterialBean) obj;
        materialConfigMapper.addMaterial(materialBean);
    }

    public void updateMaterial(String param){
        JsonConvertUtil util = new JsonConvertUtil();
        MaterialBean materialBean = null;
        Object obj = null;
        try {
            obj  = util.jsonToBean( param, MaterialBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        materialBean = (MaterialBean) obj;
        materialConfigMapper.updateMaterial(materialBean);
    }

    public void deleteMaterial(String materialId){
        materialConfigMapper.deleteMaterial(materialId);
    }

    public void callMaterialProcedure(Map map){
        materialConfigMapper.callMaterialProcedure(map);
    }

}
