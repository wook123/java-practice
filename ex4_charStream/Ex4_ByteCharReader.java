package ex4_charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex4_ByteCharReader {
	public static void main(String[] args) {
		//byte기반 스트림과 char기반의 스트림의 연결
		
		File f = new File("C:\\JAVA19_RBW\\eclipse-workspace\\Ex_RBW\\src\\ex_rbw");
		try {
			FileInputStream fis = new FileInputStream(f);			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String str;
			
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
			
			if(fis != null) {
				fis.close();
			}
			if(br != null) {
				br.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
