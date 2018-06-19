package org.haycco.decorator;

/**
 * Description: �ϰֿ��ɼ�����
 * 
 * @author haycco
 */
public class Father {

    public static void main(String[] args) {
        // �ɼ����ù���
        SchoolReport sr;
        sr = new FouthGradeSchoolReport(); // ԭװ�ĳɼ���
        // ������߷�˵���ĳɼ���
        sr = new HighScoreDecorator(sr);
        // �ּ��˳ɼ�������˵��
        sr = new SortDecorator(sr);
        // ���ɼ���
        sr.report();
        // Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
        sr.sign("����"); // �ҽ�С�����ϰֵ�Ȼ������
    }

}
