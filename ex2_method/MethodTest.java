package ex2_method;

public class MethodTest {
	//�޼���� �޼��� �ȿ��� ������ �� ����.
	//�޼��带 ȣ���� ���� �ݵ�� �޼��� �ȿ��� �ؾ��Ѵ�.
			
	//f(X) = 2X+1;
	//f : �޼����
	//X : �ĸ�����
	//2X+1 : ���
	//f(3) = 7;
			
	public int f(int x) {
		int sum = 2*x+1;
		return sum;
	}
		//���� ����
//	public void f(int x) {
//		System.out.println(2*x+1);
	
		public int f2(int x, int y) {
			return x + y;
		
	}
		//�Լ��� ����
		//1. �Է°�(�Ķ����)�� �ְ� ��ȯ���� �ִ°��
		//2. �Է°��� �ְ� ��ȯ���� ���°��
		//3. �Է°��� ���� ��ȯ���� �ִ°��
		//4. �Է°��� ���� ��ȯ���� ���°��
		
		//1 ~ 10���� ������ ���ϴ� �Լ��� ���弼��.
//		public int f3(int x) {
//			return x;
//		}
		public void f4() {
			int total = 0;
			for(int i = 1; i <= 10; i++) {
				total += i;
			}
			System.out.println(total);
		}
		//�ܺο��� ���� �ϳ� �޾Ƽ� �� �ܿ� �ش��ϴ� �������� ����ϴ� �޼��带 ���弼��.
		public void f5(int x) {
			for(int i = 1; i <= 9; i++) {
				System.out.println("%d X i = %d*i");
			}
	
	
	
	
		}
}
