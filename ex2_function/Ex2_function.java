package ex2_function;

import java.util.HashMap;

public class Ex2_function {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id1", "�̸�1");
		map.put("id2", "�̸�2");
		map.put("id3", "�̸�3");
		map.put("id4", "�̸�4");
		map.put("id5", "�̸�5");
		
		//BiFunction -> R apply( T t, U u)
		//compute : Map�� value���� ������Ʈ�� �� ���
//		map.compute("id1", (k,v) -> {return v + "**";});
//		
//		System.out.println("map,get(\"id1\") : " +map.get("id"));
		
//		map.forEach((key,value) ->{
//			map.compute(key,(k,v) -> v +"**");
//			});
		//mpa�� ��� ��Ҹ� ���ٽ����� ����ϱ�
		map.forEach((k,v) -> 
		System.out.printf("key = %s, value = %s\n",k,v));
	}
}
