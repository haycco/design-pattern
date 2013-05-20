/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   LetterProcessImpl.java 
 * Comments:                   ����ģʽ(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����9:32:54   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: д�ŵľ���ʵ����
 * 
 * @author haycco
 */
public class LetterProcessImpl implements LetterProcess {

    // д��
    public void writeContext(String context) {
        System.out.println("��д�ŵ�����..." + context);
    }

    // ���ŷ�����д��Ҫ����Ϣ
    public void fillEnvelope(String address) {
        System.out.println("��д�ռ��˵�ַ������..." + address);
    }

    // ���ŷŵ��ŷ��У������
    public void letterInotoEnvelope() {
        System.out.println("���ŷŵ��ŷ���...");
    }

    // ���������У��ʵ�
    public void sendLetter() {
        System.out.println("�ʵ��ż�...");
    }

}
