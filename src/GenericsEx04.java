import java.util.ArrayList;

public class GenericsEx04 {
	public static void main(String[] args) {						//main method
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();//Fruit2타입의 FruitBox2객체
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();//Apple2타입의 FruitBox2객체
		
		fruitBox.add(new Apple2());	//Fruit2를 상속받은 Apple2 객체를 추가
		fruitBox.add(new Grape2());	//Fruit2를 상속받은 Grape2 객체를 추가
		appleBox.add(new Apple2());	//
		appleBox.add(new Apple2());//
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}

class Fruit2 {public String toString() {return "Fruit";}}			//class Fruit2
class Apple2 extends Fruit2{public String toString() {return "Apple";}}//Fruit2를 상속받은 Apple2클래스 
class Grape2 extends Fruit2{public String toString() {return "Grape";}}//Fruit2를 상속받은 Grape2클래스

class Juice{															//class Juice
	String name; 
	Juice(String name){this.name = name +"Juice";}						//Juice생성자
	public String toString() {return name;}
}

class Juicer{															//class Juicer
	static Juice makeJuice(FruitBox2<? extends Fruit2>box) {			//Juicer.makeJuice() static메서드
																		//매개변수로 Fruit2를 상속받은 자식이나 자신 클래스만 받음 
		String tmp= "";
		
		for(Fruit2 f : box.getList())									//매개변수의 리스트를 받아 문자열로 합침
			tmp += f+" ";
		return new Juice(tmp);											//합친 문자열로 Juice객체로 반환
	}
}

class FruitBox2<T extends Fruit2> extends Box2<T>{};					//class FruitBox2는 Fruit2타입의 객체만 생성가능하고, Box2를 상속받은 클래스

class Box2<T>{															//class Box2
	ArrayList<T> list = new ArrayList<T>();//타입변수의 리스트생성
	void add(T item) {list.add(item);}									//Box2.add()메서드 타입변수의 객체를 리스트에 추가
	T get(int i) {return list.get(i);}									//Box2.get()메서드 해당 인덱스의 타입변수 객체를 반환
	ArrayList<T> getList() {return list;}								//Box2.getList() ArrayList를 반환하는 메서드
	int size() {return list.size();}
	
}


