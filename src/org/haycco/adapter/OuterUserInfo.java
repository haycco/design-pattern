/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   OuterUserInfo.java 
 * Comments:                   适配模式(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午10:04:39   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

import java.util.Map;

/**
 * Description: 把OuterUser包装成UserInfo
 * 
 * @author haycco
 */
@SuppressWarnings("unchecked")
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map<?, ?> baseInfo = super.getUserBaseInfo(); // 员工的基本信息
    private Map<?, ?> homeInfo = super.getUserHomeInfo(); // 员工的家庭信息
    private Map<?, ?> officeInfo = super.getUserOfficeInfo(); // 工作信息

    /**
     * 家庭地址
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     * 家庭电话号码
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /**
     * 职位信息
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /**
     * 手机号码
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
     * 办公电话
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /**
     * 员工的名称
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

}
