package JavaEventHanding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//독립클래스리스너 클래스 생성 + JFrame을 상속받았음으로 contentsPane 내용창을 생성할수있음
public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");//창 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기 버튼 활성화
		
		Container c = getContentPane();// 내용창 컨테이너 생성 
		c.setLayout(new FlowLayout());//레이아웃 형태를 FLOW형으로 설정
		JButton btn = new JButton("Hello");//"Action"이름의 버튼 생성
		btn.addActionListener(new MyActionListener());//액션리스너 속성 부여
		c.add(btn);//내용창 컨테이너에 생성한 버튼을 넣어줌
		
		setSize(250,120);//내용창 크기를 설정
		setVisible(true);//내용창을 보이게 설정
	}
	public static void main(String[] args) {//main메서드 
		new IndepClassListener();// 독립클래스리스너 생성
	}
}

class MyActionListener implements ActionListener{//ActionListener를 구현한 MyActionListener 생성
	public void actionPerformed(ActionEvent e) { //public actionPerformed메서드 매개변수로 ActionEvent형 객체를 받음
		JButton b = (JButton)e.getSource();// 받아온 액션이벤트를 버튼형 참조변수에 넣어줌
		if(b.getText().equals("Action"))//매개객체의 택스트 내용이 "Action"과 문자열 내용이 같으면 명령수행
			b.setText("액션"); //매개객체의 택스트 내용을 "액션"으로 변경
		else
			b.setText("Action");//아닐경우 "Action"으로 택스트변경
	}
}
