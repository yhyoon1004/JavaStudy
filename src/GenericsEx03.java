import java.util.ArrayList;

public class GenericsEx03 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();//Fruit�� ���׸����� �޴� FruitboxŬ���� ����
		FruitBox<Apple> appleBox = new FruitBox<Apple>();//Apple�� ���׸�����...
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>();//error �������� Ÿ�Ժ����ϰ� ������ Ÿ�Ժ����ϰ� �ٸ�
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();//erorr Ÿ�Ժ����� fruit�� eatable�� ������ ���� �ƴ�
		
		fruitBox.add(new Fruit());//Fruit��ü�� �߰�
		fruitBox.add(new Apple());//Fruit�� ��ӹ޴� Apple��ü �߰� 
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());//error Apple�� Ÿ�Ժ����� appleBox�� GrapeŸ���� ������
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+fruitBox);//���
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
		
		    
	}
}

interface Eatable{}									//Eatable�������̽�

class Fruit implements Eatable{						//Eatable�������̽��� ������ FruitŬ����
	public String toString() {return "Fruit";}
}
class Apple extends Fruit{							//Fruit�� ��ӹ��� AppleŬ����
	public String toString() {return "Apple";}
}
class Grape extends Fruit{								
	public String toString() {return "Grape";}
}

class Toy{											//�ƹ��͵� ��ӹ������� toyŬ����
	public String toString() {return "Toy";	}
}

class FruitBox <T extends Fruit&Eatable> extends Box<T>{ 
	//T�� fruit, eatable�����߰� TŸ�� Box�� ��ӹ޴� FruitBoxŬ����
}

class Box<T>{//�Ѱ��� Ÿ�Ը����� ������ ���� ������ boxŬ����
	ArrayList<T> list = new ArrayList<T>();	//������ TŸ������ ArrayList�� ����
	void add(T item) {list.add(item);}		//list�� TŸ�� ��ü�� �߰����ִ� �޼���
	T get(int i) {return list.get(i);}		//TŸ�� ��ü�� ��ȯ�ϴ� get�޼���
	int size() {return list.size();}		//����Ʈ ũ�⸦ ��ȯ�ϴ� size�޼��� 
	public String toString() {return list.toString();}	//toString�޼���
}




