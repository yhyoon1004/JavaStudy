package JavaGUI_Swing_Basic;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		//왼쪽으로 정렬로, 수평간격을 30, 수직간격을 40픽셀로 배치하는 FlowLayout 생성
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
	    contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
