package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		//char기반의 스트림은 Reader,Writer의 자식클래스를 사용
		//기본적으로 2byte를 지원하기 떔누에 2byte언어로 구성된 파일도
		//쉽게 입출력이 가능
		
		try {
			FileReader fr = new FileReader("C:\\JAVA19_RBW\\test.txt");
			
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}
			//1byte짜리는 아스키코드로 읽어오고 2byte는 유니코드로 알아서
			//읽어오기 떄문에 문자가 꺠지는 일이 없다.
			
			//음악,동영상,이미지 와 같은 파일을 전송할 떄 2byte씩 전송하는게
			//좋지 않을 수 있다.
			
			
			
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
