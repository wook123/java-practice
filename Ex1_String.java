package ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//�ڹٷ� ������� ��� ���α׷��� Ŭ������ �̷���� �ֽ��ϴ�.
		//�츮�� ���ڿ��� �����ϱ����� ����ߴ� String�� java.lang��Ű����
		//������ �Ǿ��ִ� Ŭ���� �����̴�.
		
		
		//Ŭ������ �������: ������ �Լ�
		
		//StringŬ������ �ΰ��� Ư¡�� ������ �ִ�.
		//1) ��ü �������� �ΰ���(�Ͻ���,�����)
		//2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)
		
		// �ٸ� ��� Ŭ�������� new�� ����Ͽ� ����� ��ü ������ �ؾ� �Ѵ�.
		String s1 = "abc";//�Ͻ��� ��ü ���� (s1,s2�� ���� ������ ���� �ּҸ� ����Ѵ�)
		String s2 = "abc";
		
		//Ŭ������ ��ü�� = new Ŭ������();(��Ʈ�� ���� ��� Ŭ����)
		String s3 = new String("abc");//����� ��ü ����(���� ���Ƶ� ���� �ٸ� �ּҸ� ����Ѵ�)
		String s4 = new String("abc");	
		//== �����ڴ� �⺻�ڷ����� ���� ���� ���� ���Ѵ�.
		//��ü���� �񱳸� �� ���� �ּҸ� ���ϴ� �����ڷ� ����� �ٲ��.
		if(s1.equals(s3)) {
			System.out.println("���� ����");
			
		} else {
			System.out.println("���� �ٸ�");
		}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ� : ");
//		String s5 = sc.next();
		
		System.out.println("------------------");
		
		String greet = "�ȳ�";
		greet +="�ϼ���";
		System.out.println(greet);
		//�ϼ��䰡 �ٴ� ���� �ȳ� �ڿ� �ٴ°� �ƴ�
		//�ȳ��ϼ��� ��� �ϴ� �޸𸮸� ���Ӱ� �״� �޴´�.
		//�����ִ� �ȳ� �޸� jvm�� GC�� Heap ������ ���� �ֿ�����.
		
	}//main
}
