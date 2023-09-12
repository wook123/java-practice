package ex2_bread;

public class Bread {
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println();
	}
	
	public void makeBread(int x) {
		for(int i = 0; i < x; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다\n",x);
		System.out.println();
	}
	public void makeBread(String name, int x) {
		for(int i = 0; i < x; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",name);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n",x,name);
		System.out.println();
	}
}
