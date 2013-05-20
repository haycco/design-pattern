package org.haycco.abstractfactory.white;

import org.haycco.abstractfactory.Human;

/**
 * @author haycco 2011-8-15 下午5:00:40
 * @version V1.0
 * 白色人人类
 * 为了代码整洁，新建一个包，这里是白种人的天下了
 */
public abstract class AbstractWhiteHuman implements Human {

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
