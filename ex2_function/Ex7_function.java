package ex2_function;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex7_function {
	public static void main(String[] args) {
		//�޼����� ����
		//���ٽ��� ���� �����ϰ� ǥ���� �� �ִ�.
		//���ٽ��� �ϳ��� �޼��常 ȣ���ϴ� ��쿡�� �޼�������(method reference)���
		//������� ���ٽ��� �����ϰ� �� �� �ִ�.
		//�ϳ��� �޼��常 ȣ���ϴ� ���ٽ��� 
		//Ŭ���� �̸� :: �޼��� �̸� 
		//�������� :: �޼����̸�
		//���� �ٲ� �� �ִ�.
		//����Ÿ�� : �⺻�ڷ����� �����ϰ� �迭,������,Ŭ����,�������̽����� ���Ѵ�.
		//����Ÿ���� �������� ��ü�� �ּҰ� ����ȴ�.
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f2 = Integer::parseInt;//�޼��� ����
		
		//�̹� ������ ��ü�� �޼��带 ���ٽĿ��� ����� ��쿡�� Ŭ���� �̸� ��� �� ��ü�� �̸��� �����ָ� �ȴ�.
//		MyClass obj = new MyClass();
//		Function<String, Boolean> f = (x) -> obj.equals(x);//���ٽ�
//		Function<String, Boolean> f = obj::equals;
		
//		int[] nums = createArray(10, x -> new int[x]);
		int[] nums = createArray(10, int[]::new);
		
//		Object obj = getObject(() -> new Object());
		Object obj = getObject(Object::new);
		
		
		
	}
	public static int[] createArray(int x, Function<Integer, int[] > function) {
		return function.apply(x);
	}
	
	public static Object getObject(Supplier<Object> supplier) {
		return supplier.get();
	}
}
