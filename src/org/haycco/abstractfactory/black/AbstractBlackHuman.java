package org.haycco.abstractfactory.black;

import org.haycco.abstractfactory.Human;

/**
 * @author haycco 2011-8-15 下午5:01:56
 * @version V1.0
 * I'm glad to share my knowledge with you all.
 * 黑色人类，记得中学学英语，老师说black man是侮辱人的意思，不懂，没跟老外说话
 */
public abstract class AbstractBlackHuman implements Human {

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#laugh()
     */
    public void laugh() {
        System.out.println("黑色人种在大笑...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#cry()
     */
    public void cry() {
        System.out.println("黑色人种会哭...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#talk()
     */
    public void talk() {
        System.out.println("黑色人种在说话...");
    }

}
