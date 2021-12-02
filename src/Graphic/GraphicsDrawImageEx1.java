package Graphic;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{					//GUI��ü

	public GraphicsDrawImageEx1() {									//������
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");					//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				//�ݱ�
		setContentPane(new MyPanel());								//GUI����â ��ü
		
		setSize(300,400);											//ũ��
		setVisible(true);											//���̱�
	}
	
	class MyPanel extends JPanel{									//JPanel�� ��ӹ��� �׸��ⰴü
		private ImageIcon icon = new ImageIcon("images/image0.jpg");//�̹����� �̹��������ܰ�ü�� �ű�
		private Image img = icon.getImage();						//�̹����������� �̹����� �޾� �����ܰ�ü�� ����
		
		public void paintComponent(Graphics g) {					//GUI�׸���� �޼���
			super.paintComponent(g);								//������ �׸��� �޼��带 ȣ��
			
			g.drawImage(img, 20, 20, this);							//�̹��� ��ü�� �޾� ����� ����
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
}
