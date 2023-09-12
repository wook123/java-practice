package ex4_person;

public class Person {
	String name;
	int age;
	String tel;
	public Person() {
		//기본생성자를 사용하고 싶다면 명시를 해줘야 한다.
	}
	public Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
}
