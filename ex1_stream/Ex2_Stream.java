package ex1_stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("���ٽ�");
		
//		for(String str : set) {
//			System.out.print(str+ " ");
//		}
		
		//Stream�� �̿��� ��� �ݺ�ó��
		Stream<String> stream = set.stream();
		set.forEach(System.out::println);
		
		//Stream�� Iterator�� ����� �ݺ���������, ������ ���� �������� ���� �ִ�.
		//1) ���� �ݺ����̹Ƿ� ó�� �ӵ��� ������, ����ó���� ȿ�����̴�.
		//2) ���ٽ����� �پ��� ��� ó���� ������ �� �ִ�.
		//3) �߰� ó���� ���� ó���� �����ϵ��� ������������ ������ �� �ִ�.
		
		ArrayList<String> list = new ArrayList<String>();		
		list.add("ȫ�浿");
		list.add("���ڹ�");
		list.add("���ٽ�");
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
	
		
	}
}
