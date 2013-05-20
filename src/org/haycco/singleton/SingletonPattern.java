package org.haycco.singleton;

/**
 * ͨ�õ���ģʽ
 * 
 * @author haycco 2011-7-27 ����2:52:18
 * @version V1.0
 */
public class SingletonPattern {
    
    private static SingletonPattern instance = null;
    
    //����ס����ֱ�Ӳ���һ��ʵ��
    public SingletonPattern() {
        
    }
    
    public static SingletonPattern getInstance() {
        if(instance == null) instance = new SingletonPattern();
        return instance;
    }

}
