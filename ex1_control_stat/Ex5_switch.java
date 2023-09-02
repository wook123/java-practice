package ex1_control_stat;

public class Ex5_switch {
	public static void main(String[] args) {
		char c = 'A';
		
		
		switch(c) {
		case 'A':
			System.out.println("점수가 100~90점");
			break;
		case 'B':
			System.out.println("점수가 89~80점");
			break;
		case 'C':
			System.out.println("점수가 79~70점");
			break;
		case 'D':
			System.out.println("점수가 69~60점");
			break;
		case 'F':
			System.out.println("점수가 50 이하");
			break;
		default:
			System.out.println("잘못된 정보");
			break;
		}
	}
}
