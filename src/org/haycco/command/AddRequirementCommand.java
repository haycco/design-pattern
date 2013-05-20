/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   AddRequirementCommand.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:38:09   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: ����һ������
 * 
 * @author haycco
 */
public class AddRequirementCommand extends Command {

    // ִ������һ�����������
    public void execute() {
        // �ҵ�������
        super.rg.find();
        // ����һ������
        super.rg.add();
        // ҳ��ҲҪ����
        super.pg.add();
        // ����ҲҪ����
        super.cg.add();
        // �����ƻ�
        super.rg.plan();
    }
}
