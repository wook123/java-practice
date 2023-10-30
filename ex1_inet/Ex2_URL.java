package ex1_inet;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index1");
			
			System.out.println("url.getAuthority() : " + url.getAuthority());
			//url.getAuthority : ȣ��Ʈ��� ��Ʈ�� ���ڿ� ���·� ��ȯ
			System.out.println("url.getPort() : " + url.getPort());
			//url.getPort() : ��Ʈ��ȣ�� ���������� ��ȯ
			System.out.println("url.getHost() : " +url.getHost());
			//url.getHost : ȣ��Ʈ���� ���ڿ��� ��ȯ
			System.out.println("url.getProtocol() : " + url.getProtocol());
			//url.getProtocol() : ���������� ���ڿ� ���·� ��ȯ
			System.out.println("url.getQuery() : " + url.getQuery());
			//url.getQuery() : ������ ���ڿ� ���·� ��ȯ
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
