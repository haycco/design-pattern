package org.haycco.multition;

/**
 * 大臣们悲惨了，一个皇帝都伺候不过来了，现在还来了两个个皇帝 TND，不管了，找到个皇帝，磕头，请按就成了！
 * 
 * @author haycco 2011-7-27 下午4:57:35
 * @version V1.0
 */
@SuppressWarnings("all")
public class Minister {
    
    public static void main(String[] args) {
        int ministerNum = 9; // 10个大臣
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
