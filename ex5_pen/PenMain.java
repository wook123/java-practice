package ex5_pen;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();//1000��¥�� �Ϲ� �𳪹���
		Pen p2 = new Pen(10000,"gold");//10000��¥�� �ݻ� �𳪹���
		System.out.println(p1.brand);
		/*
		 * ���� ����
		 * �Ӿ��̴� �¾ �� 6���� �� ��ī�� ������ �ֽ��ϴ�.
		 * ��ī�� ���� "aya", "ye", "woo", "ma" �� ���� ������
		 * �ִ� �� ���� ����� ������(�̾����) �����ۿ� ���� ���մϴ�.
		 * ���ڿ� �迭 babbling�� �Ű������� �־��� ��, �Ӿ����� ��ī��
		 * ������ �� �ִ� �ܾ��� ������ return�ϵ��� solution �Լ��� �ϼ����ּ���.
		 * 
		 * ���ѻ���
		 * 1 <= babbling�� ���� <= 100
		 * 1 <= babbling�� ����[i] <= 15
		 * babbling �� �� ���ڿ����� "aya","ye","woo","ma"�� ���� �� ������ �����մϴ�
		 * ��, �� ���ڿ��� ������ ��� �κ� ���ڿ� �߿��� "aya","ye","woo","ma"�� �ѹ����� �����մϴ�.
		 * 
		 * ����� ��										���
		 * ["aya","yee","u","maa","wyeoo"]				1
		 * ["ayaye","uuuma","ye","yemawoo","ayaa"]		3  */
	}
}
