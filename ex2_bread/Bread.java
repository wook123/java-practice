package ex2_bread;

public class Bread {
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
		System.out.println();
	}
	
	public void makeBread(int x) {
		for(int i = 0; i < x; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�\n",x);
		System.out.println();
	}
	public void makeBread(String name, int x) {
		for(int i = 0; i < x; i++) {
			System.out.printf("%s���� ��������ϴ�.\n",name);
		}
		System.out.printf("��û�Ͻ� %d���� %s���� ��������ϴ�.\n",x,name);
		System.out.println();
	}
}
