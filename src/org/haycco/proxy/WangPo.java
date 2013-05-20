package org.haycco.proxy;

/**
 * ����������ϴ����ˣ���̫���ˣ��Ǹ����˶������ϣ� ���������ǻ��о���ѽ������Ϊһ��Ů�˵Ĵ���
 * 
 * @author haycco 2011-7-27 ����4:33:23
 * @version V1.0
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo() { // Ĭ�ϵĻ������˽����Ĵ���
        this.kindWomen = new PanJinLian();
    }

    // ��������KindWomen���κ�һ��Ů�˵Ĵ���ֻҪ������һ����
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
