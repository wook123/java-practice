package ex3_generic;

public class Gen {
	//���׸� �޼���
	//�޼����� ����ο��� ���׸�Ÿ���� ����� �޼��带 ���׸� �޼����� �մϴ�.
	//���� ��ġ�� ��ȯ�� �ٷ� ���Դϴ�.
	
	// public <T> void �޼����(Ŭ������<T> ��ü��) {
	//
	// }
	
	//���׸�Ÿ��<T>�� ���� printArr�޼��带 �����Ѵ�.
	//printArr�޼��� ���ο��� �迭�� ���������� ������ �� �ְ� �ϴ� �ڵ带 �ۼ�
	
	//GenMainŬ������ ����� Integer[],Double[],Character[]�� ���� ���� ��
	//GenŬ������ printArr�޼��带 ȣ���Ͽ� �迭�� ������ ����ϵ��� ����.
	
	//���
	//1 2 3 4 5
	//1.1 2.2 3.3 4.4 5.5
	//A B C D E
	
	public <T>void printArr(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
