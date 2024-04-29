/*
연습으로 만든 자바 파일
2024-04-29
 */

public class Test01 {

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
	
	}

}
