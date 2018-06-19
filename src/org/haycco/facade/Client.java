package org.haycco.facade;

/**
 * Description: ����ģʽ,�ҿ�ʼ������д����
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // ����һ�������ż��Ĺ���
        LetterProcess letterProcess = new LetterProcessImpl();
        // ��ʼд��
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");
        // ��ʼд�ŷ�
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
        // ���ŷŵ��ŷ������װ��
        letterProcess.letterInotoEnvelope();
        // �ܵ��ʾְ����������䣬Ͷ��
        letterProcess.sendLetter();

        // �ִ������ʾ֣�����������ʾ����ƽ�Hell Road
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        // ��ֻҪ���ŵ����ݺ������˵�ַ����������������һϵ�еĹ�����
        String address = "Happy Road No. 666,God Province,Heaven"; // ����һ����ַ
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        hellRoadPostOffice.sendLetter(context, address);
    }

}
