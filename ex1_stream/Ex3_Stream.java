package ex1_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Ex3_Stream {
	public static void main(String[] args) {
		//스트림의 연산
		//- 중간연산
		// - 연산의 결과가 Stream인 연산 ,스트림에 연속해서 중간 연산을 할 수 있다.
		//- 최종연산
		// - 연산의 결과가 Stream이 아닌 연산, 스트림의 요소를 소모하므로 단 한번만 가능
		
		int[] nums = {1,44,33,21,35,67,99,4,5,6,1,1,1,2,2,2};
		
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(System.out::println);
		
		System.out.println();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("깁자가");
		list.add("람다식");
		list.add("박병렬");
		list.add("신용권");
		
//		Collections.sort(list);//정렬
		System.out.println(list);
		
		//Collectors란 "stream을 일반적인 List,Set등으로 변경시켜주는 Stream메서드
		//toCollection()을 이용하여 좀 더 특정한 컬렉션으로 구현이 가능하다.
		ArrayList<String> list1 = list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list1);
	}
}
