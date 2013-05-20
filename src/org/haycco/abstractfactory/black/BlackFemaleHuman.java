package org.haycco.abstractfactory.black;

/**
 * @author haycco 2011-8-15 下午5:06:13
 * @version V1.0
 * 女性黑种人
 */
public class BlackFemaleHuman extends AbstractBlackHuman {

    /* (non-Javadoc)
     * @see org.haycco.abstractfactory.Human#sex()
     */
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }

}
