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
