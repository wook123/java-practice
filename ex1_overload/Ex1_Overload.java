package ex1_overload;

public class Ex1_Overload {
	//메서드 오버로드 : 메서드의 '중복정의'라고 하며 하나의 클래스 내에서
	//같은 이름을 가진 메서드가 여러개 정의되는 것
	
	//**메서드 오버로드 규칙**
	//1) 메서드의 이름이 같아야 함
	//2) 파라미터의 개수가 다른 경우
	//3) 파라미터의 개수가 같아도 타입이 다른 경우
	//4) 파라미터의 개수가 같아도 순서가 다른 경우
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	public void result(int x) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	public void result(char n) {
		System.out.println("문자형을 인자로 받는 메서드");
	}
	public void result(int n, String s) {
		System.out.println("정수, 문자형을 인자로 받는 메서드");
	}
	public void result(String s, int n) {
		System.out.println("문자형, 정수를 인자로 받는 메서드");
	}
}
	
