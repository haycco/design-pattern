package org.haycco.abstractfactory.white;

import org.haycco.abstractfactory.Human;

/**
 * @author haycco 2011-8-15 ����5:00:40
 * @version V1.0
 * ��ɫ������
 * Ϊ�˴������࣬�½�һ�����������ǰ����˵�������
 */
public abstract class AbstractWhiteHuman implements Human {

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#laugh()
     */
    public void laugh() {
        System.out.println("��ɫ���ֻ��Ц...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#cry()
     */
    public void cry() {
        System.out.println("��ɫ���ֻ��...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#talk()
     */
    public void talk() {
        System.out.println("��ɫ���ֻ�˵��...");
    }

}
