package koreait.day14;

public class Rabbit extends Animal{
	
	static final String TYPE="ν λΌ";
	
	public Rabbit() {
		
	}
	
	public Rabbit(String name,String color) {
		super(name,color);
	}
	
	@Override
	public void sound() {
		System.out.println("ν λΌπππλ λ λ νκ³  λ¨Ήμ΅λλ€.");
	}

	@Override
	public String toString() {
		return super.toString() + " - Type: " + TYPE; //superλ Animal ν΄λμ€ toString
	}
}
