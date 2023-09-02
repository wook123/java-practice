package ex1_control_stat;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		//if - else if : 여러개의 조건 비교가 필요한 경우
		/*
		 * if(조건식1){
		 * 	조건식1이 참일 때 실행하는 문장
		 * } else if(조건식2){
		 * 	조건식1이 거짓이고 조건식2가 참일 때 실행하는 문장
		 * } else {
		 * 위 두 조건이 모두 거짓일 때 실행하는 문장
		 * }
		 */
		
		int sc = 75;
		if(sc >= 90) {
			System.out.println("학점 A");
		} else if(sc >= 80) {
			System.out.println("학점 B");
		} else if(sc >= 70) {
			System.out.println("학점 C");
		} else if(sc >= 60) {
			System.out.println("학점 D");
		} else {
			System.out.println("학점 F");
		}
		
		if(sc <= 100 && sc >=90) {
			System.out.println("학점 A");
		if(sc <= 89 && sc >=80) {
			System.out.println("학점 B");
		if(sc <= 79 && sc >=70) {
			System.out.println("학점 C");
		if(sc <= 69 && sc >=60) {
			System.out.println("학점 D");
		if(sc <= 59 && sc >=0) {
			System.out.println("학점 F");
		}
		
		int n = 5;
		
		if(n >=5) {
			if(n % 2 == 1) {
				System.out.println("n은 홀수 입니다");
			}
		}
	}
}
