package SwingComponentUtillize;

import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;

public class TextAreaEx extends JFrame {

	private JTextField tf = new JTextField(20);// ���ڿ����̰� 20������ �ؽ�Ʈ �ʵ� ����
	private JTextArea ta = new JTextArea(7, 20);// 7�� 20������ �ؽ�Ʈ ����� ����

	public TextAreaEx() {						//������
		setTitle("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("�Է��� <Enter> Ű�� �Է��ϼ���."));		//�����̳ʿ� ���̺� �߰�
		c.add(tf);											//�����̳ʿ�  �ؽ�Ʈ�ʵ� �߰�
		c.add(new JScrollPane(ta));							//��ũ������ ���� �ؽ�Ʈ����� �߰�

		tf.addActionListener(new ActionListener() {			//�ؽ�Ʈ�ʵ忡 �׼Ǹ����� ��� 
			public void actionPerformed(ActionEvent e) {	//�׼Ǹ����� �߻�޼��� ����
				JTextField t = (JTextField) e.getSource();	//�߻��� �׼��̺�Ʈ�� �ҽ��� �޾� �ؽ�Ʈ�ʵ�� ����ȯ
				ta.append(t.getText() + "\n");				//�ý�Ʈ�ʵ忡�� �ؽ�Ʈ�� �޾� �ؽ�Ʈ���� �߰����ְ� ���� ���
				t.setText("");								//�ؽ�Ʈ�ʵ忡 �ý�Ʈ�� ���ڿ��� �ʱ�ȭ
			}
		});

		setSize(300, 250);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TextAreaEx(); 
	}
}
