package ex_array;

import java.util.Random;
import java.util.Scanner;

public class Ex3_array {
	public static void main(String[] args) {
		/*
		 * �迭 arr�� ����ִ� ��� ����� ���� ���� ����ϼ���
		 * ��� : 150
		 * 
		 */
		
//		int [] arr = {10,20,30,40,50};
//		
//		int arrtotal = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//		System.out.println(artotal);
		
//		int arrtotal = 0;
//		for(int i = 0; i < arr.length; i++) {
//			arrtotal += arr[i];
//		}
//		System.out.println("��� : " + arrtotal);
		
		//���α׷��� ����Ǹ� �迭�� ���̸� ������ �� ������ Ű���忡�� �Է¹޴´�.
		//�Է¹��� ���̸�ŭ ���ĺ��� ������� ����غ���.
		
		//ex) �迭�� ���̸� ������? : 5
		//��� : ABCDE
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("�迭�� ���̸� �Է��� �ּ��� : ");
//		int n = sc.nextInt();
//		
//		char ch[] = new char[n];
//		char c = 'A';
//		
//		for(int i = 0; i < ch.length; i++) {
//			ch[i] = c++;
//			System.out.print(ch[i]);
//			
//			
//			
//			
//		}
//		
//		System.out.println("----------------------");
//		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�
		//�� 1���ڸ� ���ڴ� �ݵ�� 0�� �ǵ��� �����.
		
		//�߻��� ���� money�� �������� �ٲٸ� �� ������ ��� �ʿ�����
		//�������� ���� ���� ������ ����ϴ� �ڵ带 �ۼ�
		
//		int money = new Random().nextInt(500)+1;
//		int m = money*10;
//		System.out.println("�ݾ� : " + m);
//		int [] coin = {500,100,50,10};
//		for(int i = 0; i < coin.length; i++) {
//			int res = money / coin[i];
//			System.out.println(coin[i] + "�� : " + res);
//			money %= coin[i];
//		}
		
		//1~45�� ������ �߻����� �ζǹ�ȣ�� �����ϴ� ���α׷� �����
		
		//�ζǹ�ȣ�� ���� 6���� ���� ���� ������ �迭 ����
		int[] lotto = new int[6];
		w: for(int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue w;
				}
			}
			System.out.printf("lotto[%d] : %d\n",i,lotto[i]);
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
