package ex1_String;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
		//�Է¹��� ���ڿ��� �ҹ��� a�� � ����ִ����� �Ǻ��ϴ� �ڵ带 �ۼ��غ���
		
		//�Է� : asdfasdf
		//a�� ���� : 2
		
		
		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("���ڿ����� a�� ������ : " + count);
		
		//ȸ�� ���ϱ�
		//ȸ���̶� ������ �о �ڷ� �о �Ȱ��� ������ ������ �ǹ��մϴ�.
		//12121, �丶��, �ⷯ��, ���˺�, ������ ���
		//Ű���忡�� ���ڿ��� �Է¹��� �� ȸ������ �ƴ��� �Ǻ��ϴ� �ڵ带 ��������.
		System.out.println("���ڿ� �Է� : ");
		String str = sc.next();
		String str2 = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println(str+"�� ȸ���̴�");
		} else {
			System.out.println(str+"�� ȸ���� �ƴϴ�.");
		}
		
		
		
		}
	}

