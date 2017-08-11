package com.crossoft.exposeService;

import com.crossoft.api.ExposeBomService;
import com.crossoft.domain.BomComponentBean;
import com.crossoft.mapper.BomConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Snow on 8/10/2017.
 */
public class ExposeBomServiceImpl implements ExposeBomService {

    @Autowired
    BomConfigMapper bomConfigMapper;

    @Override
    public void deleteComponent(String bomComponentId) {
        BomComponentBean componentBean = new BomComponentBean();
        componentBean.setId( bomComponentId );
        bomConfigMapper.deleteBomComponent(componentBean);
    }
}
