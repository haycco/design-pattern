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
