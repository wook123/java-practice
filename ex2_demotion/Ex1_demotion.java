package ex2_demotion;

public class Ex1_demotion {
	public static void main(String[] args) {
		//����ȯ(casting)
		//demotion(���� ����ȯ)
		//ū �ڷ����� ���� �ڷ����� �����ϴ� ��
		
		char c = 'B';//2byte
		int n = c + 1;//int -> 4byte
		c = (char)n;
		System.out.println("c = " + c);
		
		float f = 5.5f;
		int n1 = 0;
		n1 = (int)f;
		System.out.println("n1 = " + n1);
		
		byte b1 = 100;
		byte b2 = 20;
		//byte b3 = b1 + b2;X
		int b3 = b1 + b2;
		byte b4 = (byte)(b1+b2);
		//byte���� ������ �ϴٰ� ������ �Ѱų��� ���� ���� ������
		//�̷� ��Ȳ�� ����Ͽ� java�����ڵ��� byte���� ������ �� ��
		//����� int������ �������� �����ߴ�.
		
		
		
		
		
		
		
		
	}
}
