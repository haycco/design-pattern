/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   IPod.java 
 * Comments:                   桥梁模式【Bridge Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 上午9:12:06   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description: 生产iPod了
 * 
 * @author haycco
 */
public class IPod extends Product {

    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }

}
