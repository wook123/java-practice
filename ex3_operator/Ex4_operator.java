package ex3_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//���� ������
		//? : 
		//�ϳ��� ������ �����Ͽ� �� ������ ���ϰ�� ������ ����, ������ ��� ������ ������ �����ϴ� ������.
		//���� : ���� ������ �Ǻ��ϴ½�
		
		int a = 10;
		int b = 15;
		boolean result = ++a >= b ? true : false;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		char result2 = (n1+=n1) == n2 ? 'O' : 'X';
		System.out.println(result2);
		
		/*��,���,�������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ����
		 *5,7,5���̴�.
		 *���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���ϰ�,
		 *�ð��� ��ü ������ ���� ������ ���. 
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		float avg = (float)total/24;
		System.out.println("�Ϸ翡 ����Ǵ� ������ �� ���� : " + total);
		System.out.println("�ð��� ����Ǵ� ������ �� ���� : " + avg);
		
		
	}
}
