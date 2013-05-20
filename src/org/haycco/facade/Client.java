/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   门面模式(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:34:53   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: 我开始给朋友写信了
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();
        // 开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");
        // 开始写信封
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
        // 把信放到信封里，并封装好
        letterProcess.letterInotoEnvelope();
        // 跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();

        // 现代化的邮局，有这项服务，邮局名称叫Hell Road
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        // 你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        String address = "Happy Road No. 666,God Province,Heaven"; // 定义一个地址
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        hellRoadPostOffice.sendLetter(context, address);
    }

}
