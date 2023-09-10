package ex1_String;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//메서드
		//어떤 작업을 수행하기 위한 명령문의 집합
		
		//클래스에 속해있는 메서드(함수)를 사용하는 방법
		//클래스로 객체를 만들어서 객체.함수명()
		String str = "Hong Gil Dong";
		System.out.println("문자열 str의 길이 : " + str.length() );
		
		int index = str.indexOf('G');
		System.out.println("맨 처음 문자 G의 위치 : " + index);
		
		char c = str.charAt(5);
		System.out.println("추출한 문자 : " + c);
		
		System.out.println("내가 원하는 문자열을 치환 : " + str.replace("Gil", "Mal"));
		
		System.out.println("잘라낸 문자열 : " + str.substring(0,6));//(0번쨰부터,6글자)
		
		String arr[] = str.split(" ");//띄어쓰기를 기준으로 분할
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %s\n",i,arr[i]);
		}
		
		// trim() : 문자열의 앞뒤 공백을 제거해주는 기능
		System.out.println(str.trim());
		
		//String클래스에 속해있는 메서드는 아니지만 유용한 메서드
		//문자열로 작성된 숫자를 실제 정수로 바꿔주는 코드
		
		String number = "1";
		System.out.println(Integer.parseInt(number));
		
		int number2 = 1;
		System.out.println(Integer.toString(number2) + 10);
	}
}
