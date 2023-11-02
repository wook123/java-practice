package ffff;

import java.util.ArrayList;

public class ex3_ArrayList {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		
		p1.setName("È«±æµ¿");
		p1.setAge(30);
		p1.setHeight(190.5);
		
		Person p2 = new Person();
		p2.setName("±è°³¶Ë");
		p2.setAge(40);
		p2.setHeight(155.6);
		
		list.add(p1);
		list.add(p2);
//		System.out.println(list.get(0).name);
		
		for(int i = 0; i<list.size(); i++) {
			Person vo = list.get(i);
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getHeight());
		}
	}
}
