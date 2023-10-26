package ex2_stream;

public class Student implements Comparable<Student> {
	public static void main(String[] args) {
		
	}
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s,%d,%d]",name,ban,totalScore).toString();
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return s.totalScore - this.totalScore;
	}
}
