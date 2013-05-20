/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Corp.java 
 * Comments:                   ����ģʽ��Bridge Pattern��                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2012-1-10 ����8:52:53   
 * Version:                    1.0
 *
 */
package org.haycco.bridge;

/**
 * Description: ����һ����˾�ĳ�����
 * 
 * @author haycco
 */
public abstract class Corp {

    // ����һ����Ʒ���󣬳�����ˣ���֪��������ʲô��Ʒ
    private Product product;

    // ���캯���������ඨ�崫�ݾ���Ĳ�Ʒ����
    public Corp(Product product) {
        this.product = product;
    }

    // ��˾�Ǹ�ʲô�ģ�׬Ǯ��ѽ����׬Ǯɵ�ӲŸ�
    public void makeMoney() {
      //ÿ����˾����һ����������
        this.product.beProducted();
        //Ȼ������
        this.product.beSelled();
    }
}
