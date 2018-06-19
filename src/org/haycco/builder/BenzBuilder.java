package org.haycco.builder;

import java.util.ArrayList;

/**
 * Description:������ʩ�����ˣ����ǰ���һ����˳������һ�����۳�
 * 
 * @author haycco
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

}
