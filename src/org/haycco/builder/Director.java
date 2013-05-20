/**
 * CopyRright (c) 2000-2011:   www.ygsoft.com                          
 * Project:                    design-pattern
 * FileName:                   Director.java 
 * Comments:                   ������ģʽ(Builder Pattern)                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-12-16 ����2:45:07   
 * Version:                    1.0
 *
 */
package org.haycco.builder;

import java.util.ArrayList;

/**
 * Description:���ݰ���˳����������ģ��
 * 
 * @author haycco
 */
public class Director {
    
    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /*
     * A���͵ı��۳�ģ�ͣ���start,Ȼ��stop,����ʲô�����ˣ�����һ��û��
     */
    public BenzModel getABenzModel() {
        // ��������������һЩ��������Ա��ע��ĵط�
        this.sequence.clear();
        // ��ֻABenzModel��ִ��˳��
        this.sequence.add("start");
        this.sequence.add("stop");
        // ����˳�򷵻�һ�����۳�
        this.benzBuilder.setSequence(this.sequence);
        
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /*
     * B�ͺŵı��۳�ģ�ͣ����ȷ������棬Ȼ��������Ȼ��ֹͣ��û������
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /*
     * C�ͺŵı������Ȱ������ȣ���ҫ���Ȼ��������Ȼ��ֹͣ
     */
    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /*
     * D���͵ı���ֻ��һ�����ܣ������ܣ������������ܣ���Զ��ֹͣ��ţ��
     */
    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        
        return (BMWModel) this.benzBuilder.getCarModel();
    }
    
    /*
     * ���ﻹ�����кܶ෽�����������ֹͣ��Ȼ��������������һֱͣ�Ų�������̬���� �����������ʲô˳���ǵ���˵����
     */
}
