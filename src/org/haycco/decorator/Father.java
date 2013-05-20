/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Father.java 
 * Comments:                   װ��ģʽ��Decorator Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����3:47:12   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description: �ϰֿ��ɼ�����
 * 
 * @author haycco
 */
public class Father {

    public static void main(String[] args) {
        // �ɼ����ù���
        SchoolReport sr;
        sr = new FouthGradeSchoolReport(); // ԭװ�ĳɼ���
        // ������߷�˵���ĳɼ���
        sr = new HighScoreDecorator(sr);
        // �ּ��˳ɼ�������˵��
        sr = new SortDecorator(sr);
        // ���ɼ���
        sr.report();
        // Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
        sr.sign("����"); // �ҽ�С�����ϰֵ�Ȼ������
    }

}
