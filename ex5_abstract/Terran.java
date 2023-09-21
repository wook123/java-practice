package ex5_abstract;

public class Terran extends Unit {

	//공중유닛이면 true,지상유닛이면 false
	boolean fly;
	public Terran(String name,int energy,boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	@Override
	public void decEnergy() {
		energy -= 3;
	}
	
}
