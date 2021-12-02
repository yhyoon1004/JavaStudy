package Graphic;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//public class - main - constructor - container(panel) - constructorContainer - eventListener - event mouse - paintCompoent()

public class GraphicsDrawLineMouseEx extends JFrame {// public class
	public GraphicsDrawLineMouseEx() {				//JPanel�� �����̳ʷ� �ϴ� ������
		setTitle("���콺�� �������� �� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300,200);
		setVisible(true);
	}//end GraphicsDrawLineMouseEx()
	
	
	public static void main(String[] args) {// main method
		new GraphicsDrawLineMouseEx();
	}										//end main
	
	class MyPanel extends JPanel{										//����Ŭ���� MyPanel

		//�׷��� ���� ��� �����ϱ����� �������� vStart, ������ vEnd ���Ϳ� ����
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			//mouse������ ��� �ʿ�
			//���콺�� �������� ��ǥ����
			//���콺�� ������ ��ǥ����
			
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {//���콺�� ������ �� �ش� ��ǥ�� start���Ϳ� �����ϴ� �޼���
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {//���콺�� ������ �� �ش� ��ǥ end���Ϳ� �����ϴ� �޼���
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});//end of addMouseListener()
		}// end of MyPanel() constructor
		
		public void paintComponent(Graphics g) {//GraphicsŬ������ paintComponent �޼��� �������̵�
			super.paintComponent(g);			//����(Graphics)�� paintComponent �޼��� ȣ��
			g.setColor(Color.BLUE);				//���� �Ķ������� ����
			
			for(int i =0; i<vStart.size();i++) {//���ۺ����� ���� ��ŭ �ݺ�
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}//end of for syntax
			
		}
		
		
	}
	
	
	
}
