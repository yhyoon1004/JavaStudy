package Graphic;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{					//GUI객체

	public GraphicsDrawImageEx1() {									//생성자
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");					//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				//닫기
		setContentPane(new MyPanel());								//GUI내용창 객체
		
		setSize(300,400);											//크기
		setVisible(true);											//보이기
	}
	
	class MyPanel extends JPanel{									//JPanel을 상속받은 그리기객체
		private ImageIcon icon = new ImageIcon("images/image0.jpg");//이미지를 이미지아이콘객체에 옮김
		private Image img = icon.getImage();						//이미지아이콘의 이미지를 받아 아이콘객체에 담음
		
		public void paintComponent(Graphics g) {					//GUI그리기는 메서드
			super.paintComponent(g);								//조상의 그리기 메서드를 호출
			
			g.drawImage(img, 20, 20, this);							//이미지 객체를 받아 사이즈를 설정
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
}
