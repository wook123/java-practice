package ex2_bread;

public class BreadMain {
	public static void main(String[] args) {
		//Bread클래스를 만들어 각기 다른 기능을 하는 makeBread()메서드를 세 개만드는데,
		//메인클래스에서 각각의 메서드를 호출했을때의 결과를 보고 로직을 구현해 보자.
		
//		빵을 만들었습니다<< Bread 1을 호출
			
//		빵을 만들었습니다<< Bread 2을 호출
		//빵을 만들었습니다.
		//요청하신 n개의 빵을 만들었습니다.
		
		//크림빵을 만들었습니다<< Bread 3을 호출
		//크림빵을 만들었습니다.
		//요청하신 n개의 빵을 만들었습니다.
		Bread result = new Bread();
		result.makeBread();
		result.makeBread(3);
		result.makeBread("소보로",3);
		
	}
}
