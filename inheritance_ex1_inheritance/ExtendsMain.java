package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		//ChildŬ������ ParentŬ������ ��ӹ��� �����̹Ƿ�
		//�θ�κ��� ��ӹ��� money str���� ������ ������� ������ ����� �� �ִ�.
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		Parent p1 = new Parent();
		System.out.println(p1.str);
//		System.out.println(p1.car);//�ڽ��� ����� �θ� ������� ����� �� ����.
		
		//����� Ư¡
		//1)�Ѹ��� �ڳడ �θ��� �θ� ���°� �Ұ����ϴ�.
		//2)� ��Ȳ�� �Ƶ� ��Ӱ����� ����⿡�� Object�� �ִ�.(������ ����)
		//Object�� ��� Ÿ���� �޾Ƶ��� �� �ִ� �ֻ��� ��ü�̴�.
	}
}
