package ex1_object;
	
public class Ex1_Object {
	//���� Ŭ������ Ư�� �޼��尡 �ֽ��ϴ�.
	//����� String�� ���ڷ� �ް� ����� int���� ���ڷ� �޴´�.
	//�̷��� ��Ȳ�� ���� �ٸ� ���� ���� �޾ƾ� �Ѵٸ�.
	//Ŭ���� ������ ��� �����ؾ� �ұ�
	//1. �����ε�
	//�����ε��� �ϴ� ����� ������ Object�� ���� ����� �ִ�.
	
	Object value;//�ڹ��� �ֻ��� ��ü�� Object������ ���� ����
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
}
