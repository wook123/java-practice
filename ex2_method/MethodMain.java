package ex2_method;
public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int sum = mt.f(3);
		System.out.println(sum);
		
		int number = mt.f2(10,7);
		System.out.println(number);
		
//		int sum1 = mt.f3(0);
//		for(int i = 1; i <= 10; i++) {
//			sum1 += i;
//		}
//		System.out.println(sum1);
		mt.f5(1);
	}
}
