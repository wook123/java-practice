package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "C:\\JAVA19_RBW";
		
		File f = new File(path);
		//����Ŭ������ �ι�° ���
		//������������ ������ �� �ش� ������ ���� ��������� �̸��� ������ �� �ִ�.
		
		//���� == ���丮
		if(f.isDirectory()) {
			String[] names = f.list();
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
	}
}
