/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   OuterUserInfo.java 
 * Comments:                   ����ģʽ(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����10:04:39   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

import java.util.Map;

/**
 * Description: ��OuterUser��װ��UserInfo
 * 
 * @author haycco
 */
@SuppressWarnings("unchecked")
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map<?, ?> baseInfo = super.getUserBaseInfo(); // Ա���Ļ�����Ϣ
    private Map<?, ?> homeInfo = super.getUserHomeInfo(); // Ա���ļ�ͥ��Ϣ
    private Map<?, ?> officeInfo = super.getUserOfficeInfo(); // ������Ϣ

    /**
     * ��ͥ��ַ
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     * ��ͥ�绰����
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /**
     * ְλ��Ϣ
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /**
     * �ֻ�����
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
     * �칫�绰
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /**
     * Ա��������
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

}
