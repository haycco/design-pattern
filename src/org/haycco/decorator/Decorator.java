/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Decorator.java 
 * Comments:                   装饰模式【Decorator Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午3:52:50   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description: 装饰类，我要把我的成绩单装饰一下
 * 
 * @author haycco
 */
public abstract class Decorator extends SchoolReport {

    // 首先我要知道是那个成绩单
    private SchoolReport sr;

    // 构造函数，传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    // 成绩单还是要被看到的
    public void report() {
        this.sr.report();
    }

    // 看完毕还是要签名的
    public void sign(String name) {
        this.sr.sign(name);
    }

}
