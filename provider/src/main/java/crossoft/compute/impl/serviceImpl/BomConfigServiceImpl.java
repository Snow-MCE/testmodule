package crossoft.compute.impl.serviceImpl;

import crossoft.compute.api.BomConfigService;
import crossoft.compute.bean.BomBean;
import crossoft.compute.impl.controller.BomConfigController;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Snow on 8/4/2017.
 */
@Component
public class BomConfigServiceImpl implements BomConfigService {

    @Resource
    private BomConfigController bomConfigController;

    @Override
    public List<BomBean> bomList(String bomName) {
        return bomConfigController.bomListByBom(bomName);
    }

    @Override
    public void addBomData(BomBean bomBean) {
        bomConfigController.addBomData();
    }

    @Override
    public String retString() {
        return "执行成功";
    }

}
