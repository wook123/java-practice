package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		//char����� ��Ʈ���� Reader,Writer�� �ڽ�Ŭ������ ���
		//�⺻������ 2byte�� �����ϱ� ������ 2byte���� ������ ���ϵ�
		//���� ������� ����
		
		try {
			FileReader fr = new FileReader("C:\\JAVA19_RBW\\test.txt");
			
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}
			//1byte¥���� �ƽ�Ű�ڵ�� �о���� 2byte�� �����ڵ�� �˾Ƽ�
			//�о���� ������ ���ڰ� ������ ���� ����.
			
			//����,������,�̹��� �� ���� ������ ������ �� 2byte�� �����ϴ°�
			//���� ���� �� �ִ�.
			
			
			
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
