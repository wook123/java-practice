package ex2_array;

import java.util.Scanner;

public class Ex1_multi_array {
	public static void main(String[] args) {
		//다차원 배열
		//다차원배열이란 2차원 이상의 배열을 의미하며,배열의 요소로 배열을 가지는 것을 의미
		//2차원 배열은 1차원배열을 요소로 가지고 있고, 3차원 배열은 2차원 배열을 요소로 가지고 있다
		
		//자료형[][]배열명 = new 자료형[1차원 배열의 개수][1차원 배열이 갖고있는 요소의 길이];
		
//		int test[][] = new int[2][3];
//		
//		test[0][0] = 100;
//		test[0][1] = 200;
//		test[0][2] = 300;
//		
//		test[1][0] = 400;
//		test[1][1] = 500;
//		test[1][2] = 600;
		
//		System.out.println(test[0][0]);
		
//		for(int i = 0; i < test.length; i++) {
//			for(int j = 0; j < test[i].length; j++) {
//				System.out.print(test[i][j]);
//			}
//			System.out.println();
//		}
//		
//		
//		char[][] ch = {{'A','B'},{'C','D','E'},{'F'}}
//		
//		
//		//방의 사이즈를 직접 지정해도 됟나.
//		int num[][] = new int[2][];
//		num[0] = new int [3];
//		num[1] = new int[2];
//		int n = 0;
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				System.out.println((num[i][j]= n+=100) + " ");
//			}
//			System.out.println();
//		}
		
		// 2차원 배열의 초기화
//		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		//2차원 배열부터는 큰방에 들어있는 작은방의 크기가 다를 수 있다.
//		int [][] iArr = {{1,2}{3,4,5}{6}}
		
		// 2차원 배열은 작은 방의 크기를 직접 지정할 수도 있다.
		int num[][] = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		int n = 0;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j <num[i].length; j++) {
				System.out.print((num[i][j] = n += 100)+ " " );
			}
			System.out.println();
		}
		
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int total = 0;
		float avg = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		System.out.println("2차원배열의 모든 요소의 총 합 : " + total);
		
		avg = (float)total/count;
		System.out.println(avg);
		
		
		//학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		//프로그램을 실행하면 몇 명의 정보를 저장할 것인지를 입력받은 후
		//입력받은 수 만큼 학생들의 이름과 수학성적, 영어성적을 입력받는 프로그램 작성
		
		//예시 등록할 인원 수 : 2
		//이름 : 홍길동
		//수학 : 90
		//영어 : 87
		
		//이름 : 김길동
		//수학 : 70
		//영어 : 100
		
		//2명 등록 완료
		//홍길동 90 70
		//김길동 70 100
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 인원수 : ");
		int n1 = sc.nextInt();
		String str[][] = new String[n1][3];
		
		for(int i = 0; i <str.length; i++) {
			System.out.print("이름 : ");
			str[i][0] =sc.next();
			
			System.out.print("수학 : ");
			str[i][1] =sc.next();
			
			System.out.print("영어 : ");
			str[i][2] =sc.next();
			
			System.out.println("-----------------");
		}
		
		System.out.println(str.length + "명 등록 완료!!");
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j <str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
