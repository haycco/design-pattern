/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   App.java 
 * Comments:                   适配模式(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:57:18   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

/**
 * Description:这就是我们具体的应用了，比如老板要查所有的20-30的女性信息
 * 
 * @author haycco
 */
public class App {

    public static void main(String[] args) {
        // 没有与外系统连接的时候，是这样写的
//        IUserInfo youngGirl = new UserInfo();
        
        // 老板一想不对呀，兔子不吃窝边草，还是找人力资源的员工好点
        IUserInfo youngGirl = new OuterUserInfo(); // 我们只修改了这一句好
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }

}
