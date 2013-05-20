/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   IPod.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����9:12:06   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description: ����iPod��
 * 
 * @author haycco
 */
public class IPod extends Product {

    public void beProducted() {
        System.out.println("��������iPod��������ӵ�...");
    }

    public void beSelled() {
        System.out.println("��������iPod����ȥ��...");
    }

}
