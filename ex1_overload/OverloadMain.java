package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Ex1_Overload ol = new Ex1_Overload();
		ol.result();
		ol.result(1);
		ol.result('n');
		ol.result(1,"류병욱");
		ol.result("류병욱",1);
		
		System.out.println();
		
		
	}
}
