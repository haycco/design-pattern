/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   LetterProcess.java 
 * Comments:                   ����ģʽ(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����9:30:27   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: ����һ��д�ŵĹ���
 * 
 * @author haycco
 */
public interface LetterProcess {
    // ����Ҫд�ŵ�����
    public void writeContext(String context);

    // ���д�ŷ�
    public void fillEnvelope(String address);

    // ���ŷŵ��ŷ���
    public void letterInotoEnvelope();

    // Ȼ���ʵ�
    public void sendLetter();
}
