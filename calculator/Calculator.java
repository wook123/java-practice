package calculator;

public class Calculator {
	
	//���ٽ�
	//�޼��带 �ϳ��� ��(expression)���� ǥ���� ��
	//�ڹ� 1.8�������� ����
	
	//���ٽ��� ���Ե� ����
	//�Լ��� ���α׷��� ����� �߰� �־
	//�ڹٿ����� �Լ��� ���α׷��� ����� ������� �ʾҴ�.
	//�ڹٿ��� �Լ��� Ŭ������ ����� �ۼ��� �߾���.
	// �Լ��� ���������� �ʴ� -> �ݵ�� ��ü�� ���� ȣ��
	
	//�Լ��� ���α׷����� Ư¡
	//1. �Լ��� �ĸ����Ϳ� �־ ����� �� �ִ�.
	//2. �Լ��� ��ȯ���� �־ ����� �� �ִ�.
	
	//���ٽ� ����ϴ� ��
	//1. �������̽��� 1�� �����.
	//2. ������ �߻�޼��带 1�� �����մϴ�.
	//3. �޼���� 1���� ���Ǹ� �ؾ� �Ѵ�.
	//4. ���ٽ��� �̿��ϸ鼭 ������ �κ��� �ִ��� �����ϱ�
	
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		int result = calc.plus(20, 30);
		System.out.println(result);
	}
}