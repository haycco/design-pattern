package org.haycco.factory;

/**
 * 白色人种
 * 
 * @author haycco 2011-7-27 下午5:27:17
 * @version V1.0
 */
public class WhiteHuman implements Human {

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#laugh()
     */
    public void laugh() {
        System.out.println("白色人种会大笑...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#cry()
     */
    public void cry() {
        System.out.println("白色人种会哭...");
    }

    /* (non-Javadoc)
     * @see org.haycco.factory.Human#talk()
     */
    public void talk() {
        System.out.println("白色人种会说话...");
    }

}
