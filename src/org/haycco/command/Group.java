package org.haycco.command;

/**
 * Description: ��Ŀ��ֳ��������飬ÿ���黹��Ҫ������ɾ�ĵ�����
 * 
 * @author haycco
 */
public abstract class Group {
    
    // ����˫���ֿ��칫����Ҫ���Ǹ������ۣ�������Ҫ�ҵ������
    public abstract void find();

    // ��Ҫ�����ӹ���
    public abstract void add();

    // ��Ҫ��ɾ������
    public abstract void delete();

    // ��Ҫ���޸Ĺ���
    public abstract void change();

    // ��Ҫ��������еı���ƻ�
    public abstract void plan();
    
}
