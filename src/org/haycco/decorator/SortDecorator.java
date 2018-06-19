package org.haycco.decorator;

/**
 * Description: ѧУ����������㱨
 * 
 * @author haycco
 */
public class SortDecorator extends Decorator {
    
    // ���캯��
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    // �����ϰ�ѧУ���������
    private void reportSort() {
        System.out.println("����������38��...");
    }

    // �ϰֿ���ɼ������ٸ���������ǿ����
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
    
}
