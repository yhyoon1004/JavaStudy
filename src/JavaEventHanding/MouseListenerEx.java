package JavaEventHanding;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*	;

public class MouseListenerEx extends JFrame{//JFrame을 상속받았음으로 GUI응용프로그램
	
	private JLabel la  = new JLabel("Hello");// Hello 내용의 JLabel 생성
	
	public MouseListenerEx() {//클래스 생성자
		setTitle("Mouse 이벤트 예제");//최상위 컨테이너 이름 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//최상위컨테이너 종료버튼 활성화
		Container c = getContentPane();//ContentPane 참조변수 c로 연결
		c.addMouseListener(new MyMouseListener());//ContentPane(내용창)에 마우스리스너를 추가
		
		c.setLayout(null);//배치관리자 제거
		la.setSize(50,20);//JLabel사이즈 설정
  		la.setLocation(30,30);//JLabel위치 설정
		c.add(la);//ContentPane(내용창)에 JLabel추가
		
		setSize(200,200);//최종컨테이너 크기 설정
		setVisible(true);//컨테이너 보이기 true
	}

	
	class MyMouseListener implements MouseListener{//마우스리스너 인터페이스를 상속받은 클래스 생성
		public void mousePressed(MouseEvent e) {//마우스가 눌렸다 떗을때 메서드
			int x = e.getX();//마우스 x좌표받아옴
			int y = e.getY();//마우스 y좌표받아옴
			la.setLocation(x,y);//라벨의 좌표를 현재 좌표로 설정
		}
		public void mouseReleased(MouseEvent e) {}//미구현한 마우스리스너인터페이스의 추상메서드
		public void mouseClicked(MouseEvent e) {}//미구현한 마우스리스너인터페이스의 추상메서드
		public void mouseEntered(MouseEvent e) {}//미구현한 마우스리스너인터페이스의 추상메서드
		public void mouseExited(MouseEvent e) {}//미구현한 마우스리스너인터페이스의 추상메서드
	}

	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
