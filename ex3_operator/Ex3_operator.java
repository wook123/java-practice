package ex3_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자.
		//++, --
		
		//1. 선행증감 : 변수의  앞에서 사용된다.
		int a = 10;
		System.out.println("++a : " + ++a);
		
		
		
		//2. 후행증감 : 변수의 뒤에서 사용된다.
		int b = 10;
		System.out.println("b++ : " + b++);
		//연산을 수행한 뒤 다시 사용될 때 1을 증감시켜준다.
		System.out.println("b : " + b);
		
		int n = 1;
		++n;
		n++;
		n++;
		++n;
		++n;
		n++;
		++n;
		System.out.println(n);
		
		a = 10;
		b = 12;
		
		boolean result = ++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a += b) - (a % b) > 10;
			
		//() -> ! ++ -- -> * / % -> + - -> < <= > >= -> == !=(계산 순서)
		System.out.println(result);
		
		
		
		
	}
}
