package com.crossoft.mapper;

import com.crossoft.domain.MaterialBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Snow on 8/4/2017.
 */
@Repository("materialConfigMapper")
public interface MaterialConfigMapper {

    List<MaterialBean> materialListById(Map map);

    void addMaterial(MaterialBean materialBean);

    void updateMaterial(MaterialBean materialBean);

    void deleteMaterial(String quid);

    void callMaterialProcedure(Map map);
}
