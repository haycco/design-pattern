package org.haycco.abstractfactory.black;

/**
 * @author haycco 2011-8-15 下午5:09:43
 * @version V1.0
 * 男性黑种人
 */
public class BlackMaleHuman extends AbstractBlackHuman {

    /* (non-Javadoc)
     * @see org.haycco.abstractfactory.Human#sex()
     */
    public void sex() {
        System.out.println("该黑种人的性别为男....");
    }

}
