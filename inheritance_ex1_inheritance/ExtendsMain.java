package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		//Child클래스는 Parent클래스를 상속받은 상태이므로
		//부모로부터 상속받은 money str등의 변수를 마음대로 가져다 사용할 수 있다.
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		Parent p1 = new Parent();
		System.out.println(p1.str);
//		System.out.println(p1.car);//자식의 재산을 부모가 마음대로 사용할 수 없다.
		
		//상속의 특징
		//1)한명의 자녀가 두명의 부모를 갖는게 불가능하다.
		//2)어떤 상황이 됐든 상속관계의 꼭대기에는 Object가 있다.(조상의 개념)
		//Object는 모든 타입을 받아들일 수 있는 최상위 객체이다.
	}
}
