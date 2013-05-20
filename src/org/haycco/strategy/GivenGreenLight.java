package org.haycco.strategy;

/**
 * 求吴国太开个绿灯
 * 
 * @author haycco 2011-7-27 下午3:45:03
 * @version V1.0
 */
public class GivenGreenLight implements IStrategy {

    /* (non-Javadoc)
     * @see org.haycco.strategy.IStrategy#operate()
     */
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }

}
