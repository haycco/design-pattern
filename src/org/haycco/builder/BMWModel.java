/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   BMWModel.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:33:04   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

/**
 * Description:����ģ��
 * 
 * @author haycco
 */
public class BMWModel extends CarModel {

    @Override
    protected void alarm() {
        System.out.println("����������������������ӵ�...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("���������������������...");
    }

    @Override
    protected void start() {
        System.out.println("������������������ӵ�...");
    }

    @Override
    protected void stop() {
        System.out.println("����Ӧ������ͣ��...");
    }

}
