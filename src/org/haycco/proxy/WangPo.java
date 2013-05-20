package org.haycco.proxy;

/**
 * 王婆这个人老聪明了，她太老了，是个男人都看不上， 但是她有智慧有经验呀，她作为一类女人的代理！
 * 
 * @author haycco 2011-7-27 下午4:33:23
 * @version V1.0
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo() { // 默认的话，是潘金莲的代理
        this.kindWomen = new PanJinLian();
    }

    // 她可以是KindWomen的任何一个女人的代理，只要你是这一类型
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.haycco.proxy.KindWomen#makeEyesWithMan()
     */
    public void makeEyesWithMan() {
        kindWomen.makeEyesWithMan();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.haycco.proxy.KindWomen#happyWithMan()
     */
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }

}
