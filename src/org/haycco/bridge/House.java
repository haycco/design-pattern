/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   House.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����9:09:51   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:�����Ҽ��Ź�˾�ǵķ���
 * 
 * @author haycco
 */
public class House extends Product {

    // �������Ͷ������£��ô�Ҳ�Ǹ�����
    public void beProducted() {
        System.out.println("�������ķ�����������ӵ�...");
    }

    // ��Ȼ�Ƕ�������Ҳ���ܹ����۳�ȥ��
    public void beSelled() {
        System.out.println("�������ķ�������ȥ��...");
    }

}
