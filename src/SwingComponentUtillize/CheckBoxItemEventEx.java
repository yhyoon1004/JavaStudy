package SwingComponentUtillize;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];				//üũ�ڽ� �迭 ����
	private String[] names = { "���", "��", "ü��" };				//���ڿ� �迭 ���� 

	private JLabel sumLabel;									//�հ� ���̺� ����

	public CheckBoxItemEventEx() {								//������
		setTitle("üũ�ڽ� �� ItemEvent ����");						//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//�ݱ��ư
		Container c = getContentPane();							// ����â �����̳� �������� ����
		c.setLayout(new FlowLayout());							//�帧 ��ġ������

		c.add(new JLabel("�ð� 100��, �� 500��, ü�� 2000��"));		//����ǥ ���̺� �߰�

		MyItemListener listener = new MyItemListener(); 		//�̺�Ʈ������(������)	(��� ��Ҹ� ������ ����ϱ� �������ϱ� �ݺ����� ����������)
		
		
		for (int i = 0; i < fruits.length; i++) {				//üũ�ڽ��迭 ��� ������ŭ �ݺ�
			fruits[i] = new JCheckBox(names[i]);				//üũ�ڽ� �迭�� �����̸� ��Ҹ� �־� �ʱ�ȭ
			fruits[i].setBorderPainted(true);					//üũ�ڽ��� �ܰ����� ���̵��� ����
			c.add(fruits[i]);									//�����̳ʿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener);				//üũ�ڽ�[i]��ҿ� �̺�Ʈ�����ʸ� ���
		}

		sumLabel = new JLabel("���� 0�� �Դϴ�.");					// �ʱ� �հ� ���̺�
		c.add(sumLabel);										//����Ʈ�ҿ� �հ跹�̺� �ޱ�

		setSize(250, 200);										//����Ʈ�� ������ ����
		setVisible(true);										//���̱�
	}

	class MyItemListener implements ItemListener {				//�����۸����ʸ� �����ϴ� ������
																//ItemListener �������̽��� itemStateChanged()�޼ҵ常 ����Ǿ�����
		private int sum = 0;									//���� ������ ���� sum����

		public void itemStateChanged(ItemEvent e) {				//ItemListener�������̽��� ������ִ� itemStateChaged�޼���(�������̽��ȿ� �̰͸� ����)

			if (e.getStateChange() == ItemEvent.SELECTED) {		//���� �̺�Ʈ�� ���¿��ΰ� SELECTED�Ͻ�
				if (e.getItem() == fruits[0])					//�߻��� �̺�Ʈ�� fruits[0]�̶� ���� �� sum�� 100�� ����
																//getItem()�޼����  �̺�Ʈ�� �߻���Ų ������ ��ü���� 	(Object���� ��ӵ� �޼���)
					sum += 100;
				else if (e.getItem() == fruits[1])				//�߻��� �̺�Ʈ�� fruits[1]�̶� ���� �� sum�� 100�� ����
					sum += 500;
				else											//�߻��� �̺�Ʈ�� fruits[2]�̶� ���� �� sum�� 2000�� ����
					sum += 2000;

				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
			}

			else {												//���� �̺�Ʈ�� ���¿��ΰ� SELECTED�� �ƴҽ�
				if (e.getItem() == fruits[0])					//�߻��� �̺�Ʈ�� fruits[0]�̶� ���� �� sum�� 100�� ��
					sum -= 100;
				else if (e.getItem() == fruits[1])				//�߻��� �̺�Ʈ�� fruits[1]�̶� ���� �� sum�� 500�� ��
					sum -= 500;
				else											//�߻��� �̺�Ʈ�� fruits[2]�̶� ���� �� sum�� 2000�� ��
					sum -= 2000;
			}
			sumLabel.setText("����" + sum + "�� �Դϴ�.");

		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
