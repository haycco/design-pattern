/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Clothes.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����9:11:05   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:�Ҽ��Ź�˾�������·�
 * 
 * @author haycco
 */
public class Clothes extends Product {

    public void beProducted() {
        System.out.println("���������·���������ӵ�...");
    }

    public void beSelled() {
        System.out.println("���������·�����ȥ��...");
    }

}
