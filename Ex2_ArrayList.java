package ffff;

import java.util.*;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(10);//0
		list.add(10);//3
		list.add(1, 14);//2
		list.add(1, 14);//1 //���� index�� ���� ���������� ��ĭ �и��� �ȴ�.
		list.set(2, 30);//index 2���� ���� 30���� ����
		
		//ArrayList�� ��� �����ϱ�
		list.remove(1);// index 1���� �ִ� ��� �����ϱ�
		
		//ArrayList�� ����� index�� �˾Ƴ���
		//System.out.println(list.indexOf(10));
		
		//ArrayList�� ��Ұ� ���ԵǾ��ִ��� Ȯ��
		list.contains(30);
		
		//ArrayList ����
		list.removeAll(list);
		
		list.clear();
		
		//ArrayList�� ����ִ��� Ȯ��
		list.isEmpty();//����� ������ true, ��������� ������ false�� ��ȯ
		
		System.out.println(list);
	}
}
