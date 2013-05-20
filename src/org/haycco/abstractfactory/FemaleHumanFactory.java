package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 下午5:37:33
 * @since JDK_1.5.0
 * 女性创建工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    
    // 创建一个女性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    // 创建一个女性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    // 创建一个女性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
    
}
