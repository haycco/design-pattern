/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   CarModel.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:25:42   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

import java.util.ArrayList;

/**
 * Description:����һ������ģ�͵ĳ����࣬���еĳ���ģ�Ͷ��̳�������
 * 
 * @author haycco
 */
public abstract class CarModel {
    
    // ��������Ǹ�����������ִ�е�˳��
    private ArrayList<String> sequence = new ArrayList<String>();

    /*
     * ģ����������ʼ����
     */
    protected abstract void start();

    // �ܷ������ǻ�Ҫ��ͣ�������ǲ����汾��
    protected abstract void stop();

    // ���Ȼ���������ǵενУ��������ٽ�
    protected abstract void alarm();

    // ������¡¡���죬�������Ǽٵ�
    protected abstract void engineBoom();

    // ��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ�����������֮Ҫ����
    final public void run() {
        // ѭ��һ�飬˭��ǰ������ִ��˭
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) { // �����start�ؼ��֣�
                this.start(); // ��������
            } else if (actionName.equalsIgnoreCase("stop")) { // �����stop�ؼ���
                this.stop(); // ֹͣ����
            } else if (actionName.equalsIgnoreCase("alarm")) { // �����alarm�ؼ���
                this.alarm(); // ���ȿ�ʼ����
            } else if (actionName.equalsIgnoreCase("engine boom")) { // �����engine
                // boom�ؼ���
                this.engineBoom(); // ���濪ʼ����
            }
        }
    }

    // �Ѵ��ݹ�����ֵ���ݵ�����
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
