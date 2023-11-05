package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuList implements ActionListener {
	
//	public Drink drimklist;
//	public Gimbap gimbaplist;
//	public Meal meallist;
//	public Noodle noodlelist;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("gbtn1")) {
			System.out.println("버튼1 클릭");
		}
		
	}
	
}
