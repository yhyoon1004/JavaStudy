package SwingComponentUtillize;

import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;

public class TextAreaEx extends JFrame {

	private JTextField tf = new JTextField(20);// 문자열길이가 20글자인 텍스트 필드 생성
	private JTextArea ta = new JTextArea(7, 20);// 7행 20글자의 텍스트 에어리어 생성

	public TextAreaEx() {						//생성자
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력후 <Enter> 키를 입력하세요."));		//컨테이너에 레이블 추가
		c.add(tf);											//컨테이너에  텍스트필드 추가
		c.add(new JScrollPane(ta));							//스크롤판을 가진 텍스트에어리어 추가

		tf.addActionListener(new ActionListener() {			//텍스트필드에 액션리스너 등록 
			public void actionPerformed(ActionEvent e) {	//액션리스너 추상메서드 구현
				JTextField t = (JTextField) e.getSource();	//발생한 액션이벤트의 소스를 받아 텍스트필드로 형변환
				ta.append(t.getText() + "\n");				//택스트필드에서 텍스트를 받아 텍스트에어리어에 추가해주고 한줄 띄움
				t.setText("");								//텍스트필드에 택스트를 빈문자열로 초기화
			}
		});

		setSize(300, 250);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TextAreaEx(); 
	}
}
