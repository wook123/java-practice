package ex2_function;

import java.util.function.Predicate;

public class Ex5_function {
	public static void main(String[] args) {
		//Consumer<T> �������̽� -> void accept(T t);
		//Function<T,R> �������̽� -> R apply(T t);
		//Predicate<T> �������̽� -> boolean Test(T,t);
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		
		Predicate<Integer> r = p.and(q);//�� ��
		System.out.println(r.test(101));
		
		Predicate<Integer> s = p.or(q);
		System.out.println(s.test(101));//�� ��
		
		Predicate<Integer> notP = p.negate();
		System.out.println("p.test(100) : " + p.test(100));
		System.out.println("notP.test(100) : " + notP.test(100));
		
	}
}
