import java.util.ArrayList;

public class GenericsEx03 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();//Fruit을 지네릭으로 받는 Fruitbox클래스 생성
		FruitBox<Apple> appleBox = new FruitBox<Apple>();//Apple을 지네릭으로...
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>();//error 참조변수 타입변수하고 생성자 타입변수하고 다름
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();//erorr 타입변수가 fruit과 eatable을 구현한 것이 아님
		
		fruitBox.add(new Fruit());//Fruit객체를 추가
		fruitBox.add(new Apple());//Fruit를 상속받는 Apple객체 추가 
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());//error Apple이 타입변수인 appleBox는 Grape타입을 못받음
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+fruitBox);//출력
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
		
		    
	}
}

interface Eatable{}									//Eatable인터페이스

class Fruit implements Eatable{						//Eatable인터페이스를 구현한 Fruit클래스
	public String toString() {return "Fruit";}
}
class Apple extends Fruit{							//Fruit를 상속받은 Apple클래스
	public String toString() {return "Apple";}
}
class Grape extends Fruit{								
	public String toString() {return "Grape";}
}

class Toy{											//아무것도 상속받지않은 toy클래스
	public String toString() {return "Toy";	}
}

class FruitBox <T extends Fruit&Eatable> extends Box<T>{ 
	//T는 fruit, eatable구현했고 T타입 Box를 상속받는 FruitBox클래스
}

class Box<T>{//한가지 타입만으로 생성및 선언 가능한 box클래스
	ArrayList<T> list = new ArrayList<T>();	//선택한 T타입으로 ArrayList를 생성
	void add(T item) {list.add(item);}		//list에 T타입 객체를 추가해주는 메서드
	T get(int i) {return list.get(i);}		//T타입 객체를 반환하는 get메서드
	int size() {return list.size();}		//리스트 크기를 반환하는 size메서드 
	public String toString() {return list.toString();}	//toString메서드
}




