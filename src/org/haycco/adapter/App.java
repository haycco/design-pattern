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
