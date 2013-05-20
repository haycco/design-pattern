/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Invoker.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:45:31   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: ��ͷ�˵�ְ����ǽ��������ִ��
 * 
 * @author haycco
 */
public class Invoker {
    
    // ʲô����
    private Command command;

    // �ͻ���������
    public void setCommand(Command command) {
        this.command = command;
    }

    // ִ�пͻ�������
    public void action() {
        this.command.execute();
    }
    
}
