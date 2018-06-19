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
