package org.haycco.proxy;

/**
 * 代理模式
 * 
 * @author haycco 2011-7-27 下午4:29:20
 * @version V1.0
 */
public class ProxyPattern {

    //定义一个西门庆，这人色中饿鬼
    public static void main(String[] args) {
        
        WangPo wangPo = new WangPo();
        
        // 然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
        wangPo.makeEyesWithMan(); // 看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
        wangPo.happyWithMan();
        
        JiaShi jiaShi = new JiaShi();
        WangPo wangpo = new WangPo(jiaShi);//让王婆作为贾氏的代理人
        
        wangpo.makeEyesWithMan();
        wangpo.happyWithMan();
    }
}
