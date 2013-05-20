/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   AddRequirementCommand.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:38:09   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 增加一项需求
 * 
 * @author haycco
 */
public class AddRequirementCommand extends Command {

    // 执行增加一项需求的命令
    public void execute() {
        // 找到需求组
        super.rg.find();
        // 增加一份需求
        super.rg.add();
        // 页面也要增加
        super.pg.add();
        // 功能也要增加
        super.cg.add();
        // 给出计划
        super.rg.plan();
    }
}
