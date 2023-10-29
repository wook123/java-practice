package memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{

	JTextArea ta;
	JTextField tf;
	JButton btn_input;
	
	public InputButtonAdapter(JTextArea ta, JTextField tf,JButton btn_input) {
		this.ta = ta;
		this.tf = tf;
		this.btn_input = btn_input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf.getText()+"\n");
		
		tf.requestFocus();//tf�� Ŀ���� �ű��.
		tf.setText("");//tf�� ������ ����ش�.
		btn_input.setEnabled(false);
		
	}
	
}
