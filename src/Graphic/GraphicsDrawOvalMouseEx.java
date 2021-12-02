package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class - main - contstructor - container(panel) - event(mouse) stand by - event occur - x,y save - paintComponent()[by java plateform]

public class GraphicsDrawOvalMouseEx extends JFrame {								//public class
	public GraphicsDrawOvalMouseEx() {												//constructor
		setTitle("���콺 �巡������ Ÿ�� �׸��� ����");										//title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);								//close
		setContentPane(new MyPanel());												//s et ContentPane as MyPanel

		setSize(300, 300);															//size
		setVisible(true);															//vis
	}

	public static void main(String[] args) {										//main
		new GraphicsDrawOvalMouseEx();	
	}

	class MyPanel extends JPanel {													//class MyPanel
		private Point start = null, end = null;										//Point�� �������� ���� ����, ��

		class MyMouseListener extends MouseAdapter {								//���콺 �̺�Ʈ ��ü ��
			public void mousePressed(MouseEvent e) {								//MouseAdapter�� �޼��� �������̵� �ܺ�Ŭ���� Point��ü start�� ���콺 Point��ü�� �޾ƿ�
				start = e.getPoint();//���콺 ������ �� �ش� ��ǥ�� �ܺ�Ŭ���� Point�� ���������� ����
			}
			
			public void mouseDragged(MouseEvent e) {								//�巡������ ��
				end = e.getPoint();													// end��ü�� ����Ʈ�� �޾ƿ�
				repaint();															//repaint�޼��� ȣ��
			}
		}// innerclass MyMouseListener

		public MyPanel() {															//MyPanel constructor
			MyMouseListener listener = new MyMouseListener();						//���콺������ ����
			
			addMouseListener(listener);												//���콺 ������ ���
			addMouseMotionListener(listener);										//���콺 ��Ǹ����� ���
		}


		public void paintComponent(Graphics g) {							//paintComponent�޼��� �������̵�
			super.paintComponent(g);										//������ paintComponent�޼��� ȣ��
			if(start == null)												//start��ü�� ���� null,������ 
				return;														//�ƹ��͵� ��ȯ��������
			g.setColor(Color.BLUE);											//�׷��� ��ü g�� ������
			int x = Math.min(start.x, end.x);								//x��ǥ�� ���� Math�� �ּҰ� �� �޼���� ��ȯ
			int y = Math.min(start.y, end.y);								//y��ǥ�� ���� ...
			int width = Math.abs(start.x-end.x);							//���̸� Math�� ���밪���ϴ� �޼���� ����
			int height = Math.abs(start.y-end.y);							//���̸� ...
			g.drawOval(x, y, width, height);								//Graphics�� ���׸��� �޼���� x��ǥ, y��ǥ, ����, ���̸� �̿��� ���� �׸�
			
			
		}
		
		
		
	}// MyPanel class end

}// public class end
