package org.haycco.multition;

/**
 * ���Ǳ����ˣ�һ���ʵ۶��ź򲻹����ˣ����ڻ������������ʵ� TND�������ˣ��ҵ����ʵۣ���ͷ���밴�ͳ��ˣ�
 * 
 * @author haycco 2011-7-27 ����4:57:35
 * @version V1.0
 */
@SuppressWarnings("all")
public class Minister {
    
    public static void main(String[] args) {
        int ministerNum = 9; // 10����
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("��" + (i + 1) + "���󳼲ΰݵ��ǣ�");
            emperor.emperorInfo();
        }
    }
}
