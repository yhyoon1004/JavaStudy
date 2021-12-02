package Graphic;
import java.awt.*;
import javax.swing.*;
public class GraphicsFillEx extends JFrame {
	public GraphicsFillEx() {								//������
		setTitle("fillXXX ��� ����");							//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//�ݱ�
		setContentPane(new MyPanel());						//����â �����̳� ����
		
		setSize(100,350);									//������
		setVisible(true);									//���̱�
	}
	
	
	class MyPanel extends JPanel{							//�г� ����� Ŭ���� 
		public void paintComponent(Graphics g) {			//JPanel�� paintComponent �������̵�
			super.paintComponent(g);						//���� paintComponent ȣ��
			
			g.setColor(Color.red);							//paint���� RED����
			g.fillRect(10, 10, 50, 50);						//���� ä�� �� ���簢�� ����
			
			g.setColor(Color.BLUE);							//.. BLUE����
			g.fillOval(10,70,50,50);						//���� ä���� ���׶�� ����
			
			g.setColor(Color.green);						//..GREEN����
			g.fillRoundRect(10, 130, 50, 50, 20, 20);		//���� ä���� �ձ� �簢�� ����
			
			g.setColor(Color.magenta);						//..MAGENTA����
			g.fillArc(10, 190, 50, 50, 0, 270);				//���� ä���� ��ȣ ����
			
			g.setColor(Color.orange);						//..ORANGE����
			int []x = {30,10,30,60};						//x�� ��ǥ���� �迭�� ����
			int []y = {250,275,300,275};					//y�� ��ǥ���� �迭�� ����
			g.fillPolygon(x,y,4);							//�ش� x,y��ǥ�� ���� ä���� �ٰ��� ����
		}
	}
	
	public static void main(String[] args) {
		new GraphicsFillEx();
	}

}
