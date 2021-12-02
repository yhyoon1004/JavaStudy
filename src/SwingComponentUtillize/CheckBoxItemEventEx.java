package SwingComponentUtillize;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];				//체크박스 배열 생성
	private String[] names = { "사과", "배", "체리" };				//문자열 배열 생성 

	private JLabel sumLabel;									//합계 레이블 생성

	public CheckBoxItemEventEx() {								//생성자
		setTitle("체크박스 와 ItemEvent 예제");						//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//닫기버튼
		Container c = getContentPane();							// 내용창 컨테이너 참조변수 연결
		c.setLayout(new FlowLayout());							//흐름 배치관리자

		c.add(new JLabel("시과 100원, 배 500원, 체리 2000원"));		//가격표 레이블 추가

		MyItemListener listener = new MyItemListener(); 		//이벤트리스너(아이템)	(모든 요소를 일일이 등록하기 귀찮으니까 반복문에 껴넣을려고)
		
		
		for (int i = 0; i < fruits.length; i++) {				//체크박스배열 요소 갯수만큼 반복
			fruits[i] = new JCheckBox(names[i]);				//체크박스 배열에 각각이름 요소를 넣어 초기화
			fruits[i].setBorderPainted(true);					//체크박스의 외곽선이 보이도록 설정
			c.add(fruits[i]);									//컨테이너에 체크박스 삽입
			fruits[i].addItemListener(listener);				//체크박스[i]요소에 이벤트리스너를 등록
		}

		sumLabel = new JLabel("현재 0원 입니다.");					// 초기 합계 레이블
		c.add(sumLabel);										//컨텐트팬에 합계레이블 달기

		setSize(250, 200);										//컨텐트펜 사이즈 설정
		setVisible(true);										//보이기
	}

	class MyItemListener implements ItemListener {				//아이템리스너를 구현하는 리스너
																//ItemListener 인터페이스는 itemStateChanged()메소드만 선언되어있음
		private int sum = 0;									//값을 가지고 있을 sum변수

		public void itemStateChanged(ItemEvent e) {				//ItemListener인터페이스에 선언되있는 itemStateChaged메서드(인터페이스안에 이것만 존재)

			if (e.getStateChange() == ItemEvent.SELECTED) {		//받은 이벤트의 상태여부가 SELECTED일시
				if (e.getItem() == fruits[0])					//발생한 이벤트가 fruits[0]이랑 같을 때 sum에 100을 더함
																//getItem()메서드는  이벤트를 발생시킨 아이템 객체리턴 	(Object에서 상속된 메서드)
					sum += 100;
				else if (e.getItem() == fruits[1])				//발생한 이벤트가 fruits[1]이랑 같을 때 sum에 100을 더함
					sum += 500;
				else											//발생한 이벤트가 fruits[2]이랑 같을 때 sum에 2000을 더함
					sum += 2000;

				sumLabel.setText("현재 " + sum + "원 입니다.");
			}

			else {												//받은 이벤트의 상태여부가 SELECTED가 아닐시
				if (e.getItem() == fruits[0])					//발생한 이벤트가 fruits[0]이랑 같을 때 sum에 100을 뺌
					sum -= 100;
				else if (e.getItem() == fruits[1])				//발생한 이벤트가 fruits[1]이랑 같을 때 sum에 500을 뺌
					sum -= 500;
				else											//발생한 이벤트가 fruits[2]이랑 같을 때 sum에 2000을 뺌
					sum -= 2000;
			}
			sumLabel.setText("현재" + sum + "원 입니다.");

		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
