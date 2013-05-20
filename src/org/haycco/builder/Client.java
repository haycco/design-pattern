/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:34:41   
 * Version:                    1.0
 *
 */
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
