package org.haycco.command;

/**
 * Description: �������ְ������Ƴ�һ��Ư�����򵥡���ݵĽ���
 * 
 * @author haycco
 */
public class PageGroup extends Group {

    // �������������Ӧ�ñ��ҵ��ɣ�Ҫ�����˭̸��
    public void find() {
        System.out.println("�ҵ�������...");
    }

    // ������Ҫ������һ��ҳ��
    public void add() {
        System.out.println("�ͻ�Ҫ������һ��ҳ��...");
    }

    // �ͻ�Ҫ������н������޸�
    public void change() {
        System.out.println("�ͻ�Ҫ���޸�һ��ҳ��...");
    }

    // �׷����ϴ�Ҫ��ɾ��һЩҳ��
    public void delete() {
        System.out.println("�ͻ�Ҫ��ɾ��һ��ҳ��...");
    }

    // ���е���ɾ����Ҫ�����ƻ�ѽ
    public void plan() {
        System.out.println("�ͻ�Ҫ��ҳ�����ƻ�...");
    }

}
