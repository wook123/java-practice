package ex3_fileout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\JAVA19_RBW\\fileOut.txt",true);
			
			fos.write('f');
			fos.write('i');
			
			fos.write('l');
			fos.write('e');
			fos.write('\n');
			
			String msg = "fileOutput�����Դϴ�.\n";
			String msg2 = "�����ٵ� ����";
			
			//getbytes() : ���ڿ��� byte[]�迭�� ��ȯ�ϴ� �޼��� 
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
