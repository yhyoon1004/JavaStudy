
enum Direction {EAST, SOUTH, WEST, NORTH}								//열거형 상수 생성


public class EnumEx01 {													//public class 
	public static void main(String[] args) {							//main	
		Direction d1 = Direction.EAST;									//열거형 참조변수 d1에 상수 EAST 참조 
		Direction d2 = Direction.valueOf("WEST");						//d2에 열거형 메서드 valueOf()를 통해서 해당 문자열과 같은 상수 참조
		Direction d3 = Enum.valueOf(Direction.class, "EAST");			//d3에 열거형 Enum클래스 메서드 valueOf(열거형클래스,문자열)을 이용해서 참조
		
		System.out.println("d1 = "+d1);									//d1가 참조한 객체 출력
		System.out.println("d2 = "+d2);									//d2가 참조한 객체 출력 
		System.out.println("d3 = "+d3);
		
		System.out.println("d1 == d2 ? "+(d1==d2));						//비교연산자 ==을 통해 같은 상수인지 비교하여 출력
		System.out.println("d1 == d3 ? "+(d1==d3));						//
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));			//equals를 통한 같은 상수인지 비교
//		System.out.println("d2 > d3 ? "+(d1>d3));
		System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)));	//compareTo()를 이용한 열거형 비교
		System.out.println("d1.compareTo(d2) ? "+(d1.compareTo(d2)));
		
		switch(d1 ) {													//switch문으로 d1을 받아 수행
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
		
		Direction[] dArr = Direction.values();							//열거형 배열생성후, 열거형 메서드 values()로 참조
		for(Direction d: dArr)
			System.out.printf  ("%s = %d%n",d.name(), d.ordinal());		//열거형 배열 모든요소 이름하고 정의 순서 반환
	}
}


 