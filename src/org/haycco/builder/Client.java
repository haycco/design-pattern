package org.haycco.builder;


/**
 * Description:���տͻ���ʼʹ�����ģ��
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        // 10��A���͵ı��۳�
        for (int i = 0; i < 1; i++) {
            director.getABenzModel().run();
        }
        System.out.println("-------------------�����ķָ���-------------------");
        
        // 20��B���͵ı��۳�
        for (int i = 0; i < 2; i++) {
            director.getBBenzModel().run();
        }
        System.out.println("-------------------�����ķָ���-------------------");
        
        // 30��C���͵ı���
        for (int i = 0; i < 3; i++) {
            director.getCBMWModel().run();
        }
    }

}
