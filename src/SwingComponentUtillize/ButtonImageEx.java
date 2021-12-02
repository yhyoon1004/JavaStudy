package SwingComponentUtillize;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonImageEx extends JFrame{						//public class ButtonImageEx extends JFrame
	public ButtonImageEx() {									//생성자 constructor
		setTitle("이미지 버튼 예제");								//title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//closeOperation
		Container c = getContentPane();							//construct Container
		c.setLayout(new FlowLayout());							//deployment
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");	//construct image
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");	
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~",normalIcon);			//construct button
		btn.setPressedIcon(pressedIcon);						//set pressed icon
		btn.setRolloverIcon(rolloverIcon);						//set rollover icon
		c.add(btn);												//add button to container
		
		
		setSize(250,150);										//container size
		setVisible(true);										//container visible set
	}
	
	public static void main(String[] args) {
		new ButtonImageEx();
	}

}
