package ex3_person;

public class Person {
	//사람마다 이름, 나이 , 전화번호가 다 다르기 떄문에 미리 설정X
	private String name;
	private int age;
	private String tel;
	
	//setter & getter
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
