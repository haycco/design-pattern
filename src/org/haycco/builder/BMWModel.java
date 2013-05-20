/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   BMWModel.java 
 * Comments:                   建造者模式(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-16 下午2:33:04   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

/**
 * Description:宝马车模型
 * 
 * @author haycco
 */
public class BMWModel extends CarModel {

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }

    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车...");
    }

}
