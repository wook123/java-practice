package ex1_generic;


public class GenEx<T> {
//�Ϲ����� �ڵ带 �ۼ��ϰ� �� �ڵ带 �پ��� Ÿ���� ��ü�� ���Ͽ� �����ϴ� ��ü ���� ����̴�,
// ��ü�� Ÿ���� �������� �� üũ�ϱ� ������ ��ü�� Ÿ�Կ� ���� �������� ���̰� ����ȯ�� �ϴ� ���ŷο���
// ���� �� �ִ�.
	
	//public class Ŭ������<T>{}
	//public interface �������̽���<T>{}
	//T�� Ÿ�Ժ������ �ϸ� Type�� ù���ڿ��� ���Դ�.
	//�ٸ� ���ڸ� ����ص� ũ�� ������ ����. T �̿ܿ��� E(Element),K(Key),V(Value)�� ���� ����Ѵ�.
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
}
