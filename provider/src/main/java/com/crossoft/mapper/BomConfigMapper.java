package com.crossoft.mapper;

import com.crossoft.domain.BomBean;
import com.crossoft.domain.BomComponentBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Snow on 8/3/2017.
 */
@Repository("bomConfigMapper")
public interface BomConfigMapper {
    // 查询物料清单BOM
    List<BomBean> bomListByBom(Map map);

    // 新增物料清单BOM
    void addBom(BomBean bean);

    // 更新物料清单
    void updateBom(BomBean bean);

    // 删除物料清单
    void delteBom(String quid);

    // 查询物料清单组件
    List<BomComponentBean> bomComponentList(Map map);

    // 新增物料清单组件
    void addBomComponent(BomComponentBean bean);

    // 删除物料清单组件
    void deleteBomComponent(BomComponentBean bean);

    // 更新物料清单组件
    void updateBomComponent(BomComponentBean bean);

    // BOM拆分时组件重新分配
    void reDistributeBomComponent(Map map);
}
