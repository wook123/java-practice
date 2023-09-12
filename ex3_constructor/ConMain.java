package ex3_constructor;

public class ConMain {
	public static void main(String[] args) {
		ConTest ct = new ConTest();
		
		ConTest ct2 = new ConTest("홍길동");
		
//		ct2.ConTest(); > 객체를 통해 .을 찍어서 생성자를 호출할 수 없다.
		
//		new라고 하는 키워드는 힙 영역에 메모르리를 차지할 공간이 있는지 찾아보는 역할
//		실제로 공간을 차지하는 역할은 생성자가 한다.
		
		
	}
}
