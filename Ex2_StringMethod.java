package ex1_String;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//�޼���
		//� �۾��� �����ϱ� ���� ��ɹ��� ����
		
		//Ŭ������ �����ִ� �޼���(�Լ�)�� ����ϴ� ���
		//Ŭ������ ��ü�� ���� ��ü.�Լ���()
		String str = "Hong Gil Dong";
		System.out.println("���ڿ� str�� ���� : " + str.length() );
		
		int index = str.indexOf('G');
		System.out.println("�� ó�� ���� G�� ��ġ : " + index);
		
		char c = str.charAt(5);
		System.out.println("������ ���� : " + c);
		
		System.out.println("���� ���ϴ� ���ڿ��� ġȯ : " + str.replace("Gil", "Mal"));
		
		System.out.println("�߶� ���ڿ� : " + str.substring(0,6));//(0��������,6����)
		
		String arr[] = str.split(" ");//���⸦ �������� ����
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %s\n",i,arr[i]);
		}
		
		// trim() : ���ڿ��� �յ� ������ �������ִ� ���
		System.out.println(str.trim());
		
		//StringŬ������ �����ִ� �޼���� �ƴ����� ������ �޼���
		//���ڿ��� �ۼ��� ���ڸ� ���� ������ �ٲ��ִ� �ڵ�
		
		String number = "1";
		System.out.println(Integer.parseInt(number));
		
		int number2 = 1;
		System.out.println(Integer.toString(number2) + 10);
	}
}
