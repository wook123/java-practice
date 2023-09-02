package ex3_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//삼항 연산자
		//? : 
		//하나의 조건을 정의하여 그 조건이 참일경우 실행할 문장, 것짓일 경우 실행할 문장이 존재하는 연산자.
		//조건 : 참과 거짓을 판별하는식
		
		int a = 10;
		int b = 15;
		boolean result = ++a >= b ? true : false;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		char result2 = (n1+=n1) == n2 ? 'O' : 'X';
		System.out.println(result2);
		
		/*배,사과,오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		 *5,7,5개이다.
		 *과수원에서 하루에 생산되는 과일의 총 개수를 구하고,
		 *시간당 전체 과일의 생산 개수를 출력. 
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		float avg = (float)total/24;
		System.out.println("하루에 생산되는 과일의 총 개수 : " + total);
		System.out.println("시간당 생상되는 과일의 총 개수 : " + avg);
		
		
	}
}
