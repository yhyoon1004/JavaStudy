package Graphic;
import java.awt.*;
import javax.swing.*;
public class GraphicsFillEx extends JFrame {
	public GraphicsFillEx() {								//생성자
		setTitle("fillXXX 사용 예제");							//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//닫기
		setContentPane(new MyPanel());						//내용창 컨테이너 설정
		
		setSize(100,350);									//사이즈
		setVisible(true);									//보이기
	}
	
	
	class MyPanel extends JPanel{							//패널 만드는 클래스 
		public void paintComponent(Graphics g) {			//JPanel의 paintComponent 오버라이딩
			super.paintComponent(g);						//조상 paintComponent 호출
			
			g.setColor(Color.red);							//paint색갈 RED설정
			g.fillRect(10, 10, 50, 50);						//색이 채워 진 직사각형 생성
			
			g.setColor(Color.BLUE);							//.. BLUE설정
			g.fillOval(10,70,50,50);						//색이 채워진 동그라미 생성
			
			g.setColor(Color.green);						//..GREEN설정
			g.fillRoundRect(10, 130, 50, 50, 20, 20);		//색이 채워진 둥근 사각형 생성
			
			g.setColor(Color.magenta);						//..MAGENTA설정
			g.fillArc(10, 190, 50, 50, 0, 270);				//색이 채워진 원호 생성
			
			g.setColor(Color.orange);						//..ORANGE설정
			int []x = {30,10,30,60};						//x축 좌표들을 배열로 설정
			int []y = {250,275,300,275};					//y축 좌표들을 배열로 설정
			g.fillPolygon(x,y,4);							//해당 x,y좌표로 색이 채워진 다각형 생성
		}
	}
	
	public static void main(String[] args) {
		new GraphicsFillEx();
	}

}
