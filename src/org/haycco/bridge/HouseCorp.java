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
