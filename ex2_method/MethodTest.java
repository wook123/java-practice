package ex2_method;

public class MethodTest {
	//메서드는 메서드 안에서 정의할 수 없다.
	//메서드를 호출할 떄는 반드시 메서드 안에서 해야한다.
			
	//f(X) = 2X+1;
	//f : 메서드명
	//X : 파리미터
	//2X+1 : 기능
	//f(3) = 7;
			
	public int f(int x) {
		int sum = 2*x+1;
		return sum;
	}
		//위랑 같음
//	public void f(int x) {
//		System.out.println(2*x+1);
	
		public int f2(int x, int y) {
			return x + y;
		
	}
		//함수의 종류
		//1. 입력값(파라미터)이 있고 반환값이 있는경우
		//2. 입력값이 있고 반환값이 없는경우
		//3. 입력값이 없고 반환값이 있는경우
		//4. 입력값이 없고 반환값이 없는경우
		
		//1 ~ 10까지 총합을 구하는 함수를 만드세요.
//		public int f3(int x) {
//			return x;
//		}
		public void f4() {
			int total = 0;
			for(int i = 1; i <= 10; i++) {
				total += i;
			}
			System.out.println(total);
		}
		//외부에서 값을 하나 받아서 그 단에 해당하는 구구단을 출력하는 메서드를 만드세요.
		public void f5(int x) {
			for(int i = 1; i <= 9; i++) {
				System.out.println("%d X i = %d*i");
			}
	
	
	
	
		}
}
