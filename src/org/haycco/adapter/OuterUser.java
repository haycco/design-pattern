/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   OuterUser.java 
 * Comments:                   适配模式(Adapt Pattern)                                    
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午10:00:49   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 外系统的用户信息的实现类
 * 
 * @author haycco
 */
public class OuterUser implements IOuterUser {

    /*
     * 用户的基本信息
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王....");
        baseInfoMap.put("mobileNumber", "这个员工电话是....");
        return baseInfoMap;
    }

    /*
     * 员工的家庭信息
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是....");
        homeInfo.put("homeAddress", "员工的家庭地址是....");
        return homeInfo;
    }

    /*
     * 员工的工作信息，比如职位了等
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是....");
        return officeInfo;
    }

}
