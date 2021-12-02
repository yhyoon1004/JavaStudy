package Graphic;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawLineEx extends JFrame{				//JFrame상속으로 인한 GUI
	public GraphicsDrawLineEx() {							//생성자 
		setTitle("drawLine사용 예제");							//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//닫기
		setContentPane(new MyPanel());						//내용창을 MyPanel로 생성
		
		setSize(200,150);									//사이즈
		setVisible(true);									//보이기
	}
	
	class MyPanel extends JPanel{							//페널
		public void paintComponent(Graphics g) {			//paintComponent()
			super.paintComponent(g);						//조상의 paintComponent 호출
			g.setColor(Color.RED);							//색갈 red로 설정
			g.drawLine(20,20,100,100);						//선그리기 x를 100픽셀,y를 100픽셀만큼
		}
	}
	
	public static void main(String[] args	) {
		new GraphicsDrawLineEx();
	}

}
