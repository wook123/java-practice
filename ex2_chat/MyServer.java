package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import jdk.internal.org.jline.utils.InputStreamReader;

public class MyServer extends Thread{
	//http��Ű� sockey����� ������
	//�ܹ��� ����� http��� : http����� client�� ��û�� ���� ���� ������ �����Ͽ� �ش� ������ �����ϰ�
	//��ٷ� ������ �����ϴ� ����Դϴ�.
	//client�� ��û�� ������ ��쿡�� Server�� �����ϴ� �ܹ��� ������� �ݴ�� Server�� Client���� ��û�� ���� ���� �����ϴ�.
	
	//����� ��ž� Socket��� : Server�� Client�� Ư�� port�� ���� �ǽð����� ����� ����� �ϴ� ����Դϴ�.
	//http��Ű��� �ٸ��� server�� client�� port�� ���� ����Ǿ� �־ �ǽð����� �瓇�� ����� �� �� �ֽ��ϴ�.
	//Streaming�̳� �ǽð� ä��,���� ��� ���� �ﰢ������ ������ �ְ�޴� ��쿡 ���˳���.
	
	//Socket����� ��Ģ
	//1. ���� ��ٸ��� ���� Server��� �ϸ�,Server������ port�� ���� Client�� ������ ��ٸ��ϴ�.
	//2. �׸��� ������ �ϴ� ���� Client��� �ϸ� ,Server�� IP�� Port�� �����Ͽ� ����� ����˴ϴ�.
	//3. Server�� Client ���� ����� Send,Receive�� ���·� �ְ�޽��ϴ�.
	//4. �׸��� ����� ������ close()�� ������ �����ϴ�.
	
	ServerSocket ss;
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("���� ����!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyServer().start();
	}
	@Override
	public void run() {
		//thread�� �ؾ��� ��
		//(�����ڸ� �ް�, ���ڿ��� �޾Ƴ���.)
		while(true) {
			try {
				Socket s = ss.accept();
				
				BufferedReader reader = new BufferedReader(
							new java.io.InputStreamReader(s.getInputStream()));
				String msg = reader.readLine();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + msg);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//while
	}//run
	
	
}
