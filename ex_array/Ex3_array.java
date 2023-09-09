package ex_array;

import java.util.Random;
import java.util.Scanner;

public class Ex3_array {
	public static void main(String[] args) {
		/*
		 * 배열 arr에 담겨있는 모든 요소의 값의 합을 출력하세요
		 * 결과 : 150
		 * 
		 */
		
//		int [] arr = {10,20,30,40,50};
//		
//		int arrtotal = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//		System.out.println(artotal);
		
//		int arrtotal = 0;
//		for(int i = 0; i < arr.length; i++) {
//			arrtotal += arr[i];
//		}
//		System.out.println("결과 : " + arrtotal);
		
		//프로그램이 실행되면 배열의 길이를 몇으로 할 것인지 키보드에서 입력받는다.
		//입력받은 길이만큼 알파벳을 순서대로 출력해보자.
		
		//ex) 배열의 길이를 몇으로? : 5
		//결과 : ABCDE
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 길이를 입력해 주세요 : ");
//		int n = sc.nextInt();
//		
//		char ch[] = new char[n];
//		char c = 'A';
//		
//		for(int i = 0; i < ch.length; i++) {
//			ch[i] = c++;
//			System.out.print(ch[i]);
//			
//			
//			
//			
//		}
//		
//		System.out.println("----------------------");
//		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다
		//단 1의자리 숫자는 반드시 0이 되도록 만든다.
		
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지
		//가능한한 적은 수의 동전을 사용하는 코드를 작성
		
//		int money = new Random().nextInt(500)+1;
//		int m = money*10;
//		System.out.println("금액 : " + m);
//		int [] coin = {500,100,50,10};
//		for(int i = 0; i < coin.length; i++) {
//			int res = money / coin[i];
//			System.out.println(coin[i] + "원 : " + res);
//			money %= coin[i];
//		}
		
		//1~45의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기
		
		//로또번호를 담을 6개의 방을 가진 정수형 배열 생성
		int[] lotto = new int[6];
		w: for(int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue w;
				}
			}
			System.out.printf("lotto[%d] : %d\n",i,lotto[i]);
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
