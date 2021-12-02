package SwingComponentUtillize;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame {
	private String[] fruits = { "apple", "banana", "mango" };//���� ���� �����ڷ� ��Ʈ���迭 ����

	private ImageIcon[] images = { 							//���� ���� �����ڷ� �̹��������� ��ü �迭�� ����
			new ImageIcon("images/apple.jpg"),				//�̹��������� Ŭ���� ��ü ����
			new ImageIcon("images/banana.jpg"),				
			new ImageIcon("images/mango.jpg") };

	private JLabel imgLabel = new JLabel(images[0]);		//�̹��� ǥ���� ���� ���̺� ����

	public ComboActionEx() {								//ComboActionEx ������
		setTitle("�޺��ڽ� Ȱ�� ����");
		Container c = getContentPane();			//�����̳� ����
		c.setLayout(new FlowLayout());			//�÷ο� ��ġ������
		JComboBox<String> combo = new JComboBox<String>(fruits);//��Ʈ��Ÿ���� �޺��ڽ� ��ü�� �޴�  ��Ʈ�� �޺��ڽ����� 
		c.add(combo);										//�����̳ʿ� �޺��ڽ� �߰�
		c.add(imgLabel);									//���̺� �߰�

		combo.addActionListener(new ActionListener() {		//�޺��ڽ��� �׼Ǹ����� ��� + �͸�Ŭ����
			public void actionPerformed(ActionEvent e) {	//�׼Ǹ����� �߻�޼��� ����
				JComboBox<String> cb = (JComboBox<String>)e.getSource();//�߻��� �׼��̺�Ʈ�� �ҽ��� �޾ƿ� �޺��ڽ��� ����ȯ

				int index = cb.getSelectedIndex();			//���õ� ��ư��ü�迭�� �ε����� ��ȯ
 
				imgLabel.setIcon(images[index]);			//�̹������, �̹��������� �迭���� �ش��ε����� ǥ��
			}
		});

		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}
}
