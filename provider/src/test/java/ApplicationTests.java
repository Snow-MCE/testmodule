import com.crossoft.Application;
import com.crossoft.service.BomConfigService;
import com.crossoft.service.MaterialConfigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

    @Autowired
    BomConfigService bomConfigService;
    @Autowired
    MaterialConfigService materialConfigService;

    @Test
    public void addBomTest(){
        String param = "{\"Quid\":\"BOM,TEST,ITEM002\",\"Id\":\"ITEM002\",\"Adopted\":\"N\",\"BomType\":\"VITRUE\",\"CurVersion\":\"Y\",\"Plant\":\"TEST\",\"Version\":\"B\",\"Name\":\"测试新增物料\",\"BomTem\":\"Y\",\"StatusFk\":\"新增\",\"DateEffect\":\"2017-10-01 14:30:41\",\"DateExpire\":\"2020-10-08 14:30:41\"}";

        bomConfigService.addBomData(param);
        System.out.println("新增 BOM 测试");
    }

    @Test
    public void updateBomTest(){
        String param = "{\"Quid\":\"BOM,TEST,ITEM002\",\"Id\":\"ITEM002\",\"Adopted\":\"Y\",\"BomType\":\"TEST_UP\",\"CurVersion\":\"Y\",\"Plant\":\"TEST\",\"Version\":\"B\",\"Name\":\"测试更新物料\",\"BomTem\":\"N\",\"StatusFk\":\"更新\",\"DateEffect\":\"2017-10-01 14:30:41\",\"DateExpire\":\"2020-10-08 14:30:41\"}";
        bomConfigService.updateBom(param);
        System.out.println("更新 BOM 测试");
    }

    @Test
    public void deleteBomTest(){
        String quid = "BOM,TEST,ITEM002";
        bomConfigService.deleteBom(quid);
        System.out.println("删除 BOM 测试");
    }

    @Test
    public void getBomDataTest(){
        Map map = new HashMap<String,String>();
        map.put("id","ITEM");
        List list = bomConfigService.bomListByBom(map);
        if( list.size()>0 ){
            Object obj = list.get(0);
        }
        System.out.println("查询 BOM 测试");
    }

    @Test
    public void addBomComDataTest(){
        String param = "{\"id\":\"BomComponent,10,ITEM20\",\"sequence\":\"10\",\"assembleOperationFk\":\"OPERATION,TEST,OPER10\",\"bomFk\":\"BOM,TEST,ITEM020\",\"bomComponentType\":\"测试新增\",\"disassembleOperationFk\":\"OPERATION,TEST,OPER20\"," +
                "\"assyDataTypeFk\":\"COM_TEST\",\"maximumNc\":\"34\",\"materialFk\":\"ITEM20,TEST,A\",\"maximumUsage\":\"80\",\"qty\":\"100\",\"assembleAsReq\":\"Y\",\"enabled\":\"Y\",\"useItemDefaults\":\"A\",\"testPart\":\"ITEM0100\"}";
        bomConfigService.addComponent(param);
        System.out.println("新增 物料清单组件 测试");
    }

    @Test
    public void updateBomComDataTest(){
        String param = "{\"id\":\"BomComponent,10,ITEM20\",\"sequence\":\"10\",\"assembleOperationFk\":\"OPERATION,TEST,OPER10\",\"bomFk\":\"BOM,TEST,ITEM020\",\"bomComponentType\":\"测试更新\",\"disassembleOperationFk\":\"OPERATION,TEST,OPER20\"," +
                "\"assyDataTypeFk\":\"COM_TEST_UP\",\"maximumNc\":\"50\",\"maximumUsage\":\"100\",\"qty\":\"100\",\"assembleAsReq\":\"Y\"}";
        bomConfigService.updateComponent(param);
        System.out.println("更新 物料清单组件 测试");
    }

    @Test
    public void addMaterialTest(){
        String param = "{\"quid\":\"BOM002,TEST,B\",\"curVersion\":\"N\",\"id\":\"BOM002\",\"memo\":\"新建测试物料\",\"bomFk\":\"BOM,TEST,ITEM002\",\"name\":\"PROITEM0010\",\"plant\":\"TEST\",\"statusFk\":\"NEW\",\"matTypeFk\":\"PROCRE\",\"version\":\"B\",\"measureUnit\":\"KL\",\"lotSize\":\"99\"}";
        materialConfigService.addMaterialData(param);
        System.out.println("新增 物料 测试");
    }

    @Test
    public void updateMaterialTest(){
        String param = "{\"quid\":\"BOM002,TEST,B\",\"curVersion\":\"N\",\"id\":\"BOM002\",\"memo\":\"更新测试物料\",\"bomFk\":\"BOM,TEST,ITEM002\",\"name\":\"PROITEM0010\"," +
                "\"plant\":\"TEST\",\"statusFk\":\"UP\",\"matTypeFk\":\"PRO\",\"version\":\"B\",\"measureUnit\":\"L\",\"lotSize\":\"99\"}";
        materialConfigService.updateMaterial(param);
        System.out.println("更新 物料 测试");
    }

    @Test
    public void getMaterialListTest(){
        Map map = new HashMap<String,String>();
        map.put("id","002");
        List list = materialConfigService.getMaterialList(map);
        if( list.size() > 0 ){
            Object obj = list.get(0);
        }
        System.out.println("查询 物料 测试");
    }

    @Test
    public void callMaterialProcedure(){
        Map map = new HashMap<String,String>();
        map.put("id","BOM002");
        materialConfigService.callMaterialProcedure(map);
        int idCount = (Integer) map.get("idCount");
        if( idCount>0 ){
            System.out.println("调用存储过程成功");
        }
    }

}
