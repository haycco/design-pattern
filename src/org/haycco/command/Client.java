package org.haycco.command;

/**
 * Description: �ͻ����Ǽ׷���������Ǯ��һ�������ϴ�
 * 
 * @author haycco
 */
public class Client {

    public static void main(String[] args) {
        // �������ǵĽ�ͷ��
        Invoker xiaoSan = new Invoker(); // ��ͷ�˾�����С��
        // �ͻ�Ҫ������һ������
        System.out.println("-------------�ͻ�Ҫ������һ������-----------------");
        // �ͻ���������������
//        Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        // ��ͷ�˽��յ�����
        xiaoSan.setCommand(command);
        // ��ͷ��ִ������
        xiaoSan.action();
    }

}
