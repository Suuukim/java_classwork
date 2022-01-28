package koreait.day10b;

// 지역변수, 인스턴스 변수(클래스 영역) , 클래스변수(static)
class Monkey{
	int leg;
	String name;
	static int number;
	
	// 모든 클래스는 최소 하나의 생성자를 가져야 한다.
	// 만약 클래스에서 생성자가 하나도 없을 경우 컴파일러가 기본생성자를 만들어준다.
	
	// 기본생성자
	Monkey(){
		System.out.println("나 몽키 기본생성자");
	}
	
	// 커스텀 생성자
	// 단축키: Alt + Shift + S -> O
	public Monkey(int leg, String name) {
		this.leg = leg;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "나는 몽키";
	}
	
	// 인스턴스 메소드 : 무조건 객체를 생성해야 사용할 수 있다.
	void eat() {
		System.out.println("바나나 먹는중");
	}

	// 오버로딩(new): 이름이 같아야한다. 매개변수 타입 또는 매개변수의 갯수가 달라야한다.
//	오버로딩
	void eat(String food) {
		System.out.println(food + "먹는중");
	}
//	오버로딩
	void eat(int foodCnt) {
		System.out.println(foodCnt + "인분 먹는중");
	}
	
	void walk(){
		System.out.println("네발로 걷는중");
	}
	
	static void sleep() {
		System.out.println("쿨쿨 자는중");
	}
	
}

class Human extends Monkey{
	
	public Human() {
		super();	// Monkey()
		System.out.println("나 휴먼 기본생성자");
	}
	
	public Human(int leg, String name) {
		super(leg, name);	// Monkey(int leg, String name)
	}
	
	@Override
	void eat() {
		System.out.println("밥 먹는중");
	}
//	선언부가 바뀌면 오버라이딩 안됨.
	// 오버라이딩
	void eat(String food) {
		System.out.println(food + "냠냠 먹는중 ");
	}
	
	// 오버라이딩
	void eat(int foodCnt) {
		System.out.println(foodCnt + "인분 먹는중");
	}
	
	// 오버로딩
	void walk(String place) {
		System.out.println(place + "걷는 중");
	}
}


public class ABC {
	public static void main(String[] args) {
//		Human hu = new Human();
		Monkey mk= new Monkey();
		System.out.println(mk);
		System.out.println(mk.toString());
		
//		Monkey mk= new Monkey(10, "원숭이");
//		mk.leg= 10;				//인스터스 변수이기때문에 객체생성후에 사용할 수 있다.
//		mk.name= "원숭이";
//		mk.eat();
//
//		System.out.println(Monkey.number);		//클래스변수 객체생성자 없이 사용가능하다.
//		Monkey.sleep();		//클래스 메소드 호출했기 때문에 객체 생성없이 사용가능하다.
		
		
	}
}
