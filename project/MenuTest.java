package project;

//import project.Gimbap;
import project.Noodle;
import project.Meal;
import project.Drink;

import javax.swing.JFrame;


public class MenuTest extends JFrame {

	public Gimbap gimbapPanel;
	public Noodle noodlePanel;
	public Meal mealPanel;
	public Drink dirnkPanel;
	public MenuButton mbPanel;
	
	public void change(String panelName) {
		if(panelName.equals("gimbap")) {
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(gimbapPanel);
			revalidate(); 
			repaint(); 
			
		} else if(panelName.equals("noodle")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(noodlePanel);
			revalidate();
			repaint();
		} else if(panelName.equals("meal")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(mealPanel);
			revalidate();
			repaint();
		} else if(panelName.equals("drink")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(dirnkPanel);
			revalidate();
			repaint();
		}
	}
}

