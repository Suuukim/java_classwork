package bubble.test.ex00;

class Dog {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class LomboTest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.setName("토토");
		System.out.println(d.getName());
		
	}
	
}
