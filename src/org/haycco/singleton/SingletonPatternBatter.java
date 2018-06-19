package org.haycco.singleton;

/**
 * ͨ�õ���ģʽ
 * 
 * @author haycco
 * @version V1.0
 */
public class SingletonPatternBatter {
    
    private static final SingletonPatternBatter instance = new SingletonPatternBatter();
    
    //����ס����ֱ�Ӳ���һ��ʵ��
    private SingletonPatternBatter() {
        
    }
    
    public synchronized static SingletonPatternBatter getInstance() {
        return instance;
    }

}
