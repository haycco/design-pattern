/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HummerH1Model.java 
 * Comments:                   ģ�巽��ģʽ(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����3:35:46   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:������ÿ��ԽҰ�ߵ��������H1��ӽ�����ϵ��
 * 
 * @author haycco
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true; // �Ƿ�Ҫ������

    @Override
    public void alarm() {
        System.out.println("����H1����...");
    }

    @Override
    public void engineBoom() {
        System.out.println("����H1����������������...");
    }

    @Override
    public void start() {
        System.out.println("����H1����...");
    }

    @Override
    public void stop() {
        System.out.println("����H1ͣ��...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    // Ҫ��Ҫ�����ȣ����ɿͻ�����������
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
