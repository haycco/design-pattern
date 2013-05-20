package org.haycco.strategy;

/**
 * 首先定一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口
 * 
 * @author haycco 2011-7-27 下午3:40:19
 * @version V1.0
 */
public interface IStrategy {

    //每个妙计都是一个可执行的算法
    public void operate();
}
