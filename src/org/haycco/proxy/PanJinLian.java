package org.haycco.proxy;

/**
 * 定一个潘金莲是什么样的人
 * 
 * @author haycco 2011-7-27 下午4:32:09
 * @version V1.0
 */
public class PanJinLian implements KindWomen {

    /* (non-Javadoc)
     * @see org.haycco.proxy.KindWomen#makeEyesWithMan()
     */
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    /* (non-Javadoc)
     * @see org.haycco.proxy.KindWomen#happyWithMan()
     */
    public void happyWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }

}
