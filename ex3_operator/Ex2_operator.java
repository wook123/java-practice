package ex3_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자.
		//결과가 항상 true또는 false로 반환된다.
		//>, <, >=, <=, ==, !=
		
		int n1 = 10;
		int n2 = 20;
		boolean result;
		result = n1 < n2;
		System.out.println("n1 < n2 : " + result);
		
		result = n1 == n2;
		System.out.println("n1 == n2 : " + result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : " + result);
		
		//논리연산자
		//비교연산자를 통한 연산이 2개 이상 필요할 떄 사용한다.
		//연산결과를 논리형으로 반환한다.
		// &&, ||, !
		
		//&& : And의 의미ㅣ를 가지고 있다.
		int n3 = 10;
		int n4 = 5;
		//참 && 참 -> 참
		//참 && 거짓 -> 거짓
		//거짓 && 참 -> 거짓
		//거짓 && 거짓 -> 거짓
		boolean b1 = n3 > n4 && n3 != n4; //true and true = true
		System.out.println(b1);
		
		// || : or의 의미를 가지고 있다. 앞 뒤의 연산중 하나만 참이여도 참으로 반환한다.
		// 참 || 참 -> 참
		// 참 || 거짓 -> 참
		// 거짓 || 참 -> 참
		// 거짓 || 거짓 -> 거짓
		b1 = n3 < n4 || n3 != n4;
		System.out.println("||연산자 : " + b1);
		
		//! : not true를 false로 , false를 true로 바꿔준다.
		System.out.println("!연산자 : "+ !b1);
		
		//비트연산자
		//논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		//일반적으로 시프트연산자와 더불어 암호화,복호화 작업에 사용되며
		//개발에서는 사용이 매우 적다.
		// &, | , ^
		int a = 10;//1010
		int b = 7;// 0111
				  //&0010	
				  //|1111
				  //^1101
		int c = a & b;//논리곱(and) - 2진수로 바꿨을 때 두 값이 모두 1이고 나머지는 0
		System.out.println("c : " + c);
		
		int a2 = 12;//1100
		int b2 = 8;//1000
		int c2 = a2 | b2; //논리합(or) - 2진수로 바꿨을 때 두 값이 모두 0일 때 0 나머지는 1
		System.out.println("c2 : " + c2);
		
		int a3 = 9;
		int b3 = 11;
		int c3 = a3 ^ b3; //베타적or(xor) - 2진수로 바꿨을 때 두 값이 같을 떄는 0 다를 떄는 1
		System.out.println("c3 : " + c3);
		
		
		
		
		
	}
}
