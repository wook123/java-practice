package ex1_control_stat;

public class Ex7_switch {
	public static void main(String[] args) {
		//정수형 변수를 하나 만들어서 달을 대입한다.
		//해당 달이 몇일까지 있는지 switch문을 이용해서 작성하세요.
		//ex) 4월 한달은 00일까지 있습니다.
		
		int month = 4;
		
		switch(month) {
		case 1 : case 3: case 5: case 7:
		case 8 : case 10 :case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		}
		
		
		//두개의 정수를 초기화 하고 (임의의 숫자)
		//연산자를 하나 변수에 담고(+,-,*,/) switch문으로 두 정수를 연산하는 코드를 작성해보자.
		
		int num1 = 10;
		int num2 = 7;
		
		String op = "+";
		
		switch() {
		case "+":
			System.out.println(num1 + op + num2 + "=" + (num1 + num2));
			
			
			
			
			
		}
 	}
}
