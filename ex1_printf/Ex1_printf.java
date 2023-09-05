package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		//printf : 문자열과 변수에 들어있는 데이터를 함께 출력할 수 있도록 도와주는 포맷형식.
		//printf의 f는 format이라는 뜻.
		
		//1. %d : 정수형 데이터를 받을 때 사용한다.
		//2. %c : 문자형 데이터를 받을 때 사용한다.
		//3. %s : 문자열 데이터를 받을 때 사용한다.
		//4. %f : 실수형 데이터를 받을 때 사용한다.
		
		
		
		
		
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
		System.out.printf("%d + %d = %d\n",su1,su2,su1+su2);
		
		int age = 30;
		System.out.printf("저의 나이는 %d세 입니다\n",age);
		
		System.out.printf("저의 나이는 %d세이고 키는 %.1f입니다\n",30,170.1);
		
		System.out.printf("원주율은 %.2f입니다\n",3.14);
		
		int count = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%02d ",count++);
			}
			System.out.println();
		}
	}	
	
}
