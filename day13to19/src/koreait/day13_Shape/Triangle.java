package koreait.day13_Shape;

public class Triangle extends Shape {
	
	public Triangle(String shapeName, int width, int height) {
		
		super(shapeName, width, height);
	}
	
	public void print() {	//getSapenma
		System.out.println("도형이름 : "+  getShapeName()
				+ ", 너비 : " + getWidth() + ", 높이 : " + getHeight());
		System.out.println("기타정보 : " + etc);  	// private이 아닌 부모 필드는 직접 접근합니다.(super.etc)
		System.out.println("count : " + count);
	
	}
	
	public int getArea() {		//***** 부모클래스가 정의한 형식의 메소드를 수정(변경)합니다. : 오버라이드*****
		return(getHeight() * getWidth() /2);
	}
	
	public double getAreaDouble() {		//같은이름의 서로 다른 (형식) 메소드가 있으면 오류입니다.
		return (double)(getHeight() * getWidth() /2);
	}
}
