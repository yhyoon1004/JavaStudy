package SwingComponentUtillize;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame{					//public class JCommponentEx extends JFrame
	
	public JComponentEx() {									//constructor
		super("JCompoent의 공통메서드 예제");						//title
		Container c = getContentPane();						//construct container
		c.setLayout(new FlowLayout());						//deployment
		
		JButton b1 = new JButton("Magenta/Yellow Button");	//construct button
		JButton b2 = new JButton("   Disabled Button   ");	
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);						//add button Attribute backgroundColor
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial",Font.ITALIC,20));		//add button Attribute Font
		b2.setEnabled(false);								//set button Activation
		b3.addActionListener(new ActionListener() {			//add ActionListener as annonymousClass
			public void actionPerformed(ActionEvent e) {	//abstract method construct
				JButton b = (JButton)e.getSource();			//get ActionEvent casting  JButton  
				setTitle(b.getX()+","+b.getY());			//title
			}
		});
		c.add(b1);											//add button to container
		c.add(b2);
		c.add(b3);
		setSize(260,200);									//container size
		setVisible(true);									//container visible
}

	public static void main(String[] args) {
		new JComponentEx();
	}
}
