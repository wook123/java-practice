package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4_Stream {
	public static void main(String[] args) {
		//스트림의 최종연산
		//최종연산은 스트림의 요소를 소모하기 때문에 결과를
		//최종 연산 후에 스트림이 닫히게 되고 더 이상 사용할 수 없다.
		
		//forEach()
		//반환타입이 void이므로 스트림의 요소를 출력하는 용도로 사용된다.
		
		//조건검사
		//allMatch() : 지정된 조건에 모든 요소가 일치하면 true
		//anyMaych() : 지정된 조건에 일부요소가 일치하면 true
 		//noneMatch() : 지정된 조건에 일치하는 첫 번째 요소를 반환
		//findFirst() : 지정된 조건이 일치하는 첫 번째 요소를 반환
		//findAny() : 지정된 조건이 일치하는 첫 번째 요소를 반환
		
		int[] intArr = {2,4,6};
		boolean result = Arrays.stream(intArr).allMatch(x -> x % 2 == 0);
		System.out.println("2의 배수 ? : " + result);
		result = Arrays.stream(intArr).anyMatch(x -> x % 3 == 0);
		System.out.println("3의 배수가 하나라도 있나 : " + result);
		result = Arrays.stream(intArr).noneMatch(x -> x % 3 == 0);
		System.out.println("3의 배수가 하나도 없나 : " + result);
		
		Stream.of("one","two","three")
				.filter(x -> x.length() > 4)
				.findFirst()
				.ifPresent(System.out::println);
	}
}
