package ex4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿",30,"010-1111-1111");

		System.out.println("�̸� : " + p1.name);
		System.out.println("���� : " + p1.age);
		System.out.println("��ȭ��ȣ : " + p1.tel);
		System.out.println();
		Person p2 = new Person("����浿",40,"010-2222-2222");
		System.out.println("�̸� : " + p2.name);
		System.out.println("���� : " + p2.age);
		System.out.println("��ȭ��ȣ : " + p2.tel);
		
		Person p3 = new Person();//�ĸ����͸� �޴� �����ڸ� ����� �⺻�����ڸ� ����� �� ����.
	}
}
