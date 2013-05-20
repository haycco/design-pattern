/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HummerH2Model.java 
 * Comments:                   模板方法模式(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 下午3:37:25   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:H1和H2有什么差别，还真不知道，真没接触过悍马
 * 
 * @author haycco
 */
public class HummerH2Model extends HummerModel {

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    // 默认没有喇叭的
    @Override
    protected boolean isAlarm() {
        return false;
    }

}
