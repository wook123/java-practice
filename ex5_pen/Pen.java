package ex5_pen;

public class Pen {
	int price;
	String brand = "monami";
	String color;
	
	//�Ķ������ �ڷ����̳�, ������ �޶�� ������ ���� �ʴ´�.
	//�Ϲ� �޼��� �����ε�� ��Ģ�� �����ϴ�.
	public Pen() {
		price = 1000;
		brand = "monami";
		color = "white";
	}
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
	public Pen(String color,int price) {
		this.color = color;
		this.price = price;
	}
}
