package ex8_JMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuTest");
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("����"); 
		JMenu jm2 = new JMenu("����"); 
		JMenu jm3 = new JMenu("����"); 
		
		JMenuItem jmi1 = new JMenuItem("���θ����");
		JMenuItem jmi2 = new JMenuItem("����");
		JMenuItem jmi3 = new JMenuItem("����");
		
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		
		JMenuItem jmi4 = new JMenuItem("�߶󳻱�");
		JMenuItem jmi5 = new JMenuItem("����");
		JMenuItem jmi6 = new JMenuItem("�����ֱ�");
		
		jm2.add(jmi4);
		jm2.add(jmi5);
		jm2.add(jmi6);
		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		f.setJMenuBar(jmb);
		
		f.setBounds(300,200,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
