package JavaGUI_Swing_Basic;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		MyFrame frame = new MyFrame();
	}
	
}
