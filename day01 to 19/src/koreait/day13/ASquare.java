package koreait.day13;

public class ASquare extends AShape{

	private int width;
	
	//테스트용 메소드
	public String square() {
		return "square - 정사각형";
	}
	
	
	//getter
	public int getWidth() {
		return width;
	}

	//setter
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return width*width;
	}
	
	
}
