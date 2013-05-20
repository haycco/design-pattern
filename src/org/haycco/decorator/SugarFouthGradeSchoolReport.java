/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   SugarFouthGradeSchoolReport.java 
 * Comments:                   装饰模式【Decorator Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午3:49:51   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description: 对这个成绩单进行美化 Sugar这个词太好了，名词是糖的意思，动词就是美化 给你颗糖你还不美去
 * 
 * @author haycco
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    
    // 首先要定义你要美化的方法，先给老爸说学校最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    // 在老爸看完毕成绩单后，我再汇报学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    // 由于汇报的内容已经发生变更，那所以要重写父类
    @Override
    public void report() {
        this.reportHighScore(); // 先说最高成绩
        super.report(); // 然后老爸看成绩单
        this.reportSort(); // 然后告诉老爸学习学校排名
    }
    
}
