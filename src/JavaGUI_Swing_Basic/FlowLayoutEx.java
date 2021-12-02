package JavaGUI_Swing_Basic;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		//�������� ���ķ�, ���򰣰��� 30, ���������� 40�ȼ��� ��ġ�ϴ� FlowLayout ����
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
