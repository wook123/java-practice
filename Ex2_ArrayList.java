package ffff;

import java.util.*;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(10);//0
		list.add(10);//3
		list.add(1, 14);//2
		list.add(1, 14);//1 //기존 index의 값은 오른쪽으로 한칸 밀리게 된다.
		list.set(2, 30);//index 2번의 값을 30으로 수정
		
		//ArrayList에 요소 제거하기
		list.remove(1);// index 1번에 있는 요소 제거하기
		
		//ArrayList에 요소의 index값 알아내기
		//System.out.println(list.indexOf(10));
		
		//ArrayList에 요소가 포함되어있는지 확인
		list.contains(30);
		
		//ArrayList 비우기
		list.removeAll(list);
		
		list.clear();
		
		//ArrayList가 비어있는지 확인
		list.isEmpty();//비워져 있으면 true, 비워져있지 않으면 false를 반환
		
		System.out.println(list);
	}
}
