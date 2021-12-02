import java.util.*;

class Student {												//class Student
	String name = "";
	int ban;
	int no;

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;

	}
}

public class GenericsEx02 {									//public class
	public static void main(String[] args) {				//main
		ArrayList<Student> list = new ArrayList<Student>();	//Student타입의 타입변수를 가진 list
		list.add(new Student("성윤환", 1, 24));				//list에 Student타입 객체 추가
		list.add(new Student("정현우", 2, 33));
		list.add(new Student("이민철", 3, 1));

		Iterator<Student> it = list.iterator();				//Student를 타입변수로 가지는 iterator
		while(it.hasNext()) {								//iterator가 요소를 가지고 있으면 반복문 수행
			Student s = it.next();							//iterator에서 다음요소를 Student 타입참조변수에 받음
			System.out.println(s.name);						//받은 참조변수를 이용해 name 출력
		}
	}
}
