/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   RequirementGroup.java 
 * Comments:                   ����ģʽ��Command Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����2:24:51   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: �������ְ���ǺͿͻ�̸��������������Ӧ�ö���ҵ������ר��
 * 
 * @author haycco
 */
public class RequirementGroup extends Group {

    // �ͻ�Ҫ���������ȥ������̸
    public void find() {
        System.out.println("�ҵ�������...");
    }

    // �ͻ�Ҫ������һ������
    public void add() {
        System.out.println("�ͻ�Ҫ������һ������...");
    }

    // �ͻ�Ҫ���޸�һ������
    public void change() {
        System.out.println("�ͻ�Ҫ���޸�һ������...");
    }

    // �ͻ�Ҫ��ɾ��һ������
    public void delete() {
        System.out.println("�ͻ�Ҫ��ɾ��һ������...");
    }

    // �ͻ�Ҫ�������ƻ�
    public void plan() {
        System.out.println("�ͻ�Ҫ���������ƻ�...");
    }

}
