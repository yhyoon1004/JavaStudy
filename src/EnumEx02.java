enum Direction2{
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"),NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();		//��� �迭 DIR_ARR�� �����ϰ� Direction2�� ��������� �־���
																			//values�޼���� �ش� �������� ���ǵ� ��� �޼��带 ���
	
	private final int value;												//��� value�������� ����
	private final String symbol;											//��� symbol�������� ����
	
	Direction2(int value, String symbol){						//�������� ����� ������� �����ϱ����� ������ 
																//EAST(1,">")�� ���� �ش����� 2���� ��������� ������ �����ϱ�
																//Direction2�����ڿ� �Ű������� value�� symbol�ΰ��� �ް� �ش� ������ ���
		this.value = value;											//��� value�� ���� �ʱ�ȭ
		this.symbol = symbol;										//��� symbol�� ���� �ʱ�ȭ
	}
	
	public int getValue() {return value;}									//�������� value���� ��ȯ�ϴ� �޼���
	public String getSymbol() {return symbol;}								//�������� Symbol���� ��ȯ�ϴ� �޼���
	
	public static Direction2 of(int dir) {									// of static�޼��� Direction2Ÿ���� ��ȯ�ϴ� 
		if(dir<1||dir>4)
			throw new IllegalArgumentException("Invalid value : "+dir);		//�߸��� ��޹߻��� ���� �߻�
		return DIR_ARR[dir - 1];											//�Ű������� ���� ���� -1�� �� �ε����� ���� ��ȯ
	}
	
	public Direction2 rotate(int num) {										// rotate �޼��� //���� 4��������ũ�� �����ϸ� ���ذ���
		num = num%4;														//num�� 4�� ������ �������� ����
		if(num<0) num+=4;													//���� �������� �����ϰ�� 4�� ����
		return DIR_ARR[(value-1+num)%4];									// 
	}
	
	public String toString() {												//������ ������ symbol�� ����ϴ� �޼���
		return name() +getSymbol();
	}
	
}																			//Direction2 end


public class EnumEx02 {
	public static void main(String[] args) {
		for(Direction2 d : Direction2.values())
			System.out.printf("%s = %d%n",d.name(),d.getValue());
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("d1 = %s,	%d%n",d1.name(),d1.getValue());
		System.out.printf("d2 = %s,	%d%n",d2.name(),d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));						//�ѹ� ȸ��
		System.out.println(Direction2.EAST.rotate(2));						//�ι� ȸ��
		System.out.println(Direction2.EAST.rotate(-1));						//�ݴ�� �ѹ� ȸ��
		System.out.println(Direction2.EAST.rotate(-2));						//�ݴ�� 2��ȸ��
	}
}
