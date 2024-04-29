/*
연습으로 만든 자바 파일
2024-04-29
 */

public class Test1 {

	public static void main(String[] args) {
		
		// 정수 변수 x를 선언
		int x;  // 메모리(RAM)에 4byte 공간이 하나 생성됨, 이름은 x
		x = 10;  // 위에서 선언된 정수 변수 x에 정수값이 10 저장됨 
		// -> x의 초기값 = 10 (x를 초기화했다)
		
		int y = 25;
		int z;
		
		// int x, y, z;  // 한번에 3개의 정수 변수 선언
		
		// int x;  // 이미 선언된 변수를 다시 선언하는 것은 불가능
		
		x = 100;  // 다시 값을 넣는 것은 가능
		
		int a = 100;  // 정수 변수 a를 선언과 동시에 100으로 초기화
		
		z = a + y;
		
		System.out.println("저의 수학 점수는 " + a + "점입니다.");
		System.out.printf("저의 수학 점수는 %d점입니다.", a);
		
		char c = 'A';  // c 변수에 65가 저장
		// char d = "A";  // 에러 발생: char '', String ""
		String f = "Korea";  // 문자열은 String(첫글자 대문자!!)로 선언
		// 기본 내장된 데이터 타입 아님
		
		double e1 = 10.1;
		float e2 = 3.14f;  // float은 f를 꼭 붙여줘야 함, double과 차별
		
		long k = 10L;  // long은 뒤에 꼭 L을 붙여줘서 int랑 차별
		
		boolean bool = true;  // boolean : 모두 소문자!
	}

}
