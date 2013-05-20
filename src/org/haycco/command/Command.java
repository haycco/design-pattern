/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Command.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:35:52   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: ����ĳ����࣬���ǰѿͻ�������������һ��һ���Ķ���
 * 
 * @author haycco
 */
public abstract class Command {
    
    // �������鶼����ã��������ֱ��ʹ��
    protected RequirementGroup rg = new RequirementGroup(); // ������
    protected PageGroup pg = new PageGroup(); // ������
    protected CodeGroup cg = new CodeGroup(); // ������;

    // ֻҪһ����������Ҫ����ʲô����
    public abstract void execute();
    
}
