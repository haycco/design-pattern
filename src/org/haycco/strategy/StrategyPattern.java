package org.haycco.strategy;

/**
 * 策略模式
 * 
 * @author haycco 2011-7-27 下午3:38:03
 * @version V1.0
 */
public class StrategyPattern {

    /**
    * 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
    */
    public static void main(String[] args) {
        Context context;
        
        //刚刚到吴国的时候拆第一个
        System.out.println("-----------------刚到吴国的时候,拆第一个锦囊--------------------\n");
        context = new Context(new BackDoor());//拿到妙计
        context.operate();//拆开执行
        System.out.println("\n");
        
        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------------刘备乐不思蜀了，拆第二个锦囊-------------------\n");
        context = new Context(new GivenGreenLight());//拿到妙计
        context.operate();//执行了第二个锦囊妙计
        System.out.println("\n");
        
        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------------孙权的小兵追了，咋办？拆第三个锦囊-------------\n");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("\n");
    }
}
