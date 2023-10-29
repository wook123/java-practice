package panel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	public JPanelTest() {
		super("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
//		p1.setLayout(new FlowLayout());
		p1.setLayout(new GridLayout(2,3));//�� ��   ���η� ��ġ�Ǵ� ��Ұ���, ���η� ��ġ�Ǵ� ��Ұ���
		
		//��ġ������
		//FlowLayout : ���ʿ��� ���������� ��ġ, �����ʿ� �� �̻� ������ ������ �Ʒ��� ��������.
		//BorderLayout : ��,��,��,��,�߾� �ټ����� �������� ������.
		//GridLayout : n x n �� ǥ ������� �������ָ� ���ʿ��� ������, ������ �Ʒ�
		//CardLayout : ��Ҹ� ������ ��ġ
		//Null : ���̾ƿ��� ���� �ʰ� �� ������Ʈ���� �������� ��ġ�� ����
		
		//�������̳� �гο� ��Ҹ� ���� �� add()�޼��带 ����Ѵ�.
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		
		p1.add(jb1);		
		p1.add(jb2);		
		p1.add(jb3);		
		p1.add(jb4);		
		p1.add(jb5);		
		
		this.add(p1);
		
		setBounds(300,300,300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JPanelTest jt = new JPanelTest();
		jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


	
	
	
}
