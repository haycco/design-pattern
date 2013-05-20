/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HummerModel.java 
 * Comments:                   ģ�巽��ģʽ(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����3:33:08   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:Hummer Model�Ǻ�����ģ�͵���˼�����Ǻ�����Ů��ģ
 * 
 * @author haycco
 */
public abstract class HummerModel {
    /*
     * ���ȣ����ģ��Ҫ�ܹ��������������������ҡ���������ǵ������������� ��Ҫ�ܹ����������������ʵ��Ҫ��ʵ��������
     */
    protected abstract void start();

    // �ܷ������ǻ�Ҫ��ͣ�������ǲ����汾��
    protected abstract void stop();

    // ���Ȼ���������ǵενУ��������ٽ�
    protected abstract void alarm();

    // ������¡¡���죬�������Ǽٵ�
    protected abstract void engineBoom();

    // ���ӷ�����Ĭ�������ǻ����
    protected boolean isAlarm() {
        return true;
    }

    // ��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ�����������֮Ҫ����
    final public void run() {
        // �ȷ�������
        this.start();
        // ���濪ʼ����
        this.engineBoom();
        // ��������������죬����������Ͳ���
        if (this.isAlarm()) {
            this.alarm();
        }
        // ����Ŀ�ĵؾ�ͣ��
        this.stop();
    }
}
