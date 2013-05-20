package org.haycco.abstractfactory.yellow;

import org.haycco.abstractfactory.Human;

/**
 * @author haycco 2011-8-15 下午4:58:16
 * @version V1.0
 * I'm glad to share my knowledge with you all.
 * 为什么要修改成抽象类呢？要定义性别呀
 */
public abstract class AbstractYellowHuman implements Human {

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#laugh()
     */
    public void laugh() {
        System.out.println("黄色人种会大笑，幸福啊...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#cry()
     */
    public void cry() {
        System.out.println("黄色人种会哭...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#talk()
     */
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节的...");
    }

}
