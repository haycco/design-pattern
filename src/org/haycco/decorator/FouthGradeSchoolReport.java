/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   FouthGradeSchoolReport.java 
 * Comments:                   װ��ģʽ��Decorator Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����3:36:16   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description:
 * 
 * @author haycco
 */
public class FouthGradeSchoolReport extends SchoolReport {

    // �ҵĳɼ���
    public void report() {
        // �ɼ����ĸ�ʽ��������ӵ�
        System.out.println("�𾴵�XXX�ҳ�:");
        System.out.println(" ......");
        System.out.println(" ���� 62 ��ѧ65 ���� 98 ��Ȼ 63");
        System.out.println(" .......");
        System.out.println(" �ҳ�ǩ���� ");
    }

    // �ҳ�ǩ��
    public void sign(String name) {
        System.out.println("�ҳ�ǩ��Ϊ��" + name);
    }

}
