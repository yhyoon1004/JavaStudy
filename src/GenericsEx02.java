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
		ArrayList<Student> list = new ArrayList<Student>();	//StudentŸ���� Ÿ�Ժ����� ���� list
		list.add(new Student("����ȯ", 1, 24));				//list�� StudentŸ�� ��ü �߰�
		list.add(new Student("������", 2, 33));
		list.add(new Student("�̹�ö", 3, 1));

		Iterator<Student> it = list.iterator();				//Student�� Ÿ�Ժ����� ������ iterator
		while(it.hasNext()) {								//iterator�� ��Ҹ� ������ ������ �ݺ��� ����
			Student s = it.next();							//iterator���� ������Ҹ� Student Ÿ������������ ����
			System.out.println(s.name);						//���� ���������� �̿��� name ���
		}
	}
}
