package ex1_inet;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index1");
			
			System.out.println("url.getAuthority() : " + url.getAuthority());
			//url.getAuthority : 호스트명과 포트를 문자열 형태로 반환
			System.out.println("url.getPort() : " + url.getPort());
			//url.getPort() : 포트번호를 정수형으로 반환
			System.out.println("url.getHost() : " +url.getHost());
			//url.getHost : 호스트명을 문자열로 반환
			System.out.println("url.getProtocol() : " + url.getProtocol());
			//url.getProtocol() : 프로토콜을 문자열 형태로 반환
			System.out.println("url.getQuery() : " + url.getQuery());
			//url.getQuery() : 쿼리를 문자열 형태로 반환
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
