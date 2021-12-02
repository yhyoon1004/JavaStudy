enum Direction2{
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"),NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();		//상수 배열 DIR_ARR을 생성하고 Direction2의 상수값들을 넣어줌
																			//values메서드는 해당 열거형에 정의된 모든 메서드를 출력
	
	private final int value;												//상수 value참조변수 선언
	private final String symbol;											//상수 symbol참조변수 선언
	
	Direction2(int value, String symbol){						//열거형에 선언된 상수들을 생성하기위한 생성자 
																//EAST(1,">")와 같이 해당상수가 2개의 상수변수를 가지고 있으니까
																//Direction2생성자에 매개변수로 value와 symbol두값을 받고 해당 변수를 상수
		this.value = value;											//상수 value에 값을 초기화
		this.symbol = symbol;										//상수 symbol에 값을 초기화
	}
	
	public int getValue() {return value;}									//열거형의 value값을 반환하는 메서드
	public String getSymbol() {return symbol;}								//열거형의 Symbol값을 반환하는 메서드
	
	public static Direction2 of(int dir) {									// of static메서드 Direction2타입을 반환하는 
		if(dir<1||dir>4)
			throw new IllegalArgumentException("Invalid value : "+dir);		//잘못된 언급발생시 예외 발생
		return DIR_ARR[dir - 1];											//매개변수로 받은 값의 -1을 한 인덱스의 값을 반환
	}
	
	public Direction2 rotate(int num) {										// rotate 메서드 //원형 4분할케이크를 생각하면 이해가능
		num = num%4;														//num을 4로 나누어 나머지를 저장
		if(num<0) num+=4;													//나눈 나머지가 음수일경우 4를 더함
		return DIR_ARR[(value-1+num)%4];									// 
	}
	
	public String toString() {												//열거형 상수명과 symbol을 출력하는 메서드
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
		System.out.println(Direction2.EAST.rotate(1));						//한번 회전
		System.out.println(Direction2.EAST.rotate(2));						//두번 회전
		System.out.println(Direction2.EAST.rotate(-1));						//반대로 한번 회전
		System.out.println(Direction2.EAST.rotate(-2));						//반대로 2번회전
	}
}
