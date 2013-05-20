package org.haycco.abstractfactory.yellow;

/**
 * @author haycco 2011-8-15 下午5:06:13
 * @version V1.0
 * 女性黄种人
 */
public class YellowFemaleHuman extends AbstractYellowHuman {

    /* (non-Javadoc)
     * @see org.haycco.abstractfactory.Human#sex()
     */
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }

}
