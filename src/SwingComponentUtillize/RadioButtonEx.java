package SwingComponentUtillize;

import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {// JFrame���
	public RadioButtonEx() {//������ 
		setTitle("������ư ����� ����");//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ��ư
		Container c = getContentPane();//����â���� 
		c.setLayout(new FlowLayout());//��ġ������

		//������ư ����°� 1�ܰ� ��ư �׷츸���
		ButtonGroup g = new ButtonGroup();//��ư �׷� ��ü ����

		//������ư ����� 2�ܰ� ������ư ����
		JRadioButton apple = new JRadioButton("���");//������ư ����
		JRadioButton pear = new JRadioButton("��", true);//��ư üũ���ִ� ����
		JRadioButton cherry = new JRadioButton("ü��");

		//������ư ����� 3�ܰ� ��ư �׷쿡 ���� ��ư�߰��ϱ� 
		g.add(apple);//��ư �׷쿡 �߰� 
		g.add(pear);
		g.add(cherry);
		
		//������ư ����� 4�ܰ� ��ư �����̳ʿ� ����ϱ�
		c.add(apple);//�����̳ʿ� ��ü�߰�
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
