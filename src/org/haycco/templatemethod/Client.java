/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   ģ�巽��ģʽ(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����3:40:45   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:�ͻ���ʼʹ�����ģ��
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // �ͻ�����H1�ͺţ���ȥ������
        HummerModel h1 = new HummerH1Model();
        h1.run(); // �����������ˣ�
        System.out.println("---------------�����ķָ���---------------");

        // �ͻ���H2�ͺţ���ȥ��ˣ��
        HummerModel h2 = new HummerH2Model();
        h2.run();
        System.out.println("---------------�����ķָ���---------------");

        // �ͻ�����H1�ͺţ���ȥ������
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarm(true);
        hummerH1Model.run(); // �����������ˣ�
    }

}
