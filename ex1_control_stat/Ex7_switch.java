package ex1_control_stat;

public class Ex7_switch {
	public static void main(String[] args) {
		//������ ������ �ϳ� ���� ���� �����Ѵ�.
		//�ش� ���� ���ϱ��� �ִ��� switch���� �̿��ؼ� �ۼ��ϼ���.
		//ex) 4�� �Ѵ��� 00�ϱ��� �ֽ��ϴ�.
		
		int month = 4;
		
		switch(month) {
		case 1 : case 3: case 5: case 7:
		case 8 : case 10 :case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�");
			break;
		case 2:
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�");
			break;
		}
		
		
		//�ΰ��� ������ �ʱ�ȭ �ϰ� (������ ����)
		//�����ڸ� �ϳ� ������ ���(+,-,*,/) switch������ �� ������ �����ϴ� �ڵ带 �ۼ��غ���.
		
		int num1 = 10;
		int num2 = 7;
		
		String op = "+";
		
		switch() {
		case "+":
			System.out.println(num1 + op + num2 + "=" + (num1 + num2));
			
			
			
			
			
		}
 	}
}
