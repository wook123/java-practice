package ex2_animal;

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("---�����---");
		System.out.println("�� : " + cat.getEye());
		System.out.println("�ٸ� : " + cat.getLeg());
		System.out.println("Ư¡ : " + cat.balance);
		
		Lion lion = new Lion();
		System.out.println("---����---");
		System.out.println("�� : " + lion.getEye());
		System.out.println("�ٸ� : " + lion.getLeg());
		System.out.println("Ư¡ : " + lion.galgi);
		
		Snake snake = new Snake();
		System.out.println("---��---");
		System.out.println("�� : " + snake.getEye());
		System.out.println("�ٸ� : " + snake.getLeg());
		System.out.println("Ư¡ : " + snake.sensor);
	}
}
