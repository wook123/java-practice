package ex5_Check;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex3_ItemEvent {
	public static void main(String[] args) {
		JFrame f = new JFrame("ItemEvent ó��");
		f.setLayout(new BorderLayout());
		
		//������ư ��ü 3�� �����ϱ�
		ButtonGroup bg = new ButtonGroup(); 
		JRadioButton jrb1 = new JRadioButton("���� 1");
		JRadioButton jrb2 = new JRadioButton("���� 2");
		JRadioButton jrb3 = new JRadioButton("���� 3");
		
		//�׷쿡 ������ư �߰��ϱ�
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		
		//�г� �ϳ� ���� ������ư ������
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		
		
		
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		JLabel jl = new JLabel("���� �׸� : ");
		JLabel jl2 = new JLabel();
		jp2.add(jl);
		jp2.add(jl2);
		
		
		//�����ӿ� ��� ������
		f.add(jp1, BorderLayout.CENTER);
		f.add(jp2, BorderLayout.SOUTH);
		
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getSource() == jrb1) {
						jl2.setText("����1");
					} else if(e.getSource() == jrb2) {
						jl2.setText("����2");
					} else if(e.getSource() == jrb3) {
						jl2.setText("����3");
					}
				}
			}
		};
		
		jrb1.addItemListener(il);
		jrb2.addItemListener(il);
		jrb3.addItemListener(il);
		
		
		
		f.setBounds(300,300,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
