/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Product.java 
 * Comments:                   桥梁模式【Bridge Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 上午9:08:38   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:这是我整个集团公司的产品类
 * 
 * @author haycco
 */
public abstract class Product {
    
    // 甭管是什么产品它总要是能被生产出来
    public abstract void beProducted();

    // 生产出来的东西，一定要销售出去，否则扩本呀
    public abstract void beSelled();
    
}
