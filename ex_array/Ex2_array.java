package ex_array;

public class Ex2_array {
	public static void main(String[] args) {
		int[] iArr = new int[4];
		
		for(int i = 0; i < 4; i++) {
			iArr[i] = (i+1)*100;
			System.out.println(iArr[i]);
		}
		
		char[] ch;
		ch = new char[4];
		//char[] ch = new char[4]
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//�迭 ���� ���
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("--------------------------");
		//������ �迭�� Ư¡
		System.out.println(ch);//������ �迭�� �迭�� �̸������ε� ��ü ������ ����� �� �ִ�.
		System.out.println(str);//���ڿ� �迭�� �̻��ϰ� ���´�.
		
		
		
		
	}
}
