package ex4_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\\\JAVA19_RBW\\fileWriter����.txt");
			
			fw.write("ù��° �� �ۼ��մϴ�.");
			fw.write("\n");
			fw.write("�ι�° �ٵ� ���� ����\n");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
