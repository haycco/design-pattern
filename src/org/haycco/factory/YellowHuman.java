package org.haycco.factory;

/**
 * ��ɫ����
 * 
 * @author haycco 2011-7-27 ����5:24:08
 * @version V1.0
 */
public class YellowHuman implements Human {

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
