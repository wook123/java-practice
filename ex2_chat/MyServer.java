package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import jdk.internal.org.jline.utils.InputStreamReader;

public class MyServer extends Thread{
	//http통신과 sockey통신의 차이점
	//단방향 통신인 http통신 : http통신은 client의 요청이 있을 떄만 서버가 응답하여 해당 정보를 전송하고
	//곧바로 연결을 종료하는 방식입니다.
	//client가 요청을 보내는 경우에만 Server가 응답하는 단방향 통신으로 반대로 Server가 Client에게 요청을 보낼 수는 없습니다.
	
	//양방향 통신안 Socket통신 : Server와 Client가 특성 port를 통해 실시간으로 양방향 통신을 하는 방식입니다.
	//http통신과는 다르게 server와 client가 port를 통해 연결되어 있어서 실시간으로 양뱡항 통신을 할 수 있습니다.
	//Streaming이나 실시간 채팅,게임 등과 같이 즉각적으로 정보를 주고받는 경우에 사용됩나디.
	
	//Socket통신의 규칙
	//1. 먼저 기다리는 측을 Server라고 하며,Server에서는 port를 열고 Client의 정속을 기다립니다.
	//2. 그리고 접속을 하는 측을 Client라고 하며 ,Server의 IP와 Port에 접속하여 통신이 연결됩니다.
	//3. Server와 Client 간의 통신은 Send,Receive의 형태로 주고받습니다.
	//4. 그리고 통신이 끝나면 close()로 접속을 끊습니다.
	
	ServerSocket ss;
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 시작!");
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
		//thread가 해야할 일
		//(접속자를 받고, 문자열을 받아낸다.)
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
