package SwingComponentUtillize;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame {
	private String[] fruits = { "apple", "banana", "mango" };//내부 접근 제어자로 스트링배열 생성

	private ImageIcon[] images = { 							//내부 접근 제어자로 이미지아이콘 객체 배열을 생성
			new ImageIcon("images/apple.jpg"),				//이미지아이콘 클래스 객체 생성
			new ImageIcon("images/banana.jpg"),				
			new ImageIcon("images/mango.jpg") };

	private JLabel imgLabel = new JLabel(images[0]);		//이미지 표현을 위한 레이블 생성

	public ComboActionEx() {								//ComboActionEx 생성자
		setTitle("콤보박스 활용 예제");
		Container c = getContentPane();			//컨테이너 생성
		c.setLayout(new FlowLayout());			//플로우 배치관리자
		JComboBox<String> combo = new JComboBox<String>(fruits);//스트링타입의 콤보박스 객체만 받는  스트링 콤보박스생성 
		c.add(combo);										//컨테이너에 콤보박스 추가
		c.add(imgLabel);									//레이블 추가

		combo.addActionListener(new ActionListener() {		//콤보박스에 액션리스너 등록 + 익명클래스
			public void actionPerformed(ActionEvent e) {	//액션리스너 추상메서드 구현
				JComboBox<String> cb = (JComboBox<String>)e.getSource();//발생한 액션이벤트의 소스를 받아와 콤보박스로 형변환

				int index = cb.getSelectedIndex();			//선택된 버튼객체배열의 인덱스를 반환
 
				imgLabel.setIcon(images[index]);			//이미지등록, 이미지아이콘 배열에서 해당인덱스를 표시
			}
		});

		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}
}
