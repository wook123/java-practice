package ex2_fileinput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex3_FileInputStream {
	public static void main(String[] args) {
		String path = "C:\\JAVA19_RBW\\test.txt";
		
		File f = new File(path);
		
		byte[] keyboard = new byte[100];
		
		try {
			System.out.print("�� : ");
			//ǥ���Է���ġ ��Ʈ��
			System.in.read(keyboard);
			
			String s = new String(keyboard);
			System.out.println(s);
			
//			Scanner sc = new Scanner(System.in);
//			String res = sc.next();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
