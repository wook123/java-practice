package ex3_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//�񱳿�����
		//������ ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������.
		//����� �׻� true�Ǵ� false�� ��ȯ�ȴ�.
		//>, <, >=, <=, ==, !=
		
		int n1 = 10;
		int n2 = 20;
		boolean result;
		result = n1 < n2;
		System.out.println("n1 < n2 : " + result);
		
		result = n1 == n2;
		System.out.println("n1 == n2 : " + result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : " + result);
		
		//��������
		//�񱳿����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ����Ѵ�.
		//�������� �������� ��ȯ�Ѵ�.
		// &&, ||, !
		
		//&& : And�� �ǹ̤Ӹ� ������ �ִ�.
		int n3 = 10;
		int n4 = 5;
		//�� && �� -> ��
		//�� && ���� -> ����
		//���� && �� -> ����
		//���� && ���� -> ����
		boolean b1 = n3 > n4 && n3 != n4; //true and true = true
		System.out.println(b1);
		
		// || : or�� �ǹ̸� ������ �ִ�. �� ���� ������ �ϳ��� ���̿��� ������ ��ȯ�Ѵ�.
		// �� || �� -> ��
		// �� || ���� -> ��
		// ���� || �� -> ��
		// ���� || ���� -> ����
		b1 = n3 < n4 || n3 != n4;
		System.out.println("||������ : " + b1);
		
		//! : not true�� false�� , false�� true�� �ٲ��ش�.
		System.out.println("!������ : "+ !b1);
		
		//��Ʈ������
		//�������ڿ� ���������� bit����(2����)�� ���길 �����ϴ�.
		//�Ϲ������� ����Ʈ�����ڿ� ���Ҿ� ��ȣȭ,��ȣȭ �۾��� ���Ǹ�
		//���߿����� ����� �ſ� ����.
		// &, | , ^
		int a = 10;//1010
		int b = 7;// 0111
				  //&0010	
				  //|1111
				  //^1101
		int c = a & b;//����(and) - 2������ �ٲ��� �� �� ���� ��� 1�̰� �������� 0
		System.out.println("c : " + c);
		
		int a2 = 12;//1100
		int b2 = 8;//1000
		int c2 = a2 | b2; //����(or) - 2������ �ٲ��� �� �� ���� ��� 0�� �� 0 �������� 1
		System.out.println("c2 : " + c2);
		
		int a3 = 9;
		int b3 = 11;
		int c3 = a3 ^ b3; //��Ÿ��or(xor) - 2������ �ٲ��� �� �� ���� ���� ���� 0 �ٸ� ���� 1
		System.out.println("c3 : " + c3);
		
		
		
		
		
	}
}
