package SwingComponentUtillize;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {								//생성자
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 활성화
		Container c = getContentPane();					//내용창 컨테이너 생성
		c.setLayout(new FlowLayout());					//배치관리자

		c.add(new JLabel("이름   "));						//레이블 추가
		c.add(new JTextField(20));						//20열짜리 텍스트 필드 생성
		c.add(new JLabel("학과   "));						//레이블 추가
		c.add(new JTextField("소프트웨어공학과", 20));		//해당 문자열이 입력된 상태의 텍스트필드 생성 20열짜리 
		c.add(new JLabel("주소   "));
		c.add(new JTextField("서울시 ...", 20));

		setSize(300, 130);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TextFieldEx();
	}

}
