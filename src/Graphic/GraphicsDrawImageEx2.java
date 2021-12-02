package Graphic;
import javax.swing.*;
import java.awt.*;

//main - public class - panel - image loading - paintcomponont 

public class GraphicsDrawImageEx2 extends JFrame	{					//public class
	public GraphicsDrawImageEx2() {									//constructor
		setTitle("�гο� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{										//panel container
		private ImageIcon icon = new ImageIcon("images/image0.jpg");	//construct imageicon
		
		private Image img = icon.getImage();							//casting imageicon - > image class
		
		public void paintComponent(Graphics g) {						//paint overriding
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);		//image��ü, ������, �ش� �����̳��� �ʺ�, ���̷� ũ�� ���� �ش�޼��带 �� Ŭ������ �˸�
		}
	}

	public static void main(String[] args) {							//main
		new GraphicsDrawImageEx2();  
	}
	
}																		//end public class
