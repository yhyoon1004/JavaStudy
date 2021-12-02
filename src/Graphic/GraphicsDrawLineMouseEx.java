package Graphic;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//public class - main - constructor - container(panel) - constructorContainer - eventListener - event mouse - paintCompoent()

public class GraphicsDrawLineMouseEx extends JFrame {// public class
	public GraphicsDrawLineMouseEx() {				//JPanel을 컨테이너로 하는 생성자
		setTitle("마우스로 여러개의 선 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300,200);
		setVisible(true);
	}//end GraphicsDrawLineMouseEx()
	
	
	public static void main(String[] args) {// main method
		new GraphicsDrawLineMouseEx();
	}										//end main
	
	class MyPanel extends JPanel{										//내부클래스 MyPanel

		//그려진 선을 모두 저장하기위해 시작점은 vStart, 끝점은 vEnd 벡터에 저장
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			//mouse리스너 등록 필요
			//마우스가 눌려지면 좌표저장
			//마우스가 떼지면 좌표저장
			
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {//마우스가 눌렸을 때 해당 좌표를 start벡터에 저장하는 메서드
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {//마우스가 떼였을 떄 해당 좌표 end벡터에 저장하는 메서드
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});//end of addMouseListener()
		}// end of MyPanel() constructor
		
		public void paintComponent(Graphics g) {//Graphics클래스의 paintComponent 메서드 오버라이딩
			super.paintComponent(g);			//조상(Graphics)의 paintComponent 메서드 호출
			g.setColor(Color.BLUE);				//색갈 파란색으로 설정
			
			for(int i =0; i<vStart.size();i++) {//시작벡터의 갯수 만큼 반복
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}//end of for syntax
			
		}
		
		
	}
	
	
	
}
