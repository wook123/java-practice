package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		//������ ���̵�� �н����带 ������ UserInfo Ŭ������ �����
		//MainŬ�������� ������ ������ ArrayList�� �߰��Ͽ� ����غ���
		
		//������ ������� ���̵� ���� ��� "���̵� �ߺ��˴ϴ�."���
		//����ϰ� ó������ ���ư���
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		Scanner sc = new Scanner(System.in);
		
		w:while(true) {
			UserInfo ui = new UserInfo();//while�� �� ������ ���ο� UserInfo��ü ����
			System.out.print("���̵� ���� : ");
			ui.setId(sc.next());
			
			for(int i = 0; i < list.size(); i++) {
				if(ui.getId().equals(list.get(i).getId())) {
					System.out.println("���̵� �ߺ��˴ϴ�.");
					continue w;
				}
			}
			
			System.out.print("��й�ȣ ���� : ");
			ui.setPw(sc.nextInt());
			
			list.add(ui);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getId());
				System.out.println(list.get(i).getPw());
				System.out.println("-------------------");
			}
		}
		
	}
}
