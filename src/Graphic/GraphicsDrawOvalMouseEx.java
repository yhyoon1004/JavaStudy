package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class - main - contstructor - container(panel) - event(mouse) stand by - event occur - x,y save - paintComponent()[by java plateform]

public class GraphicsDrawOvalMouseEx extends JFrame {								//public class
	public GraphicsDrawOvalMouseEx() {												//constructor
		setTitle("마우스 드래깅으로 타원 그리기 예제");										//title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);								//close
		setContentPane(new MyPanel());												//s et ContentPane as MyPanel

		setSize(300, 300);															//size
		setVisible(true);															//vis
	}

	public static void main(String[] args) {										//main
		new GraphicsDrawOvalMouseEx();	
	}

	class MyPanel extends JPanel {													//class MyPanel
		private Point start = null, end = null;										//Point형 참조변수 생성 시작, 끝

		class MyMouseListener extends MouseAdapter {								//마우스 이벤트 객체 생
			public void mousePressed(MouseEvent e) {								//MouseAdapter의 메서드 오버라이딩 외부클래스 Point객체 start에 마우스 Point객체를 받아옴
				start = e.getPoint();//마우스 눌렀을 떼 해당 좌표를 외부클래스 Point형 참조변수에 저장
			}
			
			public void mouseDragged(MouseEvent e) {								//드래그했을 때
				end = e.getPoint();													// end객체에 포인트를 받아옴
				repaint();															//repaint메서드 호출
			}
		}// innerclass MyMouseListener

		public MyPanel() {															//MyPanel constructor
			MyMouseListener listener = new MyMouseListener();						//마우스리스너 생성
			
			addMouseListener(listener);												//마우스 리스너 등록
			addMouseMotionListener(listener);										//마우스 모션리스너 등록
		}


		public void paintComponent(Graphics g) {							//paintComponent메서드 오버라이딩
			super.paintComponent(g);										//조상의 paintComponent메서드 호출
			if(start == null)												//start객체의 값이 null,없으면 
				return;														//아무것도 반환하지않음
			g.setColor(Color.BLUE);											//그래픽 객체 g의 색상설정
			int x = Math.min(start.x, end.x);								//x좌표의 값을 Math의 최소값 비교 메서드로 반환
			int y = Math.min(start.y, end.y);								//y좌표의 값을 ...
			int width = Math.abs(start.x-end.x);							//넓이를 Math의 절대값구하는 메서드로 저장
			int height = Math.abs(start.y-end.y);							//높이를 ...
			g.drawOval(x, y, width, height);								//Graphics의 원그리기 메서드로 x좌표, y좌표, 높이, 넓이를 이용해 원을 그림
			
			
		}
		
		
		
	}// MyPanel class end

}// public class end
