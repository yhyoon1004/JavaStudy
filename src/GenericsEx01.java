import java.util.*;

class Product {														//class Product
}

class Tv extends Product {											//class Tv extends Product
}

class Audio extends Product {										//class Tv extends Product 
}

public class GenericsEx01 {											//public class
	public static void main(String[] args) {						//main
		ArrayList<Product> Plist = new ArrayList<Product>();		//Product를 타입변수로 받는 ArrayList
//		ArrayList<Product> P1list = new ArrayList<Tv>();			//error 참조변수와 생성자의 타입변수가 일치하지 않음
		ArrayList<Tv> Tlist = new ArrayList<Tv>();					//Tv를 타입변수로 받는 ArrayList
//		Plist = Tlist;												//error 타입변수가 맞지않는 리스트를 넣을 수 없음

		Plist.add(new Product());									//Plist에 Product객체 추가
		Plist.add(new Tv());										//Plist에 Tv객체 추가
		Plist.add(new Audio());										//Plist에 Audio객체 추가
//		Plist.add(Tlist);											//error Plist에 Tlist를 추가 못함 타입변수가 다름
		
		printAll(Plist);											//Plist에 모든 요소 출력
//		printAll(Tlist);

	}

	public static void printAll(ArrayList<Product> list) {			//printAll() 메서드
		for (Product p : list) {
			System.out.println(p);
		}
	}
}