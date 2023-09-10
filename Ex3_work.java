package ex1_String;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자 a가 몇개 들어있는지를 판별하는 코드를 작성해보자
		
		//입력 : asdfasdf
		//a의 갯수 : 2
		
		
		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("문자열에서 a의 개수는 : " + count);
		
		//회문 구하기
		//회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장을 의미합니다.
		//12121, 토마토, 기러기, 별똥별, 스위스 등등
		//키보드에서 문자열을 입력받은 후 회문인지 아닌지 판별하는 코드를 구현하자.
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		String str2 = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println(str+"은 회문이다");
		} else {
			System.out.println(str+"은 회문이 아니다.");
		}
		
		
		
		}
	}

