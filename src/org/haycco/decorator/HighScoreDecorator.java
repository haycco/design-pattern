package org.haycco.decorator;

/**
 * Description: ��Ҫ����ѧУ����߳ɼ������ϰ�
 * 
 * @author haycco
 */
public class HighScoreDecorator extends Decorator {
    
    // ���캯��
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    // ��Ҫ�㱨��߳ɼ�
    private void reportHighScore() {
        System.out.println("��ο������������75����ѧ��78����Ȼ��80");
    }

    // ��߳ɼ���Ҫ���ϰֿ��ɼ���ǰ���������������һ�������������������ң����ǻ��л���˵ѽ
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
    
}
