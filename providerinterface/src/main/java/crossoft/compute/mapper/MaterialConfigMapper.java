package crossoft.compute.mapper;

import crossoft.compute.bean.MaterialBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Snow on 8/4/2017.
 */
@Repository("materialConfigMapper")
public interface MaterialConfigMapper {

    public List<MaterialBean> materialListById(String id);

    public void addMaterial(MaterialBean materialBean);

    public void updateMaterial(MaterialBean materialBean);

    public void deleteMaterial(String quid);
}
