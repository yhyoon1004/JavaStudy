import java.util.ArrayList;

public class GenericsEx04 {
	public static void main(String[] args) {						//main method
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();//Fruit2Ÿ���� FruitBox2��ü
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();//Apple2Ÿ���� FruitBox2��ü
		
		fruitBox.add(new Apple2());	//Fruit2�� ��ӹ��� Apple2 ��ü�� �߰�
		fruitBox.add(new Grape2());	//Fruit2�� ��ӹ��� Grape2 ��ü�� �߰�
		appleBox.add(new Apple2());	//
		appleBox.add(new Apple2());//
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}

class Fruit2 {public String toString() {return "Fruit";}}			//class Fruit2
class Apple2 extends Fruit2{public String toString() {return "Apple";}}//Fruit2�� ��ӹ��� Apple2Ŭ���� 
class Grape2 extends Fruit2{public String toString() {return "Grape";}}//Fruit2�� ��ӹ��� Grape2Ŭ����

class Juice{															//class Juice
	String name; 
	Juice(String name){this.name = name +"Juice";}						//Juice������
	public String toString() {return name;}
}

class Juicer{															//class Juicer
	static Juice makeJuice(FruitBox2<? extends Fruit2>box) {			//Juicer.makeJuice() static�޼���
																		//�Ű������� Fruit2�� ��ӹ��� �ڽ��̳� �ڽ� Ŭ������ ���� 
		String tmp= "";
		
		for(Fruit2 f : box.getList())									//�Ű������� ����Ʈ�� �޾� ���ڿ��� ��ħ
			tmp += f+" ";
		return new Juice(tmp);											//��ģ ���ڿ��� Juice��ü�� ��ȯ
	}
}

class FruitBox2<T extends Fruit2> extends Box2<T>{};					//class FruitBox2�� Fruit2Ÿ���� ��ü�� ���������ϰ�, Box2�� ��ӹ��� Ŭ����

class Box2<T>{															//class Box2
	ArrayList<T> list = new ArrayList<T>();//Ÿ�Ժ����� ����Ʈ����
	void add(T item) {list.add(item);}									//Box2.add()�޼��� Ÿ�Ժ����� ��ü�� ����Ʈ�� �߰�
	T get(int i) {return list.get(i);}									//Box2.get()�޼��� �ش� �ε����� Ÿ�Ժ��� ��ü�� ��ȯ
	ArrayList<T> getList() {return list;}								//Box2.getList() ArrayList�� ��ȯ�ϴ� �޼���
	int size() {return list.size();}
	
}


