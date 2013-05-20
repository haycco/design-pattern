/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Clothes.java 
 * Comments:                   桥梁模式【Bridge Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 上午9:11:05   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:我集团公司生产的衣服
 * 
 * @author haycco
 */
public class Clothes extends Product {

    public void beProducted() {
        System.out.println("生产出的衣服是这个样子的...");
    }

    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }

}
