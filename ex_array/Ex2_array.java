package ex_array;

public class Ex2_array {
	public static void main(String[] args) {
		int[] iArr = new int[4];
		
		for(int i = 0; i < 4; i++) {
			iArr[i] = (i+1)*100;
			System.out.println(iArr[i]);
		}
		
		char[] ch;
		ch = new char[4];
		//char[] ch = new char[4]
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//배열 내용 출력
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("--------------------------");
		//문자형 배열의 특징
		System.out.println(ch);//문자형 배열은 배열의 이름만으로도 전체 내용을 출력할 수 있다.
		System.out.println(str);//문자열 배열은 이상하게 나온다.
		
		
		
		
	}
}
