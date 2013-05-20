package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 ����5:33:58
 * @since JDK_1.5.0
 * ���Դ�������
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    // ����һ�����Ժ�����
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    // ����һ�����԰�����
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    // ����һ�����Ի�����
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

}
