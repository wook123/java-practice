package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "C:\\JAVA19_RBW";
		
		File f = new File(path);
		//파일클래스의 두번째 기능
		//최종목적지가 폴더일 때 해당 폴더가 가진 하위목록의 이름을 가져올 수 있다.
		
		//폴더 == 디렉토리
		if(f.isDirectory()) {
			String[] names = f.list();
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
	}
}
