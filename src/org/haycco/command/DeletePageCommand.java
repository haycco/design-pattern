/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   DeletePageCommand.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:39:55   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 删除一个页面的命令
 * 
 * @author haycco
 */
public class DeletePageCommand extends Command {

    // 执行删除一个页面的命令
    public void execute() {
        // 找到页面组
        super.pg.find();
        // 删除一个页面
        super.rg.delete();
        // 给出计划
        super.rg.plan();
    }

}
