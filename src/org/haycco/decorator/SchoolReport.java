/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   SchoolReport.java 
 * Comments:                   װ��ģʽ��Decorator Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����3:35:13   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description:
 * 
 * @author haycco
 */
public abstract class SchoolReport {
    
    // �ɼ�������Ҫչʾ�ľ�����ĳɼ����
    public abstract void report();

    // �ɼ���Ҫ�ҳ�ǩ�֣��������Ҫ����
    public abstract void sign(String name);
    
}
