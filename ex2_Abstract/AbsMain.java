package ex2_Abstract;

public class AbsMain {
	public static void main(String[] args) {
		
//		AbsParent ap = new AbsParent(); 
		
		AbsChild ac= new AbsChild();
		ac.setValue(1);
		
		//�߻�Ŭ������ ��ӹ޾ұ� ������ �߻�Ŭ������ �ִ� �Ϲݸ޼��嵵 �������� ����� �� �ִ�.
		System.out.println(ac.getValue());
	}
}
