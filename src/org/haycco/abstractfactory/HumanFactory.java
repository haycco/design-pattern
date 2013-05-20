package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 ����5:23:08
 * @since JDK_1.5.0 
 * ��ζ�һ���ӿڣ�Ӧ��Ҫ�첻ͬ�Ա���ˣ���Ҫ��ͬ�������� ���������¯��������������˺�Ů��
 */
public interface HumanFactory {

    // �����ɫ����
    public Human createYellowHuman();

    // ����һ����ɫ����
    public Human createWhiteHuman();

    // ����һ����ɫ����
    public Human createBlackHuman();
}
