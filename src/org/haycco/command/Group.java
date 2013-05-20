/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Group.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:23:06   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 项目组分成了三个组，每个组还是要接受增删改的命令
 * 
 * @author haycco
 */
public abstract class Group {
    
    // 甲乙双方分开办公，你要和那个组讨论，你首先要找到这个组
    public abstract void find();

    // 被要求增加功能
    public abstract void add();

    // 被要求删除功能
    public abstract void delete();

    // 被要求修改功能
    public abstract void change();

    // 被要求给出所有的变更计划
    public abstract void plan();
    
}
