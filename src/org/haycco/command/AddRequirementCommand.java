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
