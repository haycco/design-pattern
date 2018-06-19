package org.haycco.bridge;

/**
 * Description:我是山寨老大，你流行啥我就生产啥
 * 
 * @author haycco
 */
public class ShanZhaiCorp extends Corp {
    
    // 产什么产品，不知道，等被调用的才知道
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    // 狂赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
    
}
