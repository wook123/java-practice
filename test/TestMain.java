package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestMain extends JFrame{
	public static void main(String[] args) {
		ImageIcon img1 = new ImageIcon("C:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\src\\image\\gimbob.jpg");
		JFrame f = new JFrame();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jp1.setLayout(null);
		jp1.setBounds(0, 0, 500, 350);
		jp1.setBackground(Color.gray);
		
		
		JButton btn = new JButton(img1);
		btn.setBounds(200, 50, 100, 67);
		JLabel jl1 = new JLabel("ÂüÄ¡±è¹ä");
		jl1.setBounds(200, 130, 100, 30);
		
		
		
		jp2.setLayout(null);
		jp2.setBounds(0, 350, 500, 350);
		jp2.setBackground(Color.YELLOW);
//		JLabel jl2 = new JLabel();
		JTextField jtf1 = new JTextField();
//		jl2.setText("111");
		jtf1.setText("");
		jtf1.setBounds(200, 150, 100, 30);
		
		
		btn.addActionListener(event -> {
			
			String str1 = new String();
			jtf1.setBounds(200, 150, 100, 30);
			jtf1.setText(jl1.getText());
		});
		
		jp1.add(btn);
		jp1.add(jl1);
		jp2.add(jtf1);
		
		f.getContentPane().add(jp2);
		f.getContentPane().add(jp1);
		f.setBackground(Color.white);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setBounds(0, 0, 500, 700);
	}
	
}
