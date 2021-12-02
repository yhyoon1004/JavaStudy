package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {//public Ŭ���� ������ 
		setTitle("Action �̺�Ʈ ������ ����");//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���� ��ư���� ����
		
		Container c = getContentPane();//����â �����̳� ����
		c.setLayout(new FlowLayout());//����â ��ġ���� ����
		JButton btn = new JButton("Action");//��ư ���� text�� "Action"
		btn.addActionListener(new MyActionListener());//��ư�� �̺�Ʈ������ ���
		c.add(btn);//����â �����̳ʿ� ��ư�� �߰�
		
		setSize(200,120);//����â �����̳� ������ ����
		setVisible(true);//����â ���̱�
		
	}

	private class MyActionListener implements ActionListener{//�׼Ǹ����� �������̽��� ��ӹ��� Ŭ���� 
		public void actionPerformed(ActionEvent e) {//�׼Ǹ����� �߻�޼��� ����
			JButton b = (JButton)e.getSource();//��ư����
			if(b.getText().equals("Action"))// �ý�Ʈ�� "Action"�� ������ �Ʒ� ��ɹ� ����
				b.setText("�׼�");//�ý�Ʈ�� "�׼�"���� ����
			else
				b.setText("Action");// �ƴҰ�� "Action"���� ����
			
			InnerClassListener.this.setTitle(b.getText());//â�̸��� ����Ŭ������ ��ư�̸����� ����
		}
	}
	
	public static void main(String[] args) {
		new InnerClassListener();// ��ü �ڽ� ����
	}
	
}
