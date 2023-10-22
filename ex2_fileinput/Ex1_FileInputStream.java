package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		//FileŬ������ ���� ���ϴ� �͵���
		//FileInputStream�� �� �� �ִ�.
		
		//byte ����� ��Ʈ�� -> 1byte�� �о�´�
		//...Stream
		//char ����� ��Ʈ�� -> 2byte�� �о�´�.
		//...Reader,...Writer
		
		String path = "C:\\JAVA19_RBW\\test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {//������ ������ ���� ����
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				//read()�޼��尡 �ѹ��� 1byte�� �о���ٰ�
				//�� �̻� �о�� �ܾ ���ٸ� ������ ��(End Of File)�� -1�� ��ȯ�Ѵ�.
				//�����ڵ忡�� �ƽ�Ű�ڵ忡�� -1�� �ش��ϴ� ���� ���� ������ -1 �� ����
				
				
				while ((code = fis.read()) != -1) {
					System.out.print((char)code);
				}
				
				//��Ʈ���� ����� �Ϸ�� �� close�� ���� �ݾ��ִ� ���� ����.
				//�׷��� ���� �۾��� �ϴµ� ������ ������ �ʴ´�.
				//close�� �ۼ����� �ʾ��� ��, ���� �� �۾��� �������ϱ� ȭ�鿡 ���ų�
				//������ ����� �ȵǰڱ��� ��� �����ϴ� ��찡 �ִ�.
				
				fis.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
