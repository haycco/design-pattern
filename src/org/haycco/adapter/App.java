/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   App.java 
 * Comments:                   ����ģʽ(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����9:57:18   
 * Version:                    1.0
 *
 */
package org.haycco.adapter;

/**
 * Description:��������Ǿ����Ӧ���ˣ������ϰ�Ҫ�����е�20-30��Ů����Ϣ
 * 
 * @author haycco
 */
public class App {

    public static void main(String[] args) {
        // û������ϵͳ���ӵ�ʱ��������д��
//        IUserInfo youngGirl = new UserInfo();
        
        // �ϰ�һ�벻��ѽ�����Ӳ����ѱ߲ݣ�������������Դ��Ա���õ�
        IUserInfo youngGirl = new OuterUserInfo(); // ����ֻ�޸�����һ���
        // �����ݿ��в鵽101��
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }

}
