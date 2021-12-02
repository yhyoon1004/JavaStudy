package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {//JFrame을 상속받았음으로 최상위 컨테이너
	private JLabel la = new JLabel("Hello");//라벨 텍스트는 Hello

	public MouseAdapterEx() {//생성자
		setTitle("Mouse 이벤트 예제");// 제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료 버튼 클릭시 프로그램종료
		Container c = getContentPane();//
		c.addMouseListener(new MyMouseAdapter());

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(200, 200);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
