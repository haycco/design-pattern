/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   SugarFouthGradeSchoolReport.java 
 * Comments:                   װ��ģʽ��Decorator Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����3:49:51   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description: ������ɼ����������� Sugar�����̫���ˣ��������ǵ���˼�����ʾ������� ��������㻹����ȥ
 * 
 * @author haycco
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    
    // ����Ҫ������Ҫ�����ķ������ȸ��ϰ�˵ѧУ��߳ɼ�
    private void reportHighScore() {
        System.out.println("��ο������������75����ѧ��78����Ȼ��80");
    }

    // ���ϰֿ���ϳɼ��������ٻ㱨ѧУ���������
    private void reportSort() {
        System.out.println("����������38��...");
    }

    // ���ڻ㱨�������Ѿ����������������Ҫ��д����
    @Override
    public void report() {
        this.reportHighScore(); // ��˵��߳ɼ�
        super.report(); // Ȼ���ϰֿ��ɼ���
        this.reportSort(); // Ȼ������ϰ�ѧϰѧУ����
    }
    
}
