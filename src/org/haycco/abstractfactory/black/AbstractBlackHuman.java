package org.haycco.abstractfactory.black;

import org.haycco.abstractfactory.Human;

/**
 * @author haycco 2011-8-15 ����5:01:56
 * @version V1.0
 * I'm glad to share my knowledge with you all.
 * ��ɫ���࣬�ǵ���ѧѧӢ���ʦ˵black man�������˵���˼��������û������˵��
 */
public abstract class AbstractBlackHuman implements Human {

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#laugh()
     */
    public void laugh() {
        System.out.println("��ɫ�����ڴ�Ц...");
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
        System.out.println("��ɫ������˵��...");
    }

}
