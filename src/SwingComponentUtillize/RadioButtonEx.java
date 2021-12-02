package SwingComponentUtillize;

import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {// JFrame상속
	public RadioButtonEx() {//생성자 
		setTitle("라디오버튼 만들기 예제");//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기버튼
		Container c = getContentPane();//내용창생성 
		c.setLayout(new FlowLayout());//배치관리자

		//라디오버튼 만드는것 1단계 버튼 그룹만들기
		ButtonGroup g = new ButtonGroup();//버튼 그룹 객체 생성

		//라디오버튼 만들기 2단계 라디오버튼 생성
		JRadioButton apple = new JRadioButton("사과");//라디오버튼 생성
		JRadioButton pear = new JRadioButton("배", true);//버튼 체크되있는 상태
		JRadioButton cherry = new JRadioButton("체리");

		//라디오버튼 만들기 3단계 버튼 그룹에 라디오 버튼추가하기 
		g.add(apple);//버튼 그룹에 추가 
		g.add(pear);
		g.add(cherry);
		
		//라디오버튼 만들기 4단계 버튼 컨테이너에 등록하기
		c.add(apple);//컨테이너에 객체추가
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
