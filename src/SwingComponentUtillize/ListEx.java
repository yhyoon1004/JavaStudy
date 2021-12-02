package SwingComponentUtillize;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", "mango",//���ڿ� �迭 ���� (����)
			"pear", "peach", "berry", "strawberry",
			"blackberry" };
	private ImageIcon[] images = { //�̹��������ܵ� ����
			new ImageIcon("�ּ�"), 
			new ImageIcon("address"), 
			new ImageIcon("address"),
			new ImageIcon("address") };

	public ListEx() {//������
		setTitle("����Ʈ ����� ����");//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ��ư
		Container c = getContentPane();//�����̳� ����
		c.setLayout(new FlowLayout());//��ġ������

		JList strList = new JList<String>(fruits);//����Ʈ ���� �̹����������� ���������� ������ ����Ʈ
		c.add(strList);//�����̳ʿ� ����Ʈ�� �߰� 

		JList<ImageIcon> imageList = new JList<ImageIcon>();//�̹��� ����Ʈ ����
		imageList.setListData(images);//images�迭�� ������ imageList�� �߰���
		c.add(imageList);//�����̳ʿ� �̹�������Ʈ�� �߰�
//=========================================================================================//
		JList<String> scrollList = new JList<String>(fruits);//
		c.add(new JScrollPane(scrollList));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}
}
