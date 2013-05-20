/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   LetterProcessImpl.java 
 * Comments:                   门面模式(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:32:54   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: 写信的具体实现了
 * 
 * @author haycco
 */
public class LetterProcessImpl implements LetterProcess {

    // 写信
    public void writeContext(String context) {
        System.out.println("填写信的内容..." + context);
    }

    // 在信封上填写必要的信息
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名..." + address);
    }

    // 把信放到信封中，并封好
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中...");
    }

    // 塞到邮箱中，邮递
    public void sendLetter() {
        System.out.println("邮递信件...");
    }

}
