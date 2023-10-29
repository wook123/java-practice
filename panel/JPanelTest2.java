package panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest2 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("BorderLayout ����");
		
		JPanel p1 = new JPanel();
		//�г��� ���� �����ϱ�
		p1.setBackground(Color.DARK_GRAY);
		
		//�г��� ���̾ƿ� ���ϱ�
		p1.setLayout(new BorderLayout());
		
		//�г��� ��ư ������
		p1.add("North", new JButton("��"));
		p1.add("West", new JButton("����"));
		p1.add("Center", new JButton("���"));
		p1.add("East", new JButton("������"));
		p1.add("South", new JButton("�Ʒ�"));
		
		//�����ӿ� �г� ������
		f.add(p1);
		
		//�������� ������ ��ġ�� ũ�� ���ϱ�
		f.setBounds(300,300,300,200);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
}
