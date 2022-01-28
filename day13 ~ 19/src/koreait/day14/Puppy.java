package koreait.day14;

public class Puppy extends Animal{

	static final String TYPE="강아지";
	
	public Puppy() {
		
	}
	
	public Puppy(String name,String color) {
		super(name,color);		
//super는 부모클래스의 객체를 상속받는 필드입니다. this를 사용하지않습니다.
//this는 본인의 클래스에서만 사용할수 있습니다.
	}
	
	@Override
	public void sound() {
		//추상메소드 구현합니다.
		System.out.println("강아지🐶🐶🐶는 멍멍하고 짖습니다.");
	}

	@Override
	public String toString() {
		return super.toString() + " - Type: " + TYPE; //super는 Animal 클래스 toString
	}
	
	
	

}
