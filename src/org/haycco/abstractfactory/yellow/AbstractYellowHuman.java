package org.haycco.abstractfactory.yellow;

import org.haycco.abstractfactory.Human;

/**
 * @author haycco 2011-8-15 ����4:58:16
 * @version V1.0
 * I'm glad to share my knowledge with you all.
 * ΪʲôҪ�޸ĳɳ������أ�Ҫ�����Ա�ѽ
 */
public abstract class AbstractYellowHuman implements Human {

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#laugh()
     */
    public void laugh() {
        System.out.println("��ɫ���ֻ��Ц���Ҹ���...");
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
        System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽڵ�...");
    }

}
