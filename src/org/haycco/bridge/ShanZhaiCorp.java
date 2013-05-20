/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   ShanZhaiCorp.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����9:15:49   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:����ɽկ�ϴ�������ɶ�Ҿ�����ɶ
 * 
 * @author haycco
 */
public class ShanZhaiCorp extends Corp {
    
    // ��ʲô��Ʒ����֪�����ȱ����õĲ�֪��
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    // ��׬Ǯ
    public void makeMoney() {
        super.makeMoney();
        System.out.println("��׬Ǯѽ...");
    }
    
}
