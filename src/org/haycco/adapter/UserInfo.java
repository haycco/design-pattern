/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   UserInfo.java 
 * Comments:                   ����ģʽ(Adapt Pattern)                                   
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����9:55:14   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

/**
 * Description:
 * 
 * @author haycco
 */
public class UserInfo implements IUserInfo {
    /*
     * ��ü�ͥ��ַ����������Ҳ�����ҵ��ط�
     */
    public String getHomeAddress() {
        System.out.println("������Ա���ļ�ͥ��ַ....");
        return null;
    }

    /*
     * ��ü�ͥ�绰����
     */
    public String getHomeTelNumber() {
        System.out.println("Ա���ļ�ͥ�绰��....");
        return null;
    }

    /*
     * Ա����ְλ���ǲ��ž�����С��
     */
    public String getJobPosition() {
        System.out.println("����˵�ְλ��BOSS....");
        return null;
    }

    /*
     * �ֻ�����
     */
    public String getMobileNumber() {
        System.out.println("����˵��ֻ�������0000....");
        return null;
    }

    /*
     * �칫�ҵ绰�������ʱ����á���С�ġ��ѵ绰���ߵ����Ҿ�����ô�ɣ��Լ����˶��кô�
     */
    public String getOfficeTelNumber() {
        System.out.println("�칫�ҵ绰��....");
        return null;
    }

    /*
     * �����ˣ��������Ҫ��
     */
    public String getUserName() {
        System.out.println("��������...");
        return null;
    }
}
