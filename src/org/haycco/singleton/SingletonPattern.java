package org.haycco.singleton;

/**
 * 通用单例模式
 * 
 * @author haycco
 * @version V1.0
 */
public class SingletonPattern {
    
    private static SingletonPattern instance = null;
    
    //限制住不能直接产生一个实例
    private SingletonPattern() {
        
    }
    
    public static SingletonPattern getInstance() {
        if(instance == null) instance = new SingletonPattern();
        return instance;
    }

}
