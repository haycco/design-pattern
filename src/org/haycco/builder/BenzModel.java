/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   BenzModel.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:31:15   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

/**
 * Description:���۳�ģ��
 * 
 * @author haycco
 */
public class BenzModel extends CarModel {

    @Override
    protected void alarm() {
        System.out.println("���۳�������������������ӵ�...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("���۳������������������...");
    }

    @Override
    protected void start() {
        System.out.println("���۳���������������ӵ�...");
    }

    @Override
    protected void stop() {
        System.out.println("���۳�Ӧ������ͣ��...");
    }

}
