package SwingComponentUtillize;

import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {									//public class LabelEx extends JFrame
	public LabelEx() {													//constructor
		setTitle("레이블 예제");											//title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					//closeoperation
		Container c = getContentPane();									//construct container
		c.setLayout(new FlowLayout());									//deploment
		
		JLabel textLabel = new JLabel("제임스 고슬링 입니다!");				//construct label
		
		ImageIcon img = new ImageIcon("주소");							//construct image
		JLabel imageLabel = new JLabel(img);							//add image to label
		
		
		ImageIcon icon = new ImageIcon("images/gosling.jpg");			//construct image
		
		JLabel label = new JLabel("커피한잔 하실래요? 전화주세요.", icon, SwingConstants.CENTER);	//label construct with text, image
		
		c.add(textLabel);												//add textlabel to container
		c.add(imageLabel);															
		c.add(label);
		
		setSize(300,200);												//container size
		setVisible(true);												//visible 
		
	}

	public static void main(String[] args) {
		new LabelEx();
	}
}
