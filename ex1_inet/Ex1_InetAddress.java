package ex1_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1_InetAddress {
	public static void main(String[] args) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());//도메인을 반환
			System.out.println("getHostaddress() : " + ip.getHostAddress());//도메인의 ip주소를 문자열 형태로 반환
			
			byte[] ipaddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipaddr));
			
			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
			//getAllByName(도메인) : 도메인이 운영하는 모든 서버(ip)주소를
			//배열에 담아 반환
			
			for(int i = 0; i < iparr.length; i++) {
				System.out.printf("iparr[%d] : %s",i,iparr[i]);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
	}
}
