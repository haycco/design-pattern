/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   IOuterUser.java 
 * Comments:                   适配模式(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author：                    haycco                 
 * Create Date：               2011-12-15 上午9:59:14   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

import java.util.Map;

/**
 * Description:外系统的人员信息
 * 
 * @author haycco
 */
public interface IOuterUser {
    // 基本信息，比如名称，性别，手机号码了等
    public Map<?, ?> getUserBaseInfo();

    // 工作区域信息
    public Map<?, ?> getUserOfficeInfo();

    // 用户的家庭信息
    public Map<?, ?> getUserHomeInfo();
}
