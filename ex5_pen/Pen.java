package ex5_pen;

public class Pen {
	int price;
	String brand = "monami";
	String color;
	
	//파라미터의 자료형이나, 개수가 달라야 오류가 나지 않는다.
	//일반 메서드 오버로드와 규칙이 동일하다.
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
