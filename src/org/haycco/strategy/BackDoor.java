package org.haycco.strategy;

/**
 * 找乔国老帮忙，使孙权不能杀刘备
 * 
 * @author haycco 2011-7-27 下午3:42:34
 * @version V1.0
 */
public class BackDoor implements IStrategy {

    /* (non-Javadoc)
     * @see org.haycco.strategy.IStrategy#operate()
     */
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }

}
