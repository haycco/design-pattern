/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   SortDecorator.java 
 * Comments:                   װ��ģʽ��Decorator Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����3:56:03   
 * Version:                    1.0
 *
 */
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
