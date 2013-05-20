/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Decorator.java 
 * Comments:                   װ��ģʽ��Decorator Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����3:52:50   
 * Version:                    1.0
 *
 */
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
