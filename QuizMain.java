package ffff;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();//run()�޼��带 ȣ���ϴ� �޼���
		qt.startGame();
	}
}
