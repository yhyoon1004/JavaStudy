package Graphic;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawLineEx extends JFrame{				//JFrame������� ���� GUI
	public GraphicsDrawLineEx() {							//������ 
		setTitle("drawLine��� ����");							//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//�ݱ�
		setContentPane(new MyPanel());						//����â�� MyPanel�� ����
		
		setSize(200,150);									//������
		setVisible(true);									//���̱�
	}
	
	class MyPanel extends JPanel{							//���
		public void paintComponent(Graphics g) {			//paintComponent()
			super.paintComponent(g);						//������ paintComponent ȣ��
			g.setColor(Color.RED);							//���� red�� ����
			g.drawLine(20,20,100,100);						//���׸��� x�� 100�ȼ�,y�� 100�ȼ���ŭ
		}
	}
	
	public static void main(String[] args	) {
		new GraphicsDrawLineEx();
	}

}
