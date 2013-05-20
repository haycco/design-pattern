/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Police.java 
 * Comments:                   门面模式(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:41:20   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: 警察要检查信件
 * 
 * @author haycco
 */
public class Police {

    public void checkLetter(LetterProcess letterProcess) {
        System.out.println("警察正在检查信件...");
    }
}
