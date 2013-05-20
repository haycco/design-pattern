package org.haycco.strategy;

/**
 * ��ı���ˣ��ǻ�Ҫ�н���
 * 
 * @author haycco 2011-7-27 ����3:50:47
 * @version V1.0
 */
public class Context {

    //���캯������Ҫʹ���Ǹ����
    private IStrategy straegy;
    
    public Context(IStrategy strategy) {
        this.straegy = strategy;
    }
    
    //ʹ�ü�ı�ˣ����ҳ�����
    public void operate() {
        this.straegy.operate();
    }
}
