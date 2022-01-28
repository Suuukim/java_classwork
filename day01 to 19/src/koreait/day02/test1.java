package koreait.day02;

public class test1 {
	public static void main(String[] args) {
	
	System.out.println("[[ 사각형 도형의 넓이 구하기]]");
		int x = 23;			// 가로 cm
		int y = 19;			// 세로 cm
		int area = x * y;
	
		System.out.println("넓이를 구했습니다. -> " + area);
				System.out.println();
	System.out.println("[[ 원 도형의 넓이와 둘레 구하기]]");
	double i = 23.0;		// 반지름 cm
	double height = i * i * 3.14;
	double  circle = 2 * 3.14 * i;
	System.out.println("반지름 -> "+ i);
	System.out.printf("둘레를 구했습니다. -> %.3f㎠\n" , height);
	System.out.printf("넓이를 구했습니다. -> %.3f㎠\n" , circle );
	
	
	}
}
