package ex3_calcurator;

public class CalMain {
	public static void main(String[] args) {
		//Calculator클래스를 만들고
		//getResult()메서드를 정의하세요. 반환형은 정수
		//파리미터 두개는 (n1, n2)를 받고 -1로 return 하게 만듭니다
		
		//CalPlus클래스를 만들어 calculator클래스를 상속받으세요.
		//오버라이드를 이용하여 Calculator의 getResult()메서드를
		//인자로 받은 n1과 n2를 더해주는 함수로 만듭니다.
		//물론 이때 return값이 -1 이어서는 안됩니다.
		
		//CalMinus클래스를 만들어 Calculator클래스를 상속받으세요
		//오버라이드를 이용하여 Calculator의 getResult()메서드를
		//인자로 받은 n1과 n2를 빼주는 함수로 만듭니다.
		
		//Main에서 싱행하여 아래와 같은 결과가 나오면 성공
		//CalPlus : 30
		//CalMinus : 15
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(15, 15));
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(30, 15));
	}
}
