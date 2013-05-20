/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   建造者模式(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-16 下午2:34:41   
 * Version:                    1.0
 *
 */
package org.haycco.builder;


/**
 * Description:最终客户开始使用这个模型
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        // 10辆A类型的奔驰车
        for (int i = 0; i < 1; i++) {
            director.getABenzModel().run();
        }
        System.out.println("-------------------华丽的分割线-------------------");
        
        // 20辆B类型的奔驰车
        for (int i = 0; i < 2; i++) {
            director.getBBenzModel().run();
        }
        System.out.println("-------------------华丽的分割线-------------------");
        
        // 30辆C类型的宝马车
        for (int i = 0; i < 3; i++) {
            director.getCBMWModel().run();
        }
    }

}
