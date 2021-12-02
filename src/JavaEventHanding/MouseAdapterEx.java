package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {//JFrame�� ��ӹ޾������� �ֻ��� �����̳�
	private JLabel la = new JLabel("Hello");//�� �ؽ�Ʈ�� Hello

	public MouseAdapterEx() {//������
		setTitle("Mouse �̺�Ʈ ����");// ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ ���� ��ư Ŭ���� ���α׷�����
		Container c = getContentPane();//
		c.addMouseListener(new MyMouseAdapter());

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(200, 200);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
