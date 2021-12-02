package SwingComponentUtillize;

import javax.swing.*;

public class MenuEx extends JFrame {					//public class MenuEx extends JFrame
	public MenuEx() {									//constructor
		setTitle("Menu ����� ����");						//title
		createMenu();									//method calling
		setSize(250, 200);								//container size
		setVisible(true);								//container visible
	}

	private void createMenu() {							//private�� ���������� ���� = ���ο��� �ٷ�ڴ�	method : createMenu()
		JMenuBar mb = new JMenuBar();					//MenuBar����
		JMenu screenMenu = new JMenu("Screen");			//menu ����

		screenMenu.add(new JMenuItem("Load"));			//menu�� menuItem�����Ͽ� �߰�
		screenMenu.addSeparator();						//������
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("ReShow"));
 		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));

		mb.add(screenMenu);								//�޴��ٿ� �޴��߰� add menu to menubar
		mb.add(new JMenu("Edit"));						
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("project"));
		mb.add(new JMenu("Run"));

		setJMenuBar(mb);								//������ menubar mb�� JMenuBar�� ����(����)
	}

	public static void main(String[] args) {
		new MenuEx();
	}
}
