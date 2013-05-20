package org.haycco.singleton;

/**
 * 通用单例模式
 * 
 * @author haycco 2011-7-27 下午3:08:45
 * @version V1.0
 */
public class SingletonPatternBatter {
    
    private static final SingletonPatternBatter instance = new SingletonPatternBatter();
    
    //限制住不能直接产生一个实例
    public SingletonPatternBatter() {
        
    }
    
    public synchronized static SingletonPatternBatter getInstance() {
        return instance;
    }

}
