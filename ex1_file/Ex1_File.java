package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
	//IO(Input,Output) : ����°� ���õ� ��Ʈ��
	//��Ʈ�� : ������ ������� ���� ���
	
	//���� ��ü�� ������ ���
	String path = "C:\\JAVA19_RBW\\test.txt";
	
	//�غ�� ��η� File��ü ����
	File f = new File(path);
	
	//FileŬ������ �����Ǹ鼭 path��α��� ��Ʈ���� ����
	
	System.out.println(f.length() + "byte");
	//������ �뷮�� �� �� �ִ�. �ѱ��� 2byte, ����,Ư������ 1byte
	//�����̵� ������ ���� �������� �ش��ϴ� ���� �뷮�� ������ �� �ִ�.
	}

}
