package calculator;

public class calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		//�߰�ȣ�� return ���� ����
		MyCalculator calc2 = (int num1, int num2) -> num1 + num2;
		
		//�Ķ������ �ڷ����� ������ �����ϴ�.
		MyCalculator calc2 = (num1, num2) -> num1 + num2;
		
		//�Ű������� �ϳ��� �� ���ٸ� ������ִ� ���ٽ� �ۼ�
		//�Ķ���Ͱ� �ϳ��� ���� �Ұ�ȣ�� ������ �� �ִ�.
		MyFunction func = num -> System.out.println(num);
		
		//::(�����ݷ�) : �޼��� ���� ������.
		// ���ٽ��� ���� �����ϰ� ����� �� �ֵ��� ���ش�.
		MyFunction func2 = System.out::println; 
	}
}
