package ex3_calcurator;

public class CalMain {
	public static void main(String[] args) {
		//CalculatorŬ������ �����
		//getResult()�޼��带 �����ϼ���. ��ȯ���� ����
		//�ĸ����� �ΰ��� (n1, n2)�� �ް� -1�� return �ϰ� ����ϴ�
		
		//CalPlusŬ������ ����� calculatorŬ������ ��ӹ�������.
		//�������̵带 �̿��Ͽ� Calculator�� getResult()�޼��带
		//���ڷ� ���� n1�� n2�� �����ִ� �Լ��� ����ϴ�.
		//���� �̶� return���� -1 �̾�� �ȵ˴ϴ�.
		
		//CalMinusŬ������ ����� CalculatorŬ������ ��ӹ�������
		//�������̵带 �̿��Ͽ� Calculator�� getResult()�޼��带
		//���ڷ� ���� n1�� n2�� ���ִ� �Լ��� ����ϴ�.
		
		//Main���� �����Ͽ� �Ʒ��� ���� ����� ������ ����
		//CalPlus : 30
		//CalMinus : 15
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(15, 15));
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(30, 15));
	}
}
