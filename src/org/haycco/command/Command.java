/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Command.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:35:52   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 命令的抽象类，我们把客户发出的命令定义成一个一个的对象
 * 
 * @author haycco
 */
public abstract class Command {
    
    // 把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup(); // 需求组
    protected PageGroup pg = new PageGroup(); // 美工组
    protected CodeGroup cg = new CodeGroup(); // 代码组;

    // 只要一个方法，你要我做什么事情
    public abstract void execute();
    
}
