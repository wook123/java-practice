package ex5_abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("�غ�", 50, false);
		t1.decEnergy();//�������� decEnergy()ȣ��
		System.out.println("t1�� ������ : " + t1.getEnergy());
		
		Protoss p1 = new Protoss("������", 150, false);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1�� ������ : " + p1.getEnergy());
		
		Zerg z1 = new Zerg("��������", 100, true);
		z1.decEnergy();
		System.out.println("z1�� ������ : " + z1.getEnergy());
		
	}
}
