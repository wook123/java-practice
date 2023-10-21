package ex1_annotation;

import java.lang.annotation.Annotation;

@TestInfo(tester="ȫ�浿",datetime=@DateTime(date="20230310",time="170408"))//value�� ���ؼ� TestInfo�� value()�޼��忡 ������ ����ȴ�.
//value�� �������� ����� ���� {}�� ����ؾ� �Ѵ�.
//value= ������ �����ϴ�
public class Ex2_annotation {
	public static void main(String[] args) {
		//2. ��Ÿ ������̼�
		//- ������̼��� ����� ���� ������̼�
		//- ���������� ������̼����� ���� ������ �Ѵ�.
		//- java.lang.annotaion ��Ű���� ���ǵǾ� �ִ�.
		
		//@Target
		//@Documented
		//@Ingerited
		//@Retention
		//@Repeatable
//		Annotation[] annos = Ex2_annotation.class.getAnnotations();
//		for(Annotation anno : annos) {
//			System.out.println(anno);
//		}
		TestInfo testInfo = (TestInfo)Ex2_annotation.class.getAnnotation(TestInfo.class);
//		System.out.println(testinfo.value());
		String[] value = testInfo.value();
		for(String val : value) {
			System.out.println(val);
		}
		System.out.println();
		String[] tools = testInfo.testTool();
		for(String tool : tools) {
			System.out.println(tool+ " ");
		}
		System.out.println();
		String tester = testInfo.tester();
		System.out.println(tester);
		
		String date = testInfo.datetime().date();
		String time = testInfo.datetime().time();
		System.out.printf("date = %s, time = %s",date,time);
	}
	
}
