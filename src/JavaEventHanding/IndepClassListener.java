package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//����Ŭ���������� Ŭ���� ���� + JFrame�� ��ӹ޾������� contentsPane ����â�� �����Ҽ�����
public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");//â ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ� ��ư Ȱ��ȭ
		
		Container c = getContentPane();// ����â �����̳� ���� 
		c.setLayout(new FlowLayout());//���̾ƿ� ���¸� FLOW������ ����
		JButton btn = new JButton("Hello");//"Action"�̸��� ��ư ����
		btn.addActionListener(new MyActionListener());//�׼Ǹ����� �Ӽ� �ο�
		c.add(btn);//����â �����̳ʿ� ������ ��ư�� �־���
		
		setSize(250,120);//����â ũ�⸦ ����
		setVisible(true);//����â�� ���̰� ����
	}
	public static void main(String[] args) {//main�޼��� 
		new IndepClassListener();// ����Ŭ���������� ����
	}
}

class MyActionListener implements ActionListener{//ActionListener�� ������ MyActionListener ����
	public void actionPerformed(ActionEvent e) { //public actionPerformed�޼��� �Ű������� ActionEvent�� ��ü�� ����
		JButton b = (JButton)e.getSource();// �޾ƿ� �׼��̺�Ʈ�� ��ư�� ���������� �־���
		if(b.getText().equals("Action"))//�Ű���ü�� �ý�Ʈ ������ "Action"�� ���ڿ� ������ ������ ��ɼ���
			b.setText("�׼�"); //�Ű���ü�� �ý�Ʈ ������ "�׼�"���� ����
		else
			b.setText("Action");//�ƴҰ�� "Action"���� �ý�Ʈ����
	}
}
