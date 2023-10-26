package ex1_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Ex3_Stream {
	public static void main(String[] args) {
		//��Ʈ���� ����
		//- �߰�����
		// - ������ ����� Stream�� ���� ,��Ʈ���� �����ؼ� �߰� ������ �� �� �ִ�.
		//- ��������
		// - ������ ����� Stream�� �ƴ� ����, ��Ʈ���� ��Ҹ� �Ҹ��ϹǷ� �� �ѹ��� ����
		
		int[] nums = {1,44,33,21,35,67,99,4,5,6,1,1,1,2,2,2};
		
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(System.out::println);
		
		System.out.println();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("���ڰ�");
		list.add("���ٽ�");
		list.add("�ں���");
		list.add("�ſ��");
		
//		Collections.sort(list);//����
		System.out.println(list);
		
		//Collectors�� "stream�� �Ϲ����� List,Set������ ��������ִ� Stream�޼���
		//toCollection()�� �̿��Ͽ� �� �� Ư���� �÷������� ������ �����ϴ�.
		ArrayList<String> list1 = list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list1);
	}
}
