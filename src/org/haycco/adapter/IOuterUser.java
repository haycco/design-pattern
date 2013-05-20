/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   IOuterUser.java 
 * Comments:                   ����ģʽ(Adapt Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-15 ����9:59:14   
 * Version:                    1.0
 *
 */
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
