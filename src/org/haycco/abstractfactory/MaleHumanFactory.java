package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 下午5:33:58
 * @since JDK_1.5.0
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    // 创建一个男性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    // 创建一个男性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    // 创建一个男性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

}
