import java.util.*;

class Product {														//class Product
}

class Tv extends Product {											//class Tv extends Product
}

class Audio extends Product {										//class Tv extends Product 
}

public class GenericsEx01 {											//public class
	public static void main(String[] args) {						//main
		ArrayList<Product> Plist = new ArrayList<Product>();		//Product�� Ÿ�Ժ����� �޴� ArrayList
//		ArrayList<Product> P1list = new ArrayList<Tv>();			//error ���������� �������� Ÿ�Ժ����� ��ġ���� ����
		ArrayList<Tv> Tlist = new ArrayList<Tv>();					//Tv�� Ÿ�Ժ����� �޴� ArrayList
//		Plist = Tlist;												//error Ÿ�Ժ����� �����ʴ� ����Ʈ�� ���� �� ����

		Plist.add(new Product());									//Plist�� Product��ü �߰�
		Plist.add(new Tv());										//Plist�� Tv��ü �߰�
		Plist.add(new Audio());										//Plist�� Audio��ü �߰�
//		Plist.add(Tlist);											//error Plist�� Tlist�� �߰� ���� Ÿ�Ժ����� �ٸ�
		
		printAll(Plist);											//Plist�� ��� ��� ���
//		printAll(Tlist);

	}

	public static void printAll(ArrayList<Product> list) {			//printAll() �޼���
		for (Product p : list) {
			System.out.println(p);
		}
	}
}