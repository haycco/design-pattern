package org.haycco.strategy;

/**
 * �����̫�����̵�
 * 
 * @author haycco 2011-7-27 ����3:45:03
 * @version V1.0
 */
public class GivenGreenLight implements IStrategy {

    /* (non-Javadoc)
     * @see org.haycco.strategy.IStrategy#operate()
     */
    public void operate() {
        System.out.println("�����̫�����̵�,���У�");
    }

}
