package org.haycco.strategy;

/**
 * ����ģʽ
 * 
 * @author haycco 2011-7-27 ����3:38:03
 * @version V1.0
 */
public class StrategyPattern {

    /**
    * ���Ƴ����ˣ�����������������Ľ��������β����
    */
    public static void main(String[] args) {
        Context context;
        
        //�ոյ������ʱ����һ��
        System.out.println("-----------------�յ������ʱ��,���һ������--------------------\n");
        context = new Context(new BackDoor());//�õ����
        context.operate();//��ִ��
        System.out.println("\n");
        
        //�����ֲ�˼���ˣ���ڶ�����
        System.out.println("-----------------�����ֲ�˼���ˣ���ڶ�������-------------------\n");
        context = new Context(new GivenGreenLight());//�õ����
        context.operate();//ִ���˵ڶ����������
        System.out.println("\n");
        
        //��Ȩ��С��׷�ˣ�զ�죿�������
        System.out.println("-----------------��Ȩ��С��׷�ˣ�զ�죿�����������-------------\n");
        context = new Context(new BlockEnemy());
        context.operate(); //������˱�
        System.out.println("\n");
    }
}
