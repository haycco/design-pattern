package org.haycco.abstractfactory.white;

/**
 * @author haycco 2011-8-15 下午5:06:13
 * @version V1.0
 * 女性白种人
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {

    /* (non-Javadoc)
     * @see org.haycco.abstractfactory.Human#sex()
     */
    public void sex() {
        System.out.println("该白种人的性别为女...");
    }

}
