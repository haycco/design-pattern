package org.haycco.proxy;

/**
 * ����ģʽ
 * 
 * @author haycco 2011-7-27 ����4:29:20
 * @version V1.0
 */
public class ProxyPattern {

    //����һ�������죬����ɫ�ж���
    public static void main(String[] args) {
        
        WangPo wangPo = new WangPo();
        
        // Ȼ���������˵����Ҫ���˽���happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ:
        wangPo.makeEyesWithMan(); // ����û����Ȼ������ʱ����������ʵ����ˬ�����˽���
        wangPo.happyWithMan();
        
        JiaShi jiaShi = new JiaShi();
        WangPo wangpo = new WangPo(jiaShi);//��������Ϊ���ϵĴ�����
        
        wangpo.makeEyesWithMan();
        wangpo.happyWithMan();
    }
}
