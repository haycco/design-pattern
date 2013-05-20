/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Invoker.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:45:31   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 接头人的职责就是接收命令，并执行
 * 
 * @author haycco
 */
public class Invoker {
    
    // 什么命令
    private Command command;

    // 客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行客户的命令
    public void action() {
        this.command.execute();
    }
    
}
