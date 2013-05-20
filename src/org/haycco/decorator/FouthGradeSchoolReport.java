/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   FouthGradeSchoolReport.java 
 * Comments:                   装饰模式【Decorator Pattern】                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2012-1-10 下午3:36:16   
 * Version:                    1.0
 *
 */
package org.haycco.decorator;

/**
 * Description:
 * 
 * @author haycco
 */
public class FouthGradeSchoolReport extends SchoolReport {

    // 我的成绩单
    public void report() {
        // 成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    // 家长签名
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }

}
