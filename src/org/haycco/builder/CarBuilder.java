/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   CarBuilder.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:37:44   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

import java.util.ArrayList;

/**
 * Description:Ҫʲô˳��ĳ�����˵���Ҹ��������
 * 
 * @author haycco
 */
public abstract class CarBuilder {
    
    // ����һ��ģ�ͣ���Ҫ����һ��˳��Ҫ��������װ˳��
    public abstract void setSequence(ArrayList<String> sequence);

    // �������˳��󣬾Ϳ���ֱ���õ��������ģ��
    public abstract CarModel getCarModel();
    
}
