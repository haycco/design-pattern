package org.haycco.abstractfactory.yellow;

/**
 * @author haycco 2011-8-15 下午5:09:43
 * @version V1.0
 * 男性黄种人
 */
public class YellowMaleHuman extends AbstractYellowHuman {

    /* (non-Javadoc)
     * @see org.haycco.abstractfactory.Human#sex()
     */
    public void sex() {
        System.out.println("该黄种人的性别为男....");
    }

}
