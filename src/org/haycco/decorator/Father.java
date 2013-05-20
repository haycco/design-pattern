/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Father.java 
 * Comments:                   装饰模式【Decorator Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午3:47:12   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description: 老爸看成绩单了
 * 
 * @author haycco
 */
public class Father {

    public static void main(String[] args) {
        // 成绩单拿过来
        SchoolReport sr;
        sr = new FouthGradeSchoolReport(); // 原装的成绩单
        // 加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 又加了成绩排名的说明
        sr = new SortDecorator(sr);
        // 看成绩单
        sr.report();
        // 然后老爸，一看，很开心，就签名了
        sr.sign("老三"); // 我叫小三，老爸当然叫老三
    }

}
