package ex1_control_stat;

public class Ex2_if_else {
	public static void main(String[] args) {
		//if-else
		/*
		 * if(���ǽ�){
		 * ���ǽ��� ���� �� �����ϴ� ����
		 * } else {
		 * ���ǽ��� ������ �� �����ϴ� ����
		 * }
		 * 
		 */
		
		int n = 49;
		String str = null;
		//null : ��� �����ε� �ʱ�ȭ ���� �ʴ� ����
		//���� ���� ����� �����̴� ��� jvm���� �Ϸ��ִ� ����
		
		if(++n >= 50) {
			str = "n�� 50 �̻��� ��";
		} else {
			str = "n�� 50 �̸��� ��";
		}
		System.out.println(str);
		
		//���� age�� ���̸� �����ϰ� 30�� �̻��̸�
		//��Ǹ�ŭ ��̳׿�
		//�׷��� ������ "�� ��ŵ� �ǰڳ׿� ���
		//�� ���������� �����մϴ� ���� ���
		
		int age = 25;
		String str = null;
		if(age>=30) {
			str = "��Ǹ�ŭ ��̳׿�";
		} else {
			str = "�� ��ŵ� �ǰڳ׿�";
		}
		System.out.println(str + " �����մϴ�");
		
		
		String result age >= ? "��Ǹ�ŭ ��̱���" : "�� ��ŵ� �ǰڳ׿�";
		System.out.println(result);
	}
}
