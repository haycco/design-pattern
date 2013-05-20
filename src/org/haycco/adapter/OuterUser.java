/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   OuterUser.java 
 * Comments:                   ����ģʽ(Adapt Pattern)                                    
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����10:00:49   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: ��ϵͳ���û���Ϣ��ʵ����
 * 
 * @author haycco
 */
public class OuterUser implements IOuterUser {

    /*
     * �û��Ļ�����Ϣ
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "���Ա���л���ħ��....");
        baseInfoMap.put("mobileNumber", "���Ա���绰��....");
        return baseInfoMap;
    }

    /*
     * Ա���ļ�ͥ��Ϣ
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰��....");
        homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��....");
        return homeInfo;
    }

    /*
     * Ա���Ĺ�����Ϣ������ְλ�˵�
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "����˵�ְλ��BOSS...");
        officeInfo.put("officeTelNumber", "Ա���İ칫�绰��....");
        return officeInfo;
    }

}
