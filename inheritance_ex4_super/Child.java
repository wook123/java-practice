package ex4_super;

public class Child extends Parent{
	//super : 부모클래스의 이름
	public Child() {
		super(1);//Parent(); 부모클래스의 생성자 호출
		System.out.println("자식(Child)클래스");
	}
	@Override
	public int result() {
		// TODO Auto-generated method stub
		return super.result();
	}
}
