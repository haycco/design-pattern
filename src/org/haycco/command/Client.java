/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:29:30   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: �ͻ����Ǽ׷���������Ǯ��һ�������ϴ�
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // �������ǵĽ�ͷ��
        Invoker xiaoSan = new Invoker(); // ��ͷ�˾�����С��
        // �ͻ�Ҫ������һ������
        System.out.println("-------------�ͻ�Ҫ������һ������-----------------");
        // �ͻ���������������
//        Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        // ��ͷ�˽��յ�����
        xiaoSan.setCommand(command);
        // ��ͷ��ִ������
        xiaoSan.action();
    }

}
