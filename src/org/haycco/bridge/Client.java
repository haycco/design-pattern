/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Client.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����8:58:32   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description:��Ҫ�������Լ��Ĺ�˾��
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------���ز���˾������������е�-------");
        // ���ҵ��ҵĹ�˾
        HouseCorp houseCorp = new HouseCorp(house);
        // ������ô��Ǯ
        houseCorp.makeMoney();
        
        System.out.println("\n");
        // ɽկ��˾�����Ĳ�Ʒ�ܶ࣬������ֻҪָ����Ʒ�ͳ���
        System.out.println("-------ɽկ��˾���������е�-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
//        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }

}
