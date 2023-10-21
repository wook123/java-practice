package ex3_fileout;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		
		ps.write('A');
		ps.write('B');
		ps.write('\n');
		ps.write('C');
		
		try {
			byte[] by = {'J','A','V','A'};
			ps.write(by);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.close();
	}
}
