package ex1_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1_InetAddress {
	public static void main(String[] args) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());//�������� ��ȯ
			System.out.println("getHostaddress() : " + ip.getHostAddress());//�������� ip�ּҸ� ���ڿ� ���·� ��ȯ
			
			byte[] ipaddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipaddr));
			
			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
			//getAllByName(������) : �������� ��ϴ� ��� ����(ip)�ּҸ�
			//�迭�� ��� ��ȯ
			
			for(int i = 0; i < iparr.length; i++) {
				System.out.printf("iparr[%d] : %s",i,iparr[i]);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
	}
}
