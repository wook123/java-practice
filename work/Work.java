package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		//�Ʒ��� ����� �����ϼ���
		
		//���̵� ����: abc
		//abc
		
		//���̵� ���� : abc2
		//abc abc2
		
		//���̵� ���� : abc3
		//abc abc2 abc3
		
		//���̵� ���� : ...
		//...
		
		//�ߺ��� ���̵� �˻��ϴ� ���� �߰��ϱ�
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		w:while(true) {
			System.out.print("���̵� ���� : ");
			String id = sc.next();
			
			//id�ߺ�üũ
//			for(int i = 0; i < list.size(); i++) {
//				if(id.equals(list.get(i))) {
//					System.out.println("�ߺ��� id");
//					continue w;
//				}
//			}
			if(list.contains(id)) {
				System.out.println("�ߺ��� id");
				continue;
			}
			
			list.add(id);
			
			for(String str : list) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		
	}
}
