package calculator;

public class calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		//중괄호와 return 생략 가능
		MyCalculator calc2 = (int num1, int num2) -> num1 + num2;
		
		//파라미터의 자료형도 생략이 가능하다.
		MyCalculator calc2 = (num1, num2) -> num1 + num2;
		
		//매개변수가 하나일 때 숫다를 출력해주는 람다식 작성
		//파라미터가 하나일 때는 소괄호도 생략할 수 있다.
		MyFunction func = num -> System.out.println(num);
		
		//::(이중콜론) : 메서드 참조 연산자.
		// 람다식을 보다 간결하게 사용할 수 있도록 해준다.
		MyFunction func2 = System.out::println; 
	}
}
