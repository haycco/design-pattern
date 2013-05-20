/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   命令模式【Command Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午2:29:30   
 * Version:                    1.0
 *
 */
package org.haycco.command;

/**
 * Description: 客户就是甲方，给我们钱的一方，是老大
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // 定义我们的接头人
        Invoker xiaoSan = new Invoker(); // 接头人就是我小三
        // 客户要求增加一项需求
        System.out.println("-------------客户要求增加一项需求-----------------");
        // 客户给我们下命令来
//        Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        // 接头人接收到命令
        xiaoSan.setCommand(command);
        // 接头人执行命令
        xiaoSan.action();
    }

}
