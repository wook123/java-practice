package ex1_object;

public class ObjectMain {
	public static void main(String[] args) {
		
		Ex1_Object v1 = new Ex1_Object();
		v1.setValue("Test");
		//���ڰ� Object������ String�� Object��
		//��ӹ޾����Ƿ� ���ڷ� �����ϴ�.
		
		System.out.println(v1.getValue());
		
		//����(int)�� ���ڷ� �־��.
		Ex1_Object v2 = new Ex1_Object();
		v2.setValue(100);//AutoBoxing(�ڵ� ����ȯ : �⺻�ڷ��� > ��ü)
		
		//UnBoxing : ��ü > �⺻�ڷ���
		int i = (int)v2.getValue();
		System.out.println(i + 1);
	}
}
