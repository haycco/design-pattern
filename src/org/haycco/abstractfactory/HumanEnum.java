package org.haycco.abstractfactory;

/**
 * @author haycco
 * @version V1.0 2011-8-15 ����5:17:56
 * @since JDK_1.5.0 ����������Щ���͵��ˣ��г���
 */
public enum HumanEnum {

    // �����������������Ͷ��������
    YelloMaleHuman("org.haycco.abstractfactory.yellow.YellowMaleHuman"), 
    YelloFemaleHuman("org.haycco.abstractfactory.yellow.YellowFemaleHuman"), 
    WhiteFemaleHuman("org.haycco.abstractfactory.white.WhiteFemaleHuman"),
    WhiteMaleHuman("org.haycco.abstractfactory.white.WhiteMaleHuman"), 
    BlackFemaleHuman("org.haycco.abstractfactory.black.BlackFemaleHuman"), 
    BlackMaleHuman("org.haycco.abstractfactory.black.BlackMaleHuman");

    private String value = "";

    // ���幹�캯����Ŀ����Data(value)���͵���ƥ��
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
