/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   SchoolReport.java 
 * Comments:                   装饰模式【Decorator Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午3:35:13   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description:
 * 
 * @author haycco
 */
public abstract class SchoolReport {
    
    // 成绩单的主要展示的就是你的成绩情况
    public abstract void report();

    // 成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
    
}
