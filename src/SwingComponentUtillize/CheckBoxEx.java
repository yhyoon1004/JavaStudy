package SwingComponentUtillize;
import java.awt.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame	{					//public class CheckBoxEx extends JFrame
	public CheckBoxEx() {									//constructor
		setTitle("üũ�ڽ� ����� ����");							//title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//closeoperation
		Container c = getContentPane();						//construct container
		c.setLayout(new FlowLayout());						//deployment
	
		JCheckBox apple = new JCheckBox("���");				//construct checkbox
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cherry = new JCheckBox("ü��");
		 
		c.add(apple);										//add button to container
		c.add(pear);										
		c.add(cherry);
		
		setSize(250,150);									//container size
		setVisible(true);									//container visible
	
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();									
	}
	
	

}
