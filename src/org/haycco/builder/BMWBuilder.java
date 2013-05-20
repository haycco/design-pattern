/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   BMWBuilder.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:40:26   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

import java.util.ArrayList;

/**
 * Description:����һ��˳�򣬷���һ������
 * 
 * @author haycco
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
    
}
