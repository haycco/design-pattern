/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   DeletePageCommand.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:39:55   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: ɾ��һ��ҳ�������
 * 
 * @author haycco
 */
public class DeletePageCommand extends Command {

    // ִ��ɾ��һ��ҳ�������
    public void execute() {
        // �ҵ�ҳ����
        super.pg.find();
        // ɾ��һ��ҳ��
        super.rg.delete();
        // �����ƻ�
        super.rg.plan();
    }

}
