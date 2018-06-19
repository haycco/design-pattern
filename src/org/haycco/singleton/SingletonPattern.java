package org.haycco.singleton;

/**
 * ͨ�õ���ģʽ
 * 
 * @author haycco
 * @version V1.0
 */
public class SingletonPattern {
    
    private static SingletonPattern instance = null;
    
    //����ס����ֱ�Ӳ���һ��ʵ��
    private SingletonPattern() {
        
    }
    
    public static SingletonPattern getInstance() {
        if(instance == null) instance = new SingletonPattern();
        return instance;
    }

}
