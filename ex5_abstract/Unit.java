package ex5_abstract;

abstract public class Unit {
	String name;//�̸�
	int energy;//ü��
	
	public int getEnergy() {
		return energy;
	}
	
	//ĳ���Ͱ� ������ ������ �� ü�� ���ҷ��� ���ݴ��� �˼��� ����
	//���� ���� ��� ��� ������ ������ �𸣴ϱ�. �׷��� �߻�޼���� ����
	abstract public void decEnergy();
}
