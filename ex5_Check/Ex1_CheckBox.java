package ex5_Check;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex1_CheckBox {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setLayout(null);
		
		JCheckBox jcb1 = new JCheckBox("����",true);
		JCheckBox jcb2 = new JCheckBox("���",true);
		JCheckBox jcb3 = new JCheckBox("����",true);
		
		//��Ұ� �����ӿ� ������ ��ġ�� ũ��
		
		jcb1.setBounds(50,50,70,30);
		jcb2.setBounds(130,50,70,30);
		jcb3.setBounds(200,50,70,30);
		
		//�����ӿ� ��� ������
		f.add(jcb1);
		f.add(jcb2);
		f.add(jcb3);
		
		f.setBounds(300,300,400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
