package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 ����5:39:49
 * @since JDK_1.5.0
 * Ů洽����������������ߣ��ֱ��ǣ�
 * ����������
 * Ů��������
 */
public class NvWa {

    public static void main(String[] args) {
        // ��һ�������ߣ�����������
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        // �ڶ��������ߣ�Ů��������
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();
        // �����߽�����ϣ���ʼ��������:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
        /*
         * ..... �������������
         */
    }

}
