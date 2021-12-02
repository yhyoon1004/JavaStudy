package SwingComponentUtillize;

import javax.swing.*;

public class MenuEx extends JFrame {					//public class MenuEx extends JFrame
	public MenuEx() {									//constructor
		setTitle("Menu 만들기 예제");						//title
		createMenu();									//method calling
		setSize(250, 200);								//container size
		setVisible(true);								//container visible
	}

	private void createMenu() {							//private로 접근제어자 설정 = 내부에서 다루겠다	method : createMenu()
		JMenuBar mb = new JMenuBar();					//MenuBar생성
		JMenu screenMenu = new JMenu("Screen");			//menu 생성

		screenMenu.add(new JMenuItem("Load"));			//menu에 menuItem생성하여 추가
		screenMenu.addSeparator();						//구분자
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("ReShow"));
 		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));

		mb.add(screenMenu);								//메뉴바에 메뉴추가 add menu to menubar
		mb.add(new JMenu("Edit"));						
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("project"));
		mb.add(new JMenu("Run"));

		setJMenuBar(mb);								//생성한 menubar mb를 JMenuBar로 설정(적용)
	}

	public static void main(String[] args) {
		new MenuEx();
	}
}
