package ex2_function;

import java.util.ArrayList;

public class Ex1_function {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		//����Ʈ �ȿ� ���Ҵ� ��Ҹ� ������ �� 
//		list.remove();
		list.removeIf(t -> t % 2 == 0);
		System.out.println(list);
	}
}
