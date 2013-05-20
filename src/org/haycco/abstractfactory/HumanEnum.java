package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 下午5:17:56
 * @since JDK_1.5.0 世界上有哪些类型的人，列出来
 */
public enum HumanEnum {

    // 把世界上所有人类型都定义出来
    YelloMaleHuman("org.haycco.abstractfactory.yellow.YellowMaleHuman"), 
    YelloFemaleHuman("org.haycco.abstractfactory.yellow.YellowFemaleHuman"), 
    WhiteFemaleHuman("org.haycco.abstractfactory.white.WhiteFemaleHuman"),
    WhiteMaleHuman("org.haycco.abstractfactory.white.WhiteMaleHuman"), 
    BlackFemaleHuman("org.haycco.abstractfactory.black.BlackFemaleHuman"), 
    BlackMaleHuman("org.haycco.abstractfactory.black.BlackMaleHuman");

    private String value = "";

    // 定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
