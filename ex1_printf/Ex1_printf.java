package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		//printf : ���ڿ��� ������ ����ִ� �����͸� �Բ� ����� �� �ֵ��� �����ִ� ��������.
		//printf�� f�� format�̶�� ��.
		
		//1. %d : ������ �����͸� ���� �� ����Ѵ�.
		//2. %c : ������ �����͸� ���� �� ����Ѵ�.
		//3. %s : ���ڿ� �����͸� ���� �� ����Ѵ�.
		//4. %f : �Ǽ��� �����͸� ���� �� ����Ѵ�.
		
		
		
		
		
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
		System.out.printf("%d + %d = %d\n",su1,su2,su1+su2);
		
		int age = 30;
		System.out.printf("���� ���̴� %d�� �Դϴ�\n",age);
		
		System.out.printf("���� ���̴� %d���̰� Ű�� %.1f�Դϴ�\n",30,170.1);
		
		System.out.printf("�������� %.2f�Դϴ�\n",3.14);
		
		int count = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%02d ",count++);
			}
			System.out.println();
		}
	}	
	
}
