package ex1_generic;

public class GenEx_main {
	public static void main(String[] args) {
		
		//T�� ���ϴ� Ŭ������ ��� ���ϴ� ������ ��ü�� ����
		GenEx<String> v1 = new GenEx<String>();//T�ڸ��� String�� �����Ѵ�
		v1.setValue("ȫ�浿");
		System.out.println(v1.getValue());
		
		//������ ������ GenEx��ü�� �����غ���!
		//���׸�Ÿ���� �⺻�ڷ����� �ν����� �ʽ��ϴ�.
		//���� �⺻�ڷ���(int,char,float,double)�� ���׸�Ÿ�Կ��� �̿��ϰ��� �� ����
		//Integer,Character,float,Double���� Ŭ������ �̿��ؾ� �Ѵ�.
		
		//GenEx<Integer> v2 = new GenEx<>();
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
	}
}
