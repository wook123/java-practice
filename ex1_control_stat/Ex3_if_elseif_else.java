package ex1_control_stat;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		//if - else if : �������� ���� �񱳰� �ʿ��� ���
		/*
		 * if(���ǽ�1){
		 * 	���ǽ�1�� ���� �� �����ϴ� ����
		 * } else if(���ǽ�2){
		 * 	���ǽ�1�� �����̰� ���ǽ�2�� ���� �� �����ϴ� ����
		 * } else {
		 * �� �� ������ ��� ������ �� �����ϴ� ����
		 * }
		 */
		
		int sc = 75;
		if(sc >= 90) {
			System.out.println("���� A");
		} else if(sc >= 80) {
			System.out.println("���� B");
		} else if(sc >= 70) {
			System.out.println("���� C");
		} else if(sc >= 60) {
			System.out.println("���� D");
		} else {
			System.out.println("���� F");
		}
		
		if(sc <= 100 && sc >=90) {
			System.out.println("���� A");
		if(sc <= 89 && sc >=80) {
			System.out.println("���� B");
		if(sc <= 79 && sc >=70) {
			System.out.println("���� C");
		if(sc <= 69 && sc >=60) {
			System.out.println("���� D");
		if(sc <= 59 && sc >=0) {
			System.out.println("���� F");
		}
		
		int n = 5;
		
		if(n >=5) {
			if(n % 2 == 1) {
				System.out.println("n�� Ȧ�� �Դϴ�");
			}
		}
	}
}
