package SwingComponentUtillize;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame{						//public class OptionPaneEx extends JFrame
	public OptionPaneEx() {										//constructor 생성자
		setTitle("옵션 팬 예제");									//title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//closeoperation
		Container c = getContentPane();							//construct container
		 
		setSize(500,200);										//container size
		c.add(new MyPanel(),BorderLayout.NORTH);				//add mypanel, deploment to container
		setVisible(true);
	}
	
	
	class MyPanel extends Panel{								//
		private JButton inputBtn = new JButton("Input Name");	//construct button 
		private JTextField tf = new JTextField(10);				//construct textfield
		private JButton confirmBtn = new JButton("Confirm");	
		private JButton messageBtn = new JButton("Message");
		
		public MyPanel() {										//constructor
			setBackground(Color.LIGHT_GRAY);					//set background color
			add(inputBtn);										//add button
			add(confirmBtn);
			add(messageBtn);
			add(tf);											//add textfield
			
			inputBtn.addActionListener(new ActionListener() {	//add action button
				public void actionPerformed(ActionEvent e) {	
					String name = JOptionPane.showInputDialog("이름을 입력하세요 ");
					if(name!=null)
						tf.setText(name);
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?","Confirm",JOptionPane.YES_NO_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"조심하세요", "Message",JOptionPane.ERROR_MESSAGE);
				}
			});
			
		}
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}
}
