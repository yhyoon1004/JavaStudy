package SwingComponentUtillize;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", "mango",//문자열 배열 생성 (과일)
			"pear", "peach", "berry", "strawberry",
			"blackberry" };
	private ImageIcon[] images = { //이미지아이콘들 생성
			new ImageIcon("주소"), 
			new ImageIcon("address"), 
			new ImageIcon("address"),
			new ImageIcon("address") };

	public ListEx() {//생성자
		setTitle("리스트 만들기 예제");//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기버튼
		Container c = getContentPane();//컨테이너 생성
		c.setLayout(new FlowLayout());//배치관리자

		JList strList = new JList<String>(fruits);//리스트 생성 이미지아이콘을 아이템으로 가지는 리스트
		c.add(strList);//컨테이너에 리스트를 추가 

		JList<ImageIcon> imageList = new JList<ImageIcon>();//이미지 리스트 생성
		imageList.setListData(images);//images배열을 생성한 imageList에 추가함
		c.add(imageList);//컨테이너에 이미지리스트에 추가
//=========================================================================================//
		JList<String> scrollList = new JList<String>(fruits);//
		c.add(new JScrollPane(scrollList));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}
}
