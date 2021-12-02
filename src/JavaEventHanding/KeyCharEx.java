package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다.");

	public KeyCharEx() {
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		setSize(250, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);

			switch (e.getKeyChar()) {
			case '\n':
				la.setText("r = " + r + "g = " + g + "b = " + b);
				getContentPane().setBackground(new Color(r, g, b));

				break;
			case 'q':
				System.exit(0);
			}
		}

	}

	public static void main(String[] args) {
		new KeyCharEx();
	}

}
