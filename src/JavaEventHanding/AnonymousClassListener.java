package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {//JFrame을 상속받았음으로 GUI응용프로그램
	public AnonymousClassListener() {//메인 클래스 익명클래스리스너
		setTitle("Action 이벤트 리스너 작성");//최상위 컨테이너 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//최상위 컨테이너 닫기 클릭시 프로그램 종료

		Container c = getContentPane();//참조변수 c에 컨탠트팬 불러옴
		c.setLayout(new FlowLayout());//배치관리자 FlowLayout으로 설정
		JButton btn = new JButton("Action");//버튼생성 이름은 "Action"
		c.add(btn);//ContentPane에 위에서 만든 버튼 추가 
		
		btn.addActionListener(new ActionListener() {//이벤트리스너를 버튼에 등록 (익명클래스)
			public void actionPerformed(ActionEvent e) {//익명클래스 메서드구현(ActionListener의 actionPerformed메서드 구현
				JButton b = (JButton)e.getSource();//어떤컴포넌트가 이벤트를 발생했는지 이벤트소스를 알려주는 getSource()메서드
				if(b.getText().equals("Action"))//매개변수로 받아온 형변환된 버튼의 text내용이 Action과 같으면 
					b.setText("액션");//형변환된 버튼의 text를 "액션"으로 변경
				else
					b.setText("Action");//아닐경우 "Action"으로 변경
				
				//AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
				setTitle(b.getText());//최상위 컨테이너의 제목을 형변환된 객체의 text로 변경
			}
		});
		
		setSize(200,120);//최상위 컨테이너의 크기를 200,120으로 설정
		setVisible(true);//최상위 컨체이너 보이기 설정 true
	}

	public static void main(String[] args)	{
		new AnonymousClassListener();//JFrame을 구현한 GUI응용프로그램 실행
	}
}
