package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx extends JFrame {
	private JLabel la = new JLabel("     Move Me");

	public MouseEventAllEx() {
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.addMouseMotionListener(listener);

		c.setLayout(null);
		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la);

		setSize(320, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener, MouseMotionListener {

		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mousePressed(" + e.getX() + "," + getY() + ")");
			System.out.println("mousePressed(" + e.getX() + "," + getY() + ")");
		}

		public void mouseReleased(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseReleased" + e.getX() + "," + e.getY() + ")");
			System.out.println("mouseReleased(" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.CYAN);
		}

		public void mouseExited(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.YELLOW);
			setTitle("mouseExited (" + e.getX() + "," + e.getY()+")");
			System.out.println("mouseExited (" + e.getX() + "," + e.getY()+")");
		}

		public void mouseDragged(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")");
			System.out.println("mouseDragged(" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseMoved(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseMoved(" + e.getX() + "," + e.getY() + ")");
		}

	}

	public static void main(String[] args) {
		new MouseEventAllEx();
	}
}
