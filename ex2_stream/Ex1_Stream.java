package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		//������ ����
		//- ���� ������ ����Ǳ� ������ �߰������� ������� �ʴ´�.
		//- �߰� ������ ȣ���ϴ� ���� �ܼ��� � �۾��� ����Ǿ�� �ϴ����� �������ִ� ��
		//- ���� ������ ����Ǿ�� ��Ʈ���� ��ҵ��� �߰� ������ ���� ����  ���꿡�� �Ҹ�ȴ�.
		
		
		Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> stream = Arrays.stream(nums);
		int sum = stream.reduce(0,(x,y) -> x+y);
		System.out.println(sum);
	}
}
