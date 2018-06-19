package org.haycco.decorator;

/**
 * Description: װ���࣬��Ҫ���ҵĳɼ���װ��һ��
 * 
 * @author haycco
 */
public abstract class Decorator extends SchoolReport {

    // ������Ҫ֪�����Ǹ��ɼ���
    private SchoolReport sr;

    // ���캯�������ݳɼ�������
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    // �ɼ�������Ҫ��������
    public void report() {
        this.sr.report();
    }

    // ����ϻ���Ҫǩ����
    public void sign(String name) {
        this.sr.sign(name);
    }

}
