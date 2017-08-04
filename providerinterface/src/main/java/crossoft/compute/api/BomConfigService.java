package crossoft.compute.api;

import crossoft.compute.bean.BomBean;

import java.util.List;

/**
 * Created by Snow on 8/4/2017.
 */
public interface BomConfigService {

    public List<BomBean> bomList(String bomName);

    public void addBomData(BomBean bomBean);

    public String retString();
}
