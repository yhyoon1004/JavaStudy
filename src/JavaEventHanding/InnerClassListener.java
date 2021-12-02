package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {//public 클래스 생성자 
		setTitle("Action 이벤트 리스너 예제");//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//끄기 버튼동작 구현
		
		Container c = getContentPane();//내용창 컨테이너 생성
		c.setLayout(new FlowLayout());//내용창 배치기준 설정
		JButton btn = new JButton("Action");//버튼 생성 text는 "Action"
		btn.addActionListener(new MyActionListener());//버튼에 이벤트리스너 등록
		c.add(btn);//내용창 컨테이너에 버튼을 추가
		
		setSize(200,120);//내용창 컨테이너 사이즈 설정
		setVisible(true);//내용창 보이기
		
	}

	private class MyActionListener implements ActionListener{//액션리스너 인터페이스를 상속받은 클래스 
		public void actionPerformed(ActionEvent e) {//액션리스너 추상메서드 구현
			JButton b = (JButton)e.getSource();//버튼생성
			if(b.getText().equals("Action"))// 택스트가 "Action"과 같으면 아래 명령문 수행
				b.setText("액션");//택스트를 "액션"으로 설정
			else
				b.setText("Action");// 아닐경우 "Action"으로 설정
			
			InnerClassListener.this.setTitle(b.getText());//창이름을 내부클래스의 버튼이름으로 설정
		}
	}
	
	public static void main(String[] args) {
		new InnerClassListener();// 객체 자신 생성
	}
	
}
