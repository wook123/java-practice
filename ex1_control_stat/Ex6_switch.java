package ex1_control_stat;

public class Ex6_switch {
	public static void main(String[] args) {
		//switch���� �񱳰����� ��� ������ �ڷ���
		//1) ����(byte,short,int)
		//2) ������(char)
		//3) ���ڿ�(String)
		
		
		
		String str = "ȫ";
		
		switch(str) {
		case "ȫ":
			System.out.println("ȫ�浿�Դϴ�");
			break;
		case "��":
			System.out.println("�ڱ浿�Դϴ�");
			break;
		case "��":
			System.out.println("��浿�Դϴ�");
			break;
		default :
			System.out.println("�߸�� ����");
		}
	}
}
