package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		//��ü �����ϴ¹�
		//Ŭ������ ��ü�� = new Ŭ������();
		
		Computer com1 = new Computer();
		
		//�ٸ� Ŭ������ �ִ� ������ ������ �����ͼ� Ȯ���ϴ� ��
		//��ü��.������;
		com1.ssd = 2048;
		com1.getInfo();
		
		
		System.out.println();
		
		Computer com2 = new Computer();
		com2.getInfo();
		
		
	}
}
