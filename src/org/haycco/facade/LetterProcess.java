/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   LetterProcess.java 
 * Comments:                   门面模式(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:30:27   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: 定义一个写信的过程
 * 
 * @author haycco
 */
public interface LetterProcess {
    // 首先要写信的内容
    public void writeContext(String context);

    // 其次写信封
    public void fillEnvelope(String address);

    // 把信放到信封里
    public void letterInotoEnvelope();

    // 然后邮递
    public void sendLetter();
}
