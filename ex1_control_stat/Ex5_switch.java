package ex1_control_stat;

public class Ex5_switch {
	public static void main(String[] args) {
		char c = 'A';
		
		
		switch(c) {
		case 'A':
			System.out.println("������ 100~90��");
			break;
		case 'B':
			System.out.println("������ 89~80��");
			break;
		case 'C':
			System.out.println("������ 79~70��");
			break;
		case 'D':
			System.out.println("������ 69~60��");
			break;
		case 'F':
			System.out.println("������ 50 ����");
			break;
		default:
			System.out.println("�߸��� ����");
			break;
		}
	}
}
