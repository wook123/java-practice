package ex1_frame;

import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	public JFrameTest() {
		//위치와 크기
		super("제목");
		setBounds(300,300,300,200);
		setVisible(true);
	}
}
