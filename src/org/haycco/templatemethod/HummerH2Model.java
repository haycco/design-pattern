/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HummerH2Model.java 
 * Comments:                   ģ�巽��ģʽ(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����3:37:25   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:H1��H2��ʲô��𣬻��治֪������û�Ӵ�������
 * 
 * @author haycco
 */
public class HummerH2Model extends HummerModel {

    @Override
    public void alarm() {
        System.out.println("����H2����...");
    }

    @Override
    public void engineBoom() {
        System.out.println("����H2����������������...");
    }

    @Override
    public void start() {
        System.out.println("����H2����...");
    }

    @Override
    public void stop() {
        System.out.println("����H2ͣ��...");
    }

    // Ĭ��û�����ȵ�
    @Override
    protected boolean isAlarm() {
        return false;
    }

}
