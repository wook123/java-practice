package ex2_array;

import java.util.Scanner;

public class Ex1_multi_array {
	public static void main(String[] args) {
		//������ �迭
		//�������迭�̶� 2���� �̻��� �迭�� �ǹ��ϸ�,�迭�� ��ҷ� �迭�� ������ ���� �ǹ�
		//2���� �迭�� 1�����迭�� ��ҷ� ������ �ְ�, 3���� �迭�� 2���� �迭�� ��ҷ� ������ �ִ�
		
		//�ڷ���[][]�迭�� = new �ڷ���[1���� �迭�� ����][1���� �迭�� �����ִ� ����� ����];
		
//		int test[][] = new int[2][3];
//		
//		test[0][0] = 100;
//		test[0][1] = 200;
//		test[0][2] = 300;
//		
//		test[1][0] = 400;
//		test[1][1] = 500;
//		test[1][2] = 600;
		
//		System.out.println(test[0][0]);
		
//		for(int i = 0; i < test.length; i++) {
//			for(int j = 0; j < test[i].length; j++) {
//				System.out.print(test[i][j]);
//			}
//			System.out.println();
//		}
//		
//		
//		char[][] ch = {{'A','B'},{'C','D','E'},{'F'}}
//		
//		
//		//���� ����� ���� �����ص� �޳�.
//		int num[][] = new int[2][];
//		num[0] = new int [3];
//		num[1] = new int[2];
//		int n = 0;
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				System.out.println((num[i][j]= n+=100) + " ");
//			}
//			System.out.println();
//		}
		
		// 2���� �迭�� �ʱ�ȭ
//		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		//2���� �迭���ʹ� ū�濡 ����ִ� �������� ũ�Ⱑ �ٸ� �� �ִ�.
//		int [][] iArr = {{1,2}{3,4,5}{6}}
		
		// 2���� �迭�� ���� ���� ũ�⸦ ���� ������ ���� �ִ�.
		int num[][] = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		int n = 0;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j <num[i].length; j++) {
				System.out.print((num[i][j] = n += 100)+ " " );
			}
			System.out.println();
		}
		
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int total = 0;
		float avg = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		System.out.println("2�����迭�� ��� ����� �� �� : " + total);
		
		avg = (float)total/count;
		System.out.println(avg);
		
		
		//�л����� ���а� ������� ����ϴ� ���α׷��� �ִ�.
		//���α׷��� �����ϸ� �� ���� ������ ������ �������� �Է¹��� ��
		//�Է¹��� �� ��ŭ �л����� �̸��� ���м���, ������� �Է¹޴� ���α׷� �ۼ�
		
		//���� ����� �ο� �� : 2
		//�̸� : ȫ�浿
		//���� : 90
		//���� : 87
		
		//�̸� : ��浿
		//���� : 70
		//���� : 100
		
		//2�� ��� �Ϸ�
		//ȫ�浿 90 70
		//��浿 70 100
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �ο��� : ");
		int n1 = sc.nextInt();
		String str[][] = new String[n1][3];
		
		for(int i = 0; i <str.length; i++) {
			System.out.print("�̸� : ");
			str[i][0] =sc.next();
			
			System.out.print("���� : ");
			str[i][1] =sc.next();
			
			System.out.print("���� : ");
			str[i][2] =sc.next();
			
			System.out.println("-----------------");
		}
		
		System.out.println(str.length + "�� ��� �Ϸ�!!");
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j <str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
