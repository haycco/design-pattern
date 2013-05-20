/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HummerH1Model.java 
 * Comments:                   模板方法模式(Template Method Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 下午3:35:46   
 * Version:                    1.0
 *
 */
package org.haycco.templatemethod;

/**
 * Description:悍马车是每个越野者的最爱，其中H1最接近军用系列
 * 
 * @author haycco
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true; // 是否要响喇叭

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    // 要不要响喇叭，是由客户的来决定的
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
