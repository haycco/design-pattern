package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 ����5:37:33
 * @since JDK_1.5.0
 * Ů�Դ�������
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    
    // ����һ��Ů�Ժ�����
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    // ����һ��Ů�԰�����
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    // ����һ��Ů�Ի�����
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
    
}
