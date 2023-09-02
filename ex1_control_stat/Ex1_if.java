package ex1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		//제어문(Control statement)
		//프로그램의 흐름을 제어하는 문장
		
		//-조건문:if, switch
		//-반복문:for, while
		
		//if
		//사용법
		/*
		 * if(조건식){
		 *		조건식이 참일 때 실행할 명령
		 * }
		 * 
		 */
		
		int n = 50;
		String str = "";
		
		if(n >= 50) {
			str = "n은 50보다 크거나 같은 수 입니다.";
		}
		System.out.println(str);
		
	}
}
