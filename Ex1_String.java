package ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//자바로 만들어진 모든 프로그램은 클래스로 이루어져 있습니다.
		//우리가 문자열을 저장하기위해 사용했던 String도 java.lang패키지에
		//저장이 되어있는 클래스 파일이다.
		
		
		//클래스의 구성요소: 변수와 함수
		
		//String클래스는 두가지 특징을 가지고 있다.
		//1) 객체 생성법이 두가지(암시적,명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		// 다른 모든 클래스들은 new를 사용하여 명시적 객체 생성을 해야 한다.
		String s1 = "abc";//암시적 객체 생성 (s1,s2가 값이 같으면 같은 주소를 사용한다)
		String s2 = "abc";
		
		//클래스명 객체명 = new 클래스명();(스트링 제외 모든 클래스)
		String s3 = new String("abc");//명시적 객체 생성(값이 같아도 서로 다른 주소를 사용한다)
		String s4 = new String("abc");	
		//== 연산자는 기본자료형을 비교할 떄는 값을 비교한다.
		//객체끼리 비교를 할 떄는 주소를 비교하는 연산자로 기능이 바뀐다.
		if(s1.equals(s3)) {
			System.out.println("값이 같음");
			
		} else {
			System.out.println("값이 다름");
		}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열 : ");
//		String s5 = sc.next();
		
		System.out.println("------------------");
		
		String greet = "안녕";
		greet +="하세요";
		System.out.println(greet);
		//하세요가 붙는 순간 안녕 뒤에 붙는게 아닌
		//안녕하세요 라고 하는 메모리를 새롭게 항당 받는다.
		//남아있는 안녕 메모리 jvm의 GC가 Heap 영역을 돌며 주워간다.
		
	}//main
}
