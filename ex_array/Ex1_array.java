package ex_array;

public class Ex1_array {
	public static void main(String[] args) {
		//배열(Array)
		//배열은 같은 자료형의 변수들로 이루어진 유한집합이라고 정의할 수 있다.
		//데이터를 효율적으로 관리하기 위해서는 배열이 꼭 필요하다.
		
		//정수형 변수 -> 여러개 필요하다면 변수를 많이 만들어야 한다.
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//편하게 자원들을 관리하고 제어하기 위해서는 
		//다음과 같은 배열을 생성한다.
		//1) 배열 선언
		//자료형[] 배열명;
		int [] ar;
		
		//2) 배열 생성
		//배열명 = new 자료형[길이(데이터의 갯수)];
		
		ar = new int[4];
		
		//배열의 초가화
		//초기화를 할 떄는 넣어준 데이터의 개수만큼
		//jvm이 알아서 방을 만들어 준다.
//		int[] arr = {100,200,300,400,500};
		
		// 배열에 각각의 방에 값을 넣는 법
		//배열명[index(번호)] = 데이터;
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		//배열출력
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		
		//배열의 출력 2
		for(int i = 0; i < 4; i++) {
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
