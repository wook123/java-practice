package ex6_comboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex1_JComboBox {
	public static void main(String[] args) {
		JFrame f= new JFrame("�޺��ڽ� �����");
		f.setLayout(null);
		String[] title = {"C","���־�����","Java","�ڷᱸ��","�̻����"};
		JComboBox<String> jcm1 = new JComboBox<String>(title);
		
		//�޺��ڽ��� ������ �߰��ϱ�
		jcm1.addItem("python");
		
		jcm1.setBounds(50, 50, 100, 30);
		f.add(jcm1);
		
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,300,300,200);
		f.setVisible(true);
		
		
		
	}
}
