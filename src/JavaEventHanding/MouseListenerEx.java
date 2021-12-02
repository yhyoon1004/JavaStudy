package JavaEventHanding;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*	;

public class MouseListenerEx extends JFrame{//JFrame�� ��ӹ޾������� GUI�������α׷�
	
	private JLabel la  = new JLabel("Hello");// Hello ������ JLabel ����
	
	public MouseListenerEx() {//Ŭ���� ������
		setTitle("Mouse �̺�Ʈ ����");//�ֻ��� �����̳� �̸� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ֻ��������̳� �����ư Ȱ��ȭ
		Container c = getContentPane();//ContentPane �������� c�� ����
		c.addMouseListener(new MyMouseListener());//ContentPane(����â)�� ���콺�����ʸ� �߰�
		
		c.setLayout(null);//��ġ������ ����
		la.setSize(50,20);//JLabel������ ����
  		la.setLocation(30,30);//JLabel��ġ ����
		c.add(la);//ContentPane(����â)�� JLabel�߰�
		
		setSize(200,200);//���������̳� ũ�� ����
		setVisible(true);//�����̳� ���̱� true
	}

	
	class MyMouseListener implements MouseListener{//���콺������ �������̽��� ��ӹ��� Ŭ���� ����
		public void mousePressed(MouseEvent e) {//���콺�� ���ȴ� ������ �޼���
			int x = e.getX();//���콺 x��ǥ�޾ƿ�
			int y = e.getY();//���콺 y��ǥ�޾ƿ�
			la.setLocation(x,y);//���� ��ǥ�� ���� ��ǥ�� ����
		}
		public void mouseReleased(MouseEvent e) {}//�̱����� ���콺�������������̽��� �߻�޼���
		public void mouseClicked(MouseEvent e) {}//�̱����� ���콺�������������̽��� �߻�޼���
		public void mouseEntered(MouseEvent e) {}//�̱����� ���콺�������������̽��� �߻�޼���
		public void mouseExited(MouseEvent e) {}//�̱����� ���콺�������������̽��� �߻�޼���
	}

	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
