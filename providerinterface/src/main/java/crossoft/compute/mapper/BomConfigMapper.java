package crossoft.compute.mapper;

import crossoft.compute.bean.BomBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Snow on 8/3/2017.
 */
@Repository("bomConfigMapper")
public interface BomConfigMapper {

    public List<BomBean> bomListByBom(Object name);

    public void addBom(BomBean bean);
}
