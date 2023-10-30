package ex2_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s = null;
			
			try {
				s = new Socket("192.168.15.1",3001);
				
				//���ڿ��� ������ ������ ���� ��Ʈ�� �غ�
				PrintWriter out = new PrintWriter(s.getOutputStream());
				//������ ���ڿ� ����
				out.write(msg);
				
				//��Ʈ���� ������ ���� ����
				out.flush();
				
				if(out != null) {
					out.close();
				}
						
						
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(s != null) {
					try {
						s.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
