package ex1_control_stat;

public class Ex4_switch {
	public static void main(String[] args) {
		//switch�� : �񱳰��� ���ǰ��� ���� ����� ����ϴ� ���
		
		/*
		 * switch(�񱳰�){
		 * case ���ǰ�1 :
		 * 		�񱳰��� ���ǰ��� ��ġ�� �� ������ ����
		 * break;
		 * case ���ǰ�2 :
		 * 		�񱳰��� ���ǰ��� ��ġ�� �� ������ ����
		 * break;
		 * case ���ǰ�3 :
		 * 		�񱳰��� ���ǰ��� ��ġ�� �� ������ ����
		 * break;
		 * }
		 */
		int n = 1;
		
		switch(n) {
		case 1:
			System.out.println("1. �����ϱ�");
			break;
		case 2:
			System.out.println("2. ���ӼҰ�");
			break;
		case 3:
			System.out.println("3. ����");
			break;
			default : //�񱳰��� ���ǰ��� ��ġ�ϴ� ���� �ϳ��� ���� ��� �ݵ�� ����Ǵ� ����
				System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
				break;
		}
		
		//����ó���� switch������ ������ ..���� �Ұ���
		int sc = 50;
		switch(sc) {
		case
		}
		
		//if vs switch
		//if���� ������ ������ ������ ���� �� ����Ѵ�,
		//switch���� �ϳ��� ������ ���� �� ����Ѵ�.
	}
}
