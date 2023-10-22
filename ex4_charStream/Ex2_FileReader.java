package ex4_charStream;


import java.io.FileReader;

public class Ex2_FileReader {
	//test.txt���Ͽ� �ѱ�,����(�ҹ���,�빮�� ����)�� ��� �ۼ�
	//test.txt�� ������ �о�ͼ�
	//���뿡 ������ �빮�ڰ� �����, �ҹ��ڰ� �����
	//������ ���� ����ϼ���
	
	//���
	//�빮�� : x��
	//�ҹ��� : x��
	
	
	public static void main(String[] args) {
		int lower = 0;
		int upper = 0;
		try {
			FileReader fr = new FileReader("C:\\\\JAVA19_RBW\\test.txt");
			
			int code = 0;
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
				if(code >= 'a' && code <= 'z') {
					lower++;
				}
			}
			
			System.out.printf("�빮�� : %d��\n",upper);
			System.out.printf("�ҹ��� : %d��",lower);
			fr.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
