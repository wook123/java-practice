package memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�޸���");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayout(null);//������ġ
		
		//
		JTextField tf = new JTextField();
		tf.setBounds(7,15,180,30);
		
		JButton btn_input = new JButton("Ȯ��");
		btn_input.setBounds(190,15,60,30);
		btn_input.setEnabled(false);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(7,50,243,200);
		ta.setEditable(false);
		
		JButton btnSave = new JButton("����");
		JButton btnClose = new JButton("����");
		
		btnSave.setBounds(7, 260, 110, 30);
		btnClose.setBounds(140, 260, 110, 30);
		
		//�����ӿ� ��� ������
		frame.add(tf);
		frame.add(btn_input);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(tf.getText().length() == 0) {
					//tf�� �ƹ��͵� �������� ������ ��ư ��Ȱ��ȭ
					btn_input.setEnabled(false);
				} else {
					btn_input.setEnabled(true);					
				}
			}
		});
		
		//Ȯ�ι�ư Ŭ���� tf�� ���� ta�� �����ؼ� �־��ֱ�
		btn_input.addActionListener(new InputButtonAdapter(ta,tf,btn_input));
		
		//btnSave�� ������ �� ta�� �ִ� ���� �޸������� �����ϴ� ��� �����ϱ�.
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta�� ���ִ� ������ �����;� �Ѵ�.
				String msg = ta.getText();
				
				FileDialog fd = new FileDialog(frame,"����",FileDialog.SAVE);
				fd.setVisible(true);
				
				//fd�� ���� ������ �����ο� ���ϸ��� �˾Ƴ���
				String path = fd.getDirectory()+fd.getFile()+".txt";
				//System.out.println(path);
				
				//char����� ��Ʈ���� �����Ͽ� path��ο� ����
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(msg);
					fw.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		//btnClose�� ������ �� ���α׷� ����
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();//������ ����
			}
		});
		
		
		
		frame.setBounds(700,200,270,345);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
