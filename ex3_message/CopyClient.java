package ex3_message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;



public class CopyClient extends Thread {
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;
	
	
	public CopyClient(Socket s, ChatServer cs) {
		this.s = s;
		this.server = cs;
		
		try {
			out = new PrintWriter(s.getOutputStream(),true);
			in = new BufferedReader(new InputStream(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				if((msg.equals("xx:~X")){
					out.println("xx:~X");
					server.removeClient(this);
					break;
				}
				server.sendMessage(ip + " : " + msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
