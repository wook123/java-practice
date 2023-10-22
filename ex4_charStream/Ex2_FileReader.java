package ex4_charStream;


import java.io.FileReader;

public class Ex2_FileReader {
	//test.txt파일에 한글,영어(소문자,대문자 포함)를 섞어서 작성
	//test.txt의 내용을 읽어와서
	//내용에 엉어의 대문자가 몇개인지, 소문자가 몇개인지
	//개수를 각각 출력하세요
	
	//결과
	//대문자 : x개
	//소문자 : x개
	
	
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
			
			System.out.printf("대문자 : %d개\n",upper);
			System.out.printf("소문자 : %d개",lower);
			fr.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
