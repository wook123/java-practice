package ex1_control_stat;

public class Ex4_switch {
	public static void main(String[] args) {
		//switch문 : 비교값과 조건값을 통해 결과를 출력하는 제어문
		
		/*
		 * switch(비교값){
		 * case 조건값1 :
		 * 		비교값과 조건값이 일치할 때 실행할 문장
		 * break;
		 * case 조건값2 :
		 * 		비교값과 조건값이 일치할 때 실행할 문장
		 * break;
		 * case 조건값3 :
		 * 		비교값과 조건값이 일치할 때 실행할 문장
		 * break;
		 * }
		 */
		int n = 1;
		
		switch(n) {
		case 1:
			System.out.println("1. 게임하기");
			break;
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
			default : //비교값과 조건값이 일치하는 것이 하나도 없는 경우 반드시 실행되는 영역
				System.out.println("메뉴 선택이 올바르지 않습니다.");
				break;
		}
		
		//성적처리를 switch문으로 만들어보기 ..거의 불가능
		int sc = 50;
		switch(sc) {
		case
		}
		
		//if vs switch
		//if문은 범위를 가지고 조건을 비교할 때 사용한다,
		//switch문은 하나를 가지고 비교할 때 사용한다.
	}
}
