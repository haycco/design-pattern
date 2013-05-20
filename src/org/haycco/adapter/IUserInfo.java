/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   IUserInfo.java 
 * Comments:                   ����ģʽ(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����9:53:10   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

/**
 * Description: �û���Ϣ����
 * 
 * @author haycco
 */
public interface IUserInfo {
    // ����û�����
    public String getUserName();

    // ��ü�ͥ��ַ
    public String getHomeAddress();

    // �ֻ����룬���̫��Ҫ���ֻ�����ѽ
    public String getMobileNumber();

    // �칫�绰��һ��ʽ����
    public String getOfficeTelNumber();

    // ����˵�ְλ��ɶ
    public String getJobPosition();

    // ��ü�ͥ�绰������е�ȱ�£����ǲ�ϲ�����ͥ�绰���۹���
    public String getHomeTelNumber();
}
