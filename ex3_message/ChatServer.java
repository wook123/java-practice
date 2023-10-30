package ex3_message;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{
	ServerSocket ss;
	
	ArrayList<CopyClient> list;//���纻 Ŭ���̾�Ʈ�� ���� ����Ʈ �غ�
	
	public ChatServer() {
		try {
			list = new ArrayList<CopyClient>();
			
			ss = new ServerSocket(3200);
			System.out.println("��������!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ChatServer().start();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ����");
				
				CopyClient cc = new CopyClient(s, this);
				list,add(cc);
				cc.start();//Ŭ���̾�Ʈ�� ���纻 ������ ����
				//�̷��� �ؾ� CopyClient�� �����忡�� 
				//inputStream�� ���� Ŭ���̾�Ʈ�κ��� �Ѿ�� ����
				//ó���� �� �ִ�.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//run
	
	public void sendMessage(String msg) {
		//�����ڵ�	�� CopyClient���·� ��������� ArrayList��
		//����� �����̴�.
		try {
			for(CopyClient cc : list) {
				cc.out.println(msg);//������ �����ڵ鿡�� �޼����� ����
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void removeClient(CopyClient cc) {
		list.remove(cc);//���ڷ� ���޵� CopyClient��ü�� ArrayList
		sendMeesage("----" + cc.ip+ "�� ����----");
	}
	
	
	
}
