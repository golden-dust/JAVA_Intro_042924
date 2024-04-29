
public class Test02 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println(a + b);
		System.out.println((float) a / b);
		// 변환 안 해주면 정수 0으로 나옴
		
		
		double c = 3.5;
		double d = 7.0;
		
		System.out.println(c + d);
		System.out.println(d / c);
		// 실수 대 실수 연산은 소수점이 없는 값도 .0 붙어서 실수로 나옴
		
		int e = 10;
		double f = 2.5;
		
		System.out.println(e + f);
		// 정수와 실수 연산은 실수로 나옴
		
		int r1;
		r1 = (int) (e / f);
		int r2;
		r2 = e / (int) f;
		System.out.println(r1);
		System.out.println(r2);
		
		
		String str1 = "3" + 10;
		// 문자열 + 정수를 연산하면 양쪽 다 문자열로 변환한 후 결합시켜버림
		System.out.println(str1);  // => 310
		
		
		String numStr1 = "10";
		
		// int numInt1 = (int) numStr1;  
		// 파이썬에서는 가능하나 자바에서는 불가!
		
		// wrapper 클래스 사용 
		int numInt1 = Integer.parseInt(numStr1);  // 문자열 -> 정수 변환
		
		String numStr2 = "3.14";
		double numDouble2 = Double.parseDouble(numStr2);
		
		System.out.println(numInt1);
		System.out.println(numDouble2);
		
		String boolStr = "true";
		boolean numlogic = Boolean.parseBoolean(boolStr);
		System.out.println(numlogic);
		
		int num1 = 100;
		// String str2 = (String) 100;
		// 자바에서는 숫자(정수, 실수)를 바로 문자열로 변환 불가!
		
		String str2 = String.valueOf(num1);
		System.out.println(str2);
	}

}

