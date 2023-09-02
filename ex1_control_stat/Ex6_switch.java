package ex1_control_stat;

public class Ex6_switch {
	public static void main(String[] args) {
		//switch문의 비교값으로 사용 가능한 자료형
		//1) 정수(byte,short,int)
		//2) 문자형(char)
		//3) 문자열(String)
		
		
		
		String str = "홍";
		
		switch(str) {
		case "홍":
			System.out.println("홍길동입니다");
			break;
		case "박":
			System.out.println("박길동입니다");
			break;
		case "김":
			System.out.println("김길동입니다");
			break;
		default :
			System.out.println("잘몬된 정보");
		}
	}
}
