package ex4_super;

public class Child extends Parent{
	//super : �θ�Ŭ������ �̸�
	public Child() {
		super(1);//Parent(); �θ�Ŭ������ ������ ȣ��
		System.out.println("�ڽ�(Child)Ŭ����");
	}
	@Override
	public int result() {
		// TODO Auto-generated method stub
		return super.result();
	}
}
