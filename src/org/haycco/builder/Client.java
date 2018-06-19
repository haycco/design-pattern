package org.haycco.builder;


/**
 * Description:最终客户开始使用这个模型
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        // 10辆A类型的奔驰车
        for (int i = 0; i < 1; i++) {
            director.getABenzModel().run();
        }
        System.out.println("-------------------华丽的分割线-------------------");
        
        // 20辆B类型的奔驰车
        for (int i = 0; i < 2; i++) {
            director.getBBenzModel().run();
        }
        System.out.println("-------------------华丽的分割线-------------------");
        
        // 30辆C类型的宝马车
        for (int i = 0; i < 3; i++) {
            director.getCBMWModel().run();
        }
    }

}
