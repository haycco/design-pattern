/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   模板方法模式(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 下午3:40:45   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:客户开始使用这个模型
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // 客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        h1.run(); // 汽车跑起来了；
        System.out.println("---------------华丽的分割线---------------");

        // 客户开H2型号，出去玩耍了
        HummerModel h2 = new HummerH2Model();
        h2.run();
        System.out.println("---------------华丽的分割线---------------");

        // 客户开着H1型号，出去遛弯了
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarm(true);
        hummerH1Model.run(); // 汽车跑起来了；
    }

}
