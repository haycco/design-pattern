/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   HouseCorp.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����8:55:33   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:���ز���˾�����շ�����˵Ӧ�ý�realty corp������ǱȽ�׼ȷ�ķ���
 * ���������㷿�ز���˾�����Ӣ�ģ����һ��Ӧʲô�����ﻹ��house corp!
 * 
 * @author haycco
 */
public class HouseCorp extends Corp {

    // ���崫��һ��House��Ʒ����
    public HouseCorp(House house) {
        super(house);
    }

    // ���ز���˾��High�ˣ�׬Ǯ����������
    public void makeMoney() {
        super.makeMoney();
        System.out.println("���ز���˾׬��Ǯ��...");
    }

}
