package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {//JFrame�� ��ӹ޾������� GUI�������α׷�
	public AnonymousClassListener() {//���� Ŭ���� �͸�Ŭ����������
		setTitle("Action �̺�Ʈ ������ �ۼ�");//�ֻ��� �����̳� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ֻ��� �����̳� �ݱ� Ŭ���� ���α׷� ����

		Container c = getContentPane();//�������� c�� ����Ʈ�� �ҷ���
		c.setLayout(new FlowLayout());//��ġ������ FlowLayout���� ����
		JButton btn = new JButton("Action");//��ư���� �̸��� "Action"
		c.add(btn);//ContentPane�� ������ ���� ��ư �߰� 
		
		btn.addActionListener(new ActionListener() {//�̺�Ʈ�����ʸ� ��ư�� ��� (�͸�Ŭ����)
			public void actionPerformed(ActionEvent e) {//�͸�Ŭ���� �޼��屸��(ActionListener�� actionPerformed�޼��� ����
				JButton b = (JButton)e.getSource();//�������Ʈ�� �̺�Ʈ�� �߻��ߴ��� �̺�Ʈ�ҽ��� �˷��ִ� getSource()�޼���
				if(b.getText().equals("Action"))//�Ű������� �޾ƿ� ����ȯ�� ��ư�� text������ Action�� ������ 
					b.setText("�׼�");//����ȯ�� ��ư�� text�� "�׼�"���� ����
				else
					b.setText("Action");//�ƴҰ�� "Action"���� ����
				
				//AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
				setTitle(b.getText());//�ֻ��� �����̳��� ������ ����ȯ�� ��ü�� text�� ����
			}
		});
		
		setSize(200,120);//�ֻ��� �����̳��� ũ�⸦ 200,120���� ����
		setVisible(true);//�ֻ��� ��ü�̳� ���̱� ���� true
	}

	public static void main(String[] args)	{
		new AnonymousClassListener();//JFrame�� ������ GUI�������α׷� ����
	}
}
