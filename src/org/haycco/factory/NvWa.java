package org.haycco.factory;

/**
 * ����ģʽ
 * 
 * @author haycco 2011-7-27 ����5:34:13
 * @version V1.0
 */
public class NvWa {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Ů洵�һ�����ˣ��������ʣ�����㣬����㣬ȱ�ݲ�Ʒ
        System.out.println("------------����ĵ�һ�����������ģ�����-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        // Ů洵ڶ������ˣ�������㣬Ȼ���ֳ��˸���Ʒ������
        System.out.println("\n------------����ĵڶ������������ģ�����-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        // ���������ˣ���λ�����յ����ã���ɫ���ࣨ��д���ˣ�����������壩����ע��RB�˲����ڴ���
        System.out.println("\n------------����ĵ��������������ģ���ɫ����-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        // Ů洷����ˣ�����ɶ�������ɶ���࣬�հ�
        for (int i = 0; i < 10; i++) {
            System.out.println("\n\n------------�������������-----------------" + i);
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }

}
