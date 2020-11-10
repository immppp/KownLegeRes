package cn.imppp.knowlege.repository.hideEvent;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class HideEventRepository {

    private String str313 =
            "       A级：全面罩正压空气呼吸器、全封闭气密化学防护服、防护手套、防护靴、安全帽。\n" +
            "       用途：防护高蒸气压。可经皮肤或致癌和高毒性化学物；可能发生高浓度液体泼溅、接触、浸润和蒸汽暴露，接触未知化学物。\n" +
            "       B级：全面罩正压空气呼吸器、头罩式化学防护服、防护手套、防护靴、安全帽。\n" +
            "       C级：空气过滤式呼吸防护用品、头罩式化学防护服、防护手套、防护靴。\n" +
            "       D级：衣裤相连的工作服或其它普通工作服、靴子及手套。";
    private String str317 =
            "       医用工作帽、医用工作服/隔离衣、医用外科口罩、医用乳胶手套。";
    private String str318 =
            "       杜邦连体防护服、医用防护口罩（3M1860）、防护眼罩/面罩、医用乳胶手套、防护鞋。";
    private String str319 =
            "       杜邦连体防护服、正压呼吸面罩、医用乳胶手套、防护鞋。\n" +
            "使用说明：\n" +
            "       1.穿戴防护用品顺序\n" +
            "       戴口罩->>戴帽子->>穿防护服->>戴上防护眼罩/面罩->>穿上防护鞋->>戴上手套，将手套套在防护服袖口外面。\n" +
            "       2.脱掉防护用品顺序\n" +
            "       摘下防护眼罩/面罩，放入消毒液->解防护服->摘掉手套，将里面朝外，放入黄色塑料袋中脱掉防护服，将里面朝外，放入污物袋中将手指反掏进帽子，将帽子轻轻摘下，里面朝外，放入黄色塑料袋或污物袋中脱下防护鞋，放入黄色塑料袋中，将胶鞋放入消毒液中    洗手、消毒     在确定的安全空间摘口罩，一只手按住口罩，另一只手将口罩带摘下，放入黄色塑料袋中，注意双手不接触面部。注意每个步骤间的手消毒。";
    private String str320 =
            "       医用工作帽、医用工作服/隔离衣、一次性医用口罩、医用乳胶手套。";
    private String str321 =
            "1、穿戴防护用品顺序\n" +
            "       戴工作帽子->>穿工作服/隔离服->>戴口罩->>戴上手套，将手套套在一次性隔离服袖口外面。\n" +
            "2、脱防护用品顺序\n" +
            "       解开一次性隔离服摘掉手套，将里面朝外，放入污物袋中脱掉一次性隔离服，将里面朝外，放入污衣袋中将手指反掏进帽子，将帽子轻轻摘下，里面朝外，放入污物袋中    摘口罩，一只手按住口罩，另一只手将口罩带摘下，放入污物袋中，注意双手不接触面部脱下防护鞋，放入污物袋中洗手、消毒。注意每个步骤间的手消毒。";
    private String str316 =
            "       （一）帐篷：工作帐篷、生活帐篷、厕所帐篷；\n" +
            "       （二）饮用水及净化设备；\n" +
            "       （三）食品；\n" +
            "       （四）日常生活用品：水壶、一次性筷子和饭盒、洗漱用品、N条短裤和文化衫、防潮垫等；\n" +
            "       （五）个人卫生用品：酒精棉球、湿纸巾、手消毒剂、护手霜、风油精、创口贴及防治药品；\n" +
            "       （六）工具设备：剪刀、斧子、铁丝、尼龙绳、折叠梯等；\n" +
            "       （七）消杀用品：三氯异氰尿酸泡腾片、漂精片、乙醇类快速手消毒液和碘伏制剂、双长链季铵盐类消毒剂等。\n";

    private static final HideEventRepository hide = new HideEventRepository();

    public static HideEventRepository getInstance() {
        return hide;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.HIDDEN_EVENT,
                FileTagEnum.MEI_QI_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.HIDDEN_EVENT,
                FileTagEnum.HU_XI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.HIDDEN_EVENT,
                FileTagEnum.CANG_DAO);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.HIDDEN_EVENT,
                FileTagEnum.XIAN_CHANG);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 314) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.HU_XI,
                    FileTagEnum.HU_XI1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.HU_XI,
                    FileTagEnum.HU_XI2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.HU_XI,
                    FileTagEnum.HU_XI3);
            mList.add(secondLevelEntity);
        } else if (tag == 315) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.CANG_DAO1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.CANG_DAO2);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 313:
                str = str313;
                break;
            case 316:
                str = str316;
                break;
            case 317:
                str = str317;
                break;
            case 318:
                str = str318;
                break;
            case 319:
                str = str319;
                break;
            case 320:
                str = str320;
                break;
            case 321:
                str = str321;
                break;
        }
        return str;
    }
}
