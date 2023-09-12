package ex4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",30,"010-1111-1111");

		System.out.println("이름 : " + p1.name);
		System.out.println("나이 : " + p1.age);
		System.out.println("전화번호 : " + p1.tel);
		System.out.println();
		Person p2 = new Person("독고길동",40,"010-2222-2222");
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		System.out.println("전화번호 : " + p2.tel);
		
		Person p3 = new Person();//파리미터를 받는 생성자를 만들면 기본생성자를 사용할 수 없다.
	}
}
