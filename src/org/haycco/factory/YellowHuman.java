package org.haycco.factory;

/**
 * 黄色人种
 * 
 * @author haycco 2011-7-27 下午5:24:08
 * @version V1.0
 */
public class YellowHuman implements Human {

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
