package ex3_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������.
		//++, --
		
		//1. �������� : ������  �տ��� ���ȴ�.
		int a = 10;
		System.out.println("++a : " + ++a);
		
		
		
		//2. �������� : ������ �ڿ��� ���ȴ�.
		int b = 10;
		System.out.println("b++ : " + b++);
		//������ ������ �� �ٽ� ���� �� 1�� ���������ش�.
		System.out.println("b : " + b);
		
		int n = 1;
		++n;
		n++;
		n++;
		++n;
		++n;
		n++;
		++n;
		System.out.println(n);
		
		a = 10;
		b = 12;
		
		boolean result = ++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a += b) - (a % b) > 10;
			
		//() -> ! ++ -- -> * / % -> + - -> < <= > >= -> == !=(��� ����)
		System.out.println(result);
		
		
		
		
	}
}
