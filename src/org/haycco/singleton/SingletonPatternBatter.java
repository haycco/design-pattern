package org.haycco.singleton;

/**
 * ͨ�õ���ģʽ
 * 
 * @author haycco 2011-7-27 ����3:08:45
 * @version V1.0
 */
public class SingletonPatternBatter {
    
    private static final SingletonPatternBatter instance = new SingletonPatternBatter();
    
    //����ס����ֱ�Ӳ���һ��ʵ��
    public SingletonPatternBatter() {
        
    }
    
    public synchronized static SingletonPatternBatter getInstance() {
        return instance;
    }

}
