package ex3_Abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		AbsChild1 ac1 = new AbsChild1();
		System.out.println(ac1.changeValue());
		System.out.println(ac1.getValue());
		
		AbsChild2 ac2 = new AbsChild2();
		System.out.println(ac2.getValue());
		System.out.println(ac2.changeValue());
	}
}
