package ex1_frame;

import javax.swing.JFrame;

public class Ex1_JFrame {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		//�������� ������ ��ġ�� ũ��
		jf.setLocation(300,300);//x,y
		jf.setSize(300,200);//�ʺ�,����
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
