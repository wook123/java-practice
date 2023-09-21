package ex2_animal;

public class Snake extends Animal {
	
	String sensor = "감각이 좋다";
	
	@Override
	public int getLeg() {
		return 0;
	}
	//오버라이드 : 메서드의 재정의의 의미를 가진다.
	//상속관계의 객체에서 부모의 매서드를 자식이 가져와 사용하되
	//이름과 파라미터는 극대로 놔두고, 내용만 현재 자식클래스의 사정에 맞게 재정의 하는것
	//오버라이드 메서드는 내용을 제외하고는 부모의 것과 완전히 동일해야 합니다.
	//오버로드는 메서드의 중복정의 vs 오버라이드는 메서드의 재정의
}
