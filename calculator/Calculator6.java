package calculator;

import java.util.ArrayList;

public class Calculator6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�̸�1");
		list.add("�̸�2");
		list.add("�̸�3");
		list.add("�̸�4");
		list.add("�̸�5");
		list.add("�̸�6");
		
		//�Ϲ����� ���
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		
		//���� for��
		for(String name : list) {
			System.out.print(name + ",");
		}
		System.out.println();
		
		//forEach()����Ͽ� �⏋�ϰ�
		list.forEach(y -> System.out.print(y + ","));
		
		
		System.out.println();
		list.forEach(System.out::println);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list.forEach(System.out::println);
	}
}
