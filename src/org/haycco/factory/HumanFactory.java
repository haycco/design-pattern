package org.haycco.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.haycco.util.ClassUtils;

/**
 * ����¯��ר��������������
 * 
 * @author haycco 2011-7-27 ����5:31:34
 * @version V1.0
 */
@SuppressWarnings("all")
public class HumanFactory {

    // ����һ��MAP,��ʼ������Human���󶼷�������
    private static HashMap<String, Human> humans = new HashMap<String, Human>();

    // ��һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ���
    public static Human createHuman(Class<?> c) {
        // ����һ�����͵�����
        Human human = null;
        try {
            // ����һ������
            // human = (Human) Class.forName(c.getName()).newInstance();
            // ���MAP���У���ֱ�Ӵ�ȡ�������ó�ʼ����
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                // �ŵ�MAP��
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            // ��Ҫ�ǲ�˵��������ɫ�Ļ���û������Ҫ��Ҫ�ڣ���˵���˲źÿ�
            System.out.println("����ָ���������ɫ");
        } catch (IllegalAccessException e) {
            // ��������������⣬�ǾͿ��������ˣ�����...
            System.out.println("���ඨ�����");
        } catch (ClassNotFoundException e) {
            // �����˵�����࣬�ҵ������������ȥ����
            System.out.println("�쵰����ָ���������Ҳ�����");
        }
        return human;
    }

    // Ů������ˣ���һ�������������¯��������ɶ�����ɶ����
    public static Human createHuman() {
        // ����һ�����͵�����
        Human human = null; 
        // �����ǻ���ж��ٸ�ʵ���࣬���ٸ�����
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class); // �����˶�������
        // ����¯�Լ���ʼ���ճ�ʲô�˾�ʲô��
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}
