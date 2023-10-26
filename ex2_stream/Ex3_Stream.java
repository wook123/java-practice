package ex2_stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3_Stream {
	public static void main(String[] args) {
		//��Ʈ���� ��� �ɷ�����
		//distinct() -> ��Ʈ������ �ߺ��Ǵ� ��� �����ϱ�
		//filter() -> �־��� ����(predicate)�� ���� �ʴ� ��Ҹ� �ɷ�����.
		
		IntStream intStream = IntStream.rangeClosed(1,10);
		intStream.filter(i -> i % 2 == 0).forEach(System.out::println);
		
		Stream
		.of("ab","a","abc","abcd","abcdef","abcdefg").filter(i -> i.length() > 2).forEach(System.out::println);
	}
}
