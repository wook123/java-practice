package ex2_Abstract;

abstract public class AbsParent {
	//�߻� �޼��尡 �� �� �̻� ���ǵǾ� �ִ� Ŭ������ �߻� Ŭ������� �ϴµ�
	//�߻�Ʋ���� ���� abstract�� ���� �ڽ��� �߻�Ŭ���� ��°� �������� �Ѵ�
	//abstract ���������� class Ŭ������{}
	int value = 100;
	
	public int getValue() {//�Ϲ����� �޼���
		return value;
	}
	
	//�߻�޼���
	//�߻�޼����� ���� : ���������� abstract ��ȯ�� �޼����();
	
	//�ϼ��� �ܰ谡 �ƴ� �̿ϼ��� �������� �ΰ�, ���߿� Ÿ Ŭ���� ������ �������Ͽ� ����� �� �ֵ��� ����� ��.
	abstract public void setValue(int n);
	
}
