package ex1_overload;

public class Ex1_Overload {
	//�޼��� �����ε� : �޼����� '�ߺ�����'��� �ϸ� �ϳ��� Ŭ���� ������
	//���� �̸��� ���� �޼��尡 ������ ���ǵǴ� ��
	
	//**�޼��� �����ε� ��Ģ**
	//1) �޼����� �̸��� ���ƾ� ��
	//2) �Ķ������ ������ �ٸ� ���
	//3) �Ķ������ ������ ���Ƶ� Ÿ���� �ٸ� ���
	//4) �Ķ������ ������ ���Ƶ� ������ �ٸ� ���
	
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}
	public void result(int x) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	public void result(char n) {
		System.out.println("�������� ���ڷ� �޴� �޼���");
	}
	public void result(int n, String s) {
		System.out.println("����, �������� ���ڷ� �޴� �޼���");
	}
	public void result(String s, int n) {
		System.out.println("������, ������ ���ڷ� �޴� �޼���");
	}
}
	
