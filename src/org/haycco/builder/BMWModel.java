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
