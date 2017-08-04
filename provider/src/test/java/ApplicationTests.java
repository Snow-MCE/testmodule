import crossoft.compute.impl.Application;
import crossoft.compute.impl.controller.BomConfigController;
import crossoft.compute.impl.controller.MaterialConfigController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

    @Resource
    BomConfigController bomConfigController;

    @Resource
    MaterialConfigController materialConfigController;

    @Test
    public void getList() throws Exception {
        List bomList = bomConfigController.bomListByBom("");
        System.out.println("GGHKJJ" + bomList);
    }

    @Test
    public void showString() throws Exception {
        //String utilString = bomConfigController.showString();
        System.out.println("++++++++++++++++++++++++++++");
    }

    @Test
        public void addBomTest() throws Exception {
        bomConfigController.addBomData();
        System.out.println("bom 新增测试");
    }

    @Test
    public void addMaterialTest() throws Exception {
        materialConfigController.addMaterial();
        System.out.println("material 新增测试");
    }

    @Test
    public void getMaterialListTest() throws Exception {
        List list = materialConfigController.getMaterialList();
        System.out.println("material 查询测试");
    }

    @Test
    public void updateMaterialTest() throws Exception {
        materialConfigController.updateMaterial();
        System.out.println("material 更新测试");
    }

    @Test
    public void deleteMaterialTest() throws Exception {
        materialConfigController.deleteMaterial();
        System.out.println("material 删除测试");
    }

}
