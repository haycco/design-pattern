/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Product.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����9:08:38   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:�������������Ź�˾�Ĳ�Ʒ��
 * 
 * @author haycco
 */
public abstract class Product {
    
    // �¹���ʲô��Ʒ����Ҫ���ܱ���������
    public abstract void beProducted();

    // ���������Ķ�����һ��Ҫ���۳�ȥ����������ѽ
    public abstract void beSelled();
    
}
