/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HighScoreDecorator.java 
 * Comments:                   装饰模式【Decorator Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午3:54:31   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description: 我要把我学校的最高成绩告诉老爸
 * 
 * @author haycco
 */
public class HighScoreDecorator extends Decorator {
    
    // 构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    // 我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    // 最高成绩我要做老爸看成绩单前告诉他，否则等他一看，就抡起笤帚有揍我，我那还有机会说呀
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
    
}
