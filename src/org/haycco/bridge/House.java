/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   House.java 
 * Comments:                   桥梁模式【Bridge Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 上午9:09:51   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:这是我集团公司盖的房子
 * 
 * @author haycco
 */
public class House extends Product {

    // 豆腐渣就豆腐渣呗，好歹也是个房子
    public void beProducted() {
        System.out.println("生产出的房子是这个样子的...");
    }

    // 虽然是豆腐渣，也是能够销售出去的
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }

}
