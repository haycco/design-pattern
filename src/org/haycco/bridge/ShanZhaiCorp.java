/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   ShanZhaiCorp.java 
 * Comments:                   桥梁模式【Bridge Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 上午9:15:49   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:我是山寨老大，你流行啥我就生产啥
 * 
 * @author haycco
 */
public class ShanZhaiCorp extends Corp {
    
    // 产什么产品，不知道，等被调用的才知道
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    // 狂赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
    
}
