package org.haycco.strategy;

/**
 * 孙夫人断后，挡住追兵
 * 
 * @author haycco 2011-7-27 下午3:46:34
 * @version V1.0
 */
public class BlockEnemy implements IStrategy {

    /* (non-Javadoc)
     * @see org.haycco.strategy.IStrategy#operate()
     */
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }

}
