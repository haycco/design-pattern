/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   IUserInfo.java 
 * Comments:                   适配模式(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:53:10   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

/**
 * Description: 用户信息对象
 * 
 * @author haycco
 */
public interface IUserInfo {
    // 获得用户姓名
    public String getUserName();

    // 获得家庭地址
    public String getHomeAddress();

    // 手机号码，这个太重要，手机泛滥呀
    public String getMobileNumber();

    // 办公电话，一般式座机
    public String getOfficeTelNumber();

    // 这个人的职位是啥
    public String getJobPosition();

    // 获得家庭电话，这个有点缺德，我是不喜欢打家庭电话讨论工作
    public String getHomeTelNumber();
}
