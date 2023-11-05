package project;

import javax.swing.JFrame;

import project.Gimbap;
import project.Noodle;
import project.Meal;
import project.Drink;
import project.MenuButton;

public class MenuMain {
	public static void main(String[] args) {
		
		MenuTest mt = new MenuTest();
		mt.setLayout(null);
		
		mt.setTitle("ºÐ½ÄÁý");
		
		mt.mbPanel = new MenuButton(mt);
		mt.gimbapPanel = new Gimbap(mt);
		mt.noodlePanel = new Noodle(mt);
		mt.mealPanel = new Meal(mt);
		mt.dirnkPanel = new Drink(mt);
		
		mt.gimbapPanel.setBounds(0, 0, 500, 700);
		mt.noodlePanel.setBounds(0, 0, 500, 700);
		mt.mealPanel.setBounds(0, 0, 500, 700);
		mt.dirnkPanel.setBounds(0, 0, 500, 700);
		//gimbapPanel.setBackground(Color.black);
		
		mt.add(mt.mbPanel);
		mt.add(mt.gimbapPanel);
		mt.add(mt.noodlePanel);
		mt.add(mt.mealPanel);
		mt.add(mt.dirnkPanel);
		
		
		
		mt.setBounds(0, 0, 500, 700);
		mt.setVisible(true);
		mt.setDefaultCloseOperation(mt.EXIT_ON_CLOSE);
	}

}