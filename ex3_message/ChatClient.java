package ex3_message;

import java.awt.BorderLayout;

import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jdk.internal.org.jline.utils.InputStreamReader;

public class ChatClient extends JFrame implements Runnable{
	
	JTextArea area;
	JTextField input;
	JButton send_bt;
	JPanel south_p;
	
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;
	
	public ChatClient() {
		area = new JTextArea();
		this.add(area);
		
		south_p = new JPanel(new BorderLayout());
		south_p.add(input = new JTextField());
		south_p.add(send_bt = new JButton("������"),BorderLayout.EAST);
		
		this.add(south_p,BorderLayout.SOUTH);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				out.println("xx:~X");
			}
		});
		
		send_bt.addActionListener(new AdjustmentListener() {
			public void actionPerformed(ActionEvent e) {
				sendData();
			}
		});
		
		setBounds(100,100,400,500);
		setVisible(true);
		
		connected();//������ �������ִ� �޼���
		
		//�����κ��� ���޵Ǵ� �޼����� �����Ͽ� �޴� ������ ����
		t = new Thread(this);
		t.start();
	}
	
	public void connected() {
		try {
			s = new Socket("192.168.1.101",3200);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
	
	@Override
	public void run() {
		//�����κ��� ���޵Ǵ� �޼����� ��ٷȴٰ�
		//�޼����� �����ϸ� ȭ�鿡 ���
		while(true) {
			try {
				String msg = in.readLine();
				if(msg.equals("xx:~X")) {
					break;
				}
				if(msh != null) {
					area.append(msg+"\r\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//while
		closed();//�����ִ� ��Ʈ���� �ݴ� �޼���
		System.exit(0);//���α׷� ����!
	}//run
	
	public void sendData() {
		String msg = input.getText().trim();
		if(msg.length() > 0) {
			out.println(msg);
		}
		input.setText("");
	}//sendData()
	
	public void closed() {
		try {
			if(out != null) {
				out.close();
			}
			if(in != null) {
				in.close();
			}
			if(s != null) {
				s.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
