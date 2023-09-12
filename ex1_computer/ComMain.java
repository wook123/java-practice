package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		//객체 생성하는법
		//클래스명 객체명 = new 클래스명();
		
		Computer com1 = new Computer();
		
		//다른 클래스에 있는 변수의 내용을 가져와서 확인하는 법
		//객체명.변수명;
		com1.ssd = 2048;
		com1.getInfo();
		
		
		System.out.println();
		
		Computer com2 = new Computer();
		com2.getInfo();
		
		
	}
}
