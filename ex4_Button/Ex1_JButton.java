package ex4_Button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1_JButton {
	public static void main(String[] args) {
		
		JButton jb1,jb2,jb3;
		JFrame f = new JFrame();
		
		f.setLayout(new FlowLayout());
		
		//JButton : 클릭기능을 제공하는 요소
		
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		
		//프레임에 요소 붙히기
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		
		//이벤트와 이벤트 처리
		//이벤트는 사용자의 입력 혹은 키보드나 마우스의 클릭으로 발생하는 모든 사건
		//자바에서는 메서드로 구현되어, 이벤트의 동작에 응답하는 방식으로 처리가 됩니다.
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 눌릴때 마다 호출 되는 메서드
				// getActionCommand() : 버튼에 쓰여있는 문자열을 읽어온다.
				switch(e.getActionCommand()) {
				case "1":
					System.out.println("1번 버튼누름");
					break;
				case "2":
					System.out.println("2번 버튼누름");
					break;
				case "3":
					System.out.println("3번 버튼누름");
					break;
					
				}
				
			}
		};
		//버튼에 기능 붙히기
		jb1.addActionListener(al);
		jb2.addActionListener(al);
		jb3.addActionListener(al);
		
		//위치와크기
		f.setBounds(400,400,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
