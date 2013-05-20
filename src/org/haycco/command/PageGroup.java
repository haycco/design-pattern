/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   PageGroup.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:26:26   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 美工组的职责是设计出一套漂亮、简单、便捷的界面
 * 
 * @author haycco
 */
public class PageGroup extends Group {

    // 首先这个美工组应该被找到吧，要不你跟谁谈？
    public void find() {
        System.out.println("找到美工组...");
    }

    // 美工被要求增加一个页面
    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    // 客户要求对现有界面做修改
    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    // 甲方是老大，要求删除一些页面
    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    // 所有的增删改那要给出计划呀
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }

}
