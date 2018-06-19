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
