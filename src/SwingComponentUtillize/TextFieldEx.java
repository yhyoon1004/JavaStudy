package SwingComponentUtillize;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {								//������
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ��ư Ȱ��ȭ
		Container c = getContentPane();					//����â �����̳� ����
		c.setLayout(new FlowLayout());					//��ġ������

		c.add(new JLabel("�̸�   "));						//���̺� �߰�
		c.add(new JTextField(20));						//20��¥�� �ؽ�Ʈ �ʵ� ����
		c.add(new JLabel("�а�   "));						//���̺� �߰�
		c.add(new JTextField("����Ʈ������а�", 20));		//�ش� ���ڿ��� �Էµ� ������ �ؽ�Ʈ�ʵ� ���� 20��¥�� 
		c.add(new JLabel("�ּ�   "));
		c.add(new JTextField("����� ...", 20));

		setSize(300, 130);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TextFieldEx();
	}

}
