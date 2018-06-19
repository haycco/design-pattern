package org.haycco.facade;

/**
 * Description: �����������ģʽ,д�ţ���װ��Ͷ�ݣ�һ�廯
 * 
 * @author haycco
 */
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();
    // ���Ӿ�����ż��ļ��
    private Police police = new Police();

    // д�ţ���װ��Ͷ�ݣ�һ�廯��
    public void sendLetter(String context, String address) {
        // ����д��
        letterProcess.writeContext(context);
        // д���ŷ�
        letterProcess.fillEnvelope(address);
        // ����Ҫ����ż���
        police.checkLetter(letterProcess);
        // ���ŷŵ��ŷ���
        letterProcess.letterInotoEnvelope();
        // �ʵ��ż�
        letterProcess.sendLetter();
    }
}
