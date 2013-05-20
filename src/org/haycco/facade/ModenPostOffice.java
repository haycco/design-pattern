/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   ModenPostOffice.java 
 * Comments:                   门面模式(Facade Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:36:53   
 * Version:                    1.0
 *
 */
package org.haycco.facade;

/**
 * Description: 改良后的门面模式,写信，封装，投递，一体化
 * 
 * @author haycco
 */
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();
    // 增加警察对信件的检查
    private Police police = new Police();

    // 写信，封装，投递，一体化了
    public void sendLetter(String context, String address) {
        // 帮你写信
        letterProcess.writeContext(context);
        // 写好信封
        letterProcess.fillEnvelope(address);
        // 警察要检查信件了
        police.checkLetter(letterProcess);
        // 把信放到信封中
        letterProcess.letterInotoEnvelope();
        // 邮递信件
        letterProcess.sendLetter();
    }
}
