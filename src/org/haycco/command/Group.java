/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Group.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:23:06   
 * Version:                    1.0
 *
 */
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
