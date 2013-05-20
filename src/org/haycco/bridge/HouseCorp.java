/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HouseCorp.java 
 * Comments:                   桥梁模式【Bridge Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 上午8:55:33   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:房地产公司，按照翻译来说应该叫realty corp，这个是比较准确的翻译
 * 但是我问你房地产公司翻译成英文，你第一反应什么？对嘛还是house corp!
 * 
 * @author haycco
 */
public class HouseCorp extends Corp {

    // 定义传递一个House产品进来
    public HouseCorp(House house) {
        super(house);
    }

    // 房地产公司很High了，赚钱，计算利润
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }

}
