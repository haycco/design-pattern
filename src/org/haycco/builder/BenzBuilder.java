package org.haycco.builder;

import java.util.ArrayList;

/**
 * Description:各种设施都给了，我们按照一定的顺序制造一个奔驰车
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
