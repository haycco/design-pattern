package org.haycco.adapter;

import java.util.Map;

/**
 * Description:��ϵͳ����Ա��Ϣ
 * 
 * @author haycco
 */
public interface IOuterUser {
    // ������Ϣ���������ƣ��Ա��ֻ������˵�
    public Map<?, ?> getUserBaseInfo();

    // ����������Ϣ
    public Map<?, ?> getUserOfficeInfo();

    // �û��ļ�ͥ��Ϣ
    public Map<?, ?> getUserHomeInfo();
}
