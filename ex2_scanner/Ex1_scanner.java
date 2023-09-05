package ex2_scanner;

import java.util.Random;
import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		//Scanner : 키보드에서 값을 직접 입력받아 변수에 저장할 수 있도록 해주는 클래스
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이를 입력해주세요 : ");
//		int num = sc.nextInt();//키보드에서 int타입의 값을 일력하고 엔터를 치는 순간
//							   //num 변수에 사용자가 입력한 값을 대입해준다.
//		System.out.printf("제 나이는 %d살 입니다.\n",num);
//		
//		System.out.print("이름을 입력해 주세요 : ");
//		String name = sc.next();
//		
//		System.out.printf("제 이름은 %s입니다.\n",name);
		
		//키보드에서 값을 입력받고 해당하는 구구단을 출력 해보세요
		//2~9사이의 숫자만 입력하되, 이외의 숫자를 입력하면 "2~9 사이만 입력하세요"
		//라고 출력하기
			
//			System.out.print("값을 입력해주세요");
//			int i = 1;
//			int num = sc.nextInt();
//			if(num < 10) {
//				System.out.printf("%d X %d = %d\n",num,i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//				System.out.printf("%d X %d = %d\n",num,++i,num*i);
//			}else {
//				System.out.println("2~9 사이만 입력하세요");
//			}
//************************************************************
			
//			for(int i = 0; i < 1; i++) {
//				System.out.print("값을 입력해주세요");
//				int num1 = sc.nextInt();
//				if(num1 < 10 && num1 != 1) {
//					for(int j = 1; j < 10; j++) {
//						System.out.printf("%d X %d = %d\n",num1,j,num1*j);			
//					}
//				}else {
//					System.out.println("2~9 사이만 입력하세요");
//				}
//			}System.out.println("");
//			
		/*
		 * Java. Jsp, Android의 시험을 봤다.
		 * 각 점수는 랜덤하게 0 ~ 130이 대입
		 * 
		 * 각 점수를 검사하는 로직은 do-while로 작성하는데
		 * 각 과목 점수가 0 ~100점이 아닐 경우 반드시 0~100사이가 나오도록
		 * 재실행 시킬것
		 * 
		 * 이렇게 세 과목의 점수가 모두 0 ~ 100 사이가 되면 do-while문을 빠져나와
		 * 점수가 화면에 출력되도록 하는 코드를 작성해보자
		 */
//		int Java = 0;
//		int Jsp = 0;
//		int Android = 0;
//		
//		do {
//			Java = new Random().nextInt(131);
//			Jsp = new Random().nextInt(131);
//			Android = new Random().nextInt(131);
//			
//		} while(Java > 100 || Jsp > 100 || Android > 100);
//		System.out.printf("자바 : %d\n",Java);
//		System.out.printf("jsp : %d\n",Jsp);
//		System.out.printf("안드로이드 : %d\n",Android);
		
	}
}
