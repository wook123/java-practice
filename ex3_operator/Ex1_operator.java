package ex3_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		//연산자
		//1. 최고연산자 : . ()
		//2. 증감연산자 : ++, --
		//3. 산술연산자 : +,-,*,/,%(모듈러)
		//4. 시프트연산자 : >>, <<, >>>
		//5. 비교연산자 : >, <, >=, <=, ==, !=
		//6. 비트연산자 : &, |, ^, ~
		//7. 논리연산자 : &&, ||, !
		//8. 삼항연산자 : ?, :
		//9. 대입연산자 : =, *=, /=, +=, -=
		
		//산술연산자
		//4칙연산(+,-,*,/)과 나머지 값을 구하는 %연산자로 나뉜다
		
		int n1,n2,n3; //정수형 변수 선언
		n1 = 20;
		n2 = 7;
		n3 = n1 + n2;
		System.out.println("n3 = " + n3);
		
		n3 = n1 - n2;
		System.out.println("n3 = " + n3);
		
		n3 = n1 / n2;
		System.out.println("n3 = " + n3);
		
		n3 = n1 & n2;
		System.out.println("n3 = " + n3);
		//1. 짝수,홀수 구할 때
		//2. X의 배수 구할 떄
		
		//대입연산자 
		//= 우변의 값을 좌변에 대입한다.****
		//복합대입연산자(산술연산자뒤에 대입연산자가 붙어있는 모양)
		int n4 = 14;
		int n5 = 15;
		System.out.println("=연산자 : n4 = " + n4 + ", n5 = " + n5);
		
		System.out.println("+=연산자 : " + (n4+=n5));// n4 = n4+n5
		
		System.out.println("/=연산자 : " + (n4/=n5)); //n4 = n4/n5
		
		
		
		
	}
}
