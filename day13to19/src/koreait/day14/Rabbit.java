package koreait.day14;

public class Rabbit extends Animal{
	
	static final String TYPE="토끼";
	
	public Rabbit() {
		
	}
	
	public Rabbit(String name,String color) {
		super(name,color);
	}
	
	@Override
	public void sound() {
		System.out.println("토끼🐇🐇🐇는 냠냠하고 먹습니다.");
	}

	@Override
	public String toString() {
		return super.toString() + " - Type: " + TYPE; //super는 Animal 클래스 toString
	}
}
