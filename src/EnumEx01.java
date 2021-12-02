
enum Direction {EAST, SOUTH, WEST, NORTH}								//������ ��� ����


public class EnumEx01 {													//public class 
	public static void main(String[] args) {							//main	
		Direction d1 = Direction.EAST;									//������ �������� d1�� ��� EAST ���� 
		Direction d2 = Direction.valueOf("WEST");						//d2�� ������ �޼��� valueOf()�� ���ؼ� �ش� ���ڿ��� ���� ��� ����
		Direction d3 = Enum.valueOf(Direction.class, "EAST");			//d3�� ������ EnumŬ���� �޼��� valueOf(������Ŭ����,���ڿ�)�� �̿��ؼ� ����
		
		System.out.println("d1 = "+d1);									//d1�� ������ ��ü ���
		System.out.println("d2 = "+d2);									//d2�� ������ ��ü ��� 
		System.out.println("d3 = "+d3);
		
		System.out.println("d1 == d2 ? "+(d1==d2));						//�񱳿����� ==�� ���� ���� ������� ���Ͽ� ���
		System.out.println("d1 == d3 ? "+(d1==d3));						//
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));			//equals�� ���� ���� ������� ��
//		System.out.println("d2 > d3 ? "+(d1>d3));
		System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)));	//compareTo()�� �̿��� ������ ��
		System.out.println("d1.compareTo(d2) ? "+(d1.compareTo(d2)));
		
		switch(d1 ) {													//switch������ d1�� �޾� ����
		case EAST:
			System.out.println("The direction is EAST.");break;
			
		case SOUTH:
			System.out.println("The direction is SOUTH.");break;
			
		case WEST:
			System.out.println("The direction is WEST.");break;
		
		case NORTH:
			System.out.println("The direction is NORTH");break;
			
		default:
			System.out.println("Invalid direction.");break;
		}
		
		Direction[] dArr = Direction.values();							//������ �迭������, ������ �޼��� values()�� ����
		for(Direction d: dArr)
			System.out.printf  ("%s = %d%n",d.name(), d.ordinal());		//������ �迭 ����� �̸��ϰ� ���� ���� ��ȯ
	}
}


 