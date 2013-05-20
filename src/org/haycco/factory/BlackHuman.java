package org.haycco.factory;

/**
 * @author haycco 2011-7-27 下午5:29:12
 * @version V1.0
 */
public class BlackHuman implements Human {

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
