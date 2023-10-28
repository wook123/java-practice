package ex9_ChangeEvent;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex1_JSlider extends JFrame {
	
	JLabel colorLabel;
	JSlider jsl;
	
	public Ex1_JSlider() {
		setTitle("�����̴��� ChangeEvent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		colorLabel = new JLabel("    SLIDER EXAMPLE    ");
		//0~100������ ���� ������ �� �ִ� �����̴� ����, �ʱⰪ��  50
		jsl = new JSlider(JSlider.HORIZONTAL,0,255,50);
		jsl.setPaintLabels(true);//���� ����
		jsl.setPaintTrack(true);//�����̴��� true�� ���̰� false�� �Ⱥ���
		jsl.setPaintTicks(true);//����
		jsl.setMajorTickSpacing(50);
		jsl.setMinorTickSpacing(10);
		
		jsl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				//�����̴��� ���� ����Ǹ� ȣ���
				colorLabel.setBackground(new Color(0,jsl.getValue(),0));
				
			}
		});
		//������ ��������
		jsl.setForeground(Color.RED);
		
		//�󺧿� ������ ������� �� �ֵ��� ���ִ� �޼���
		colorLabel.setOpaque(true);
		
		add(jsl);
		add(colorLabel);
		setSize(300,300);
		setVisible(true);
		
	}//������
	
	public static void main(String[] args) {
		new Ex1_JSlider();
	}
	
}
