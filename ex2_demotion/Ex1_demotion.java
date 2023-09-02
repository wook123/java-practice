package ex2_demotion;

public class Ex1_demotion {
	public static void main(String[] args) {
		//형변환(casting)
		//demotion(강제 형변환)
		//큰 자료형을 작은 자료형에 대입하는 것
		
		char c = 'B';//2byte
		int n = c + 1;//int -> 4byte
		c = (char)n;
		System.out.println("c = " + c);
		
		float f = 5.5f;
		int n1 = 0;
		n1 = (int)f;
		System.out.println("n1 = " + n1);
		
		byte b1 = 100;
		byte b2 = 20;
		//byte b3 = b1 + b2;X
		int b3 = b1 + b2;
		byte b4 = (byte)(b1+b2);
		//byte끼리 연산을 하다가 범위를 넘거나는 일이 많기 떄문에
		//이런 상황을 대비하여 java개발자들은 byte끼리 연산을 할 떄
		//결과가 int형으로 나오도록 개발했다.
		
		
		
		
		
		
		
		
	}
}
