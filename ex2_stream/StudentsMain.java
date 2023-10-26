package ex2_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentsMain {
	public static void main(String[] args) {
		
		Student[] students = {
				new Student("�л�1",3,300),
				new Student("�л�2",1,200),
				new Student("�л�3",2,100),
				new Student("�л�4",2,150),
				new Student("�л�5",1,200),
				new Student("�л�6",1,290),
				new Student("�л�7",2,180),
				new Student("�л�8",3,100),
				new Student("�л�9",3,300)
				
		};
		Stream.of(students).sorted(Comparator.comparing(Student::getBan).thenComparing(Student::getTotalScore)).forEach(System.out::println);
		
		System.out.println();
		//map()
		//��Ʈ���� ��ҿ��� ����� �� �߿��� ���ϴ� �ʵ常 �̾Ƴ��ų� Ư�� ���·� ��ȯ�ؾ� �ϴ� ���
		//mapToDouble()
		//mapToInt()
		//mapToLong()
		
		//Student��Ʈ���� score��Ʈ������ ��ȯ�ϰ� ������ �ֿܼ� ����ϱ�
		Stream.of(students).mapToInt(x -> x.getTotalScore()).forEach(score -> System.out.println(score));
		
		System.out.println();
		
//		//�л����� ������ ������ ���ϴ� ��Ʈ�� �����ϰ� ����ϱ�
//		int total = Stream.of(students).mapToInt(x -> x.getTotalScore()).reduce(0,(x,y) -> x+y);
//		System.out.println(total);
//		
//		//�л����� ������ ��� ����
//		double avg = Stream.of(students).mapToInt(x -> x.getTotalScore()).average().getAsDouble();
//		System.out.println(avg);
		
		IntStream stream = Stream.of(students).mapToInt(Student::getTotalScore);
		IntSummaryStatistics stat = stream.summaryStatistics();
		System.out.println(stat);
	}	
		
}
