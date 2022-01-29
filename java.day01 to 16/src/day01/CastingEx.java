package day01;

public class CastingEx {
	public static void main(String[] args) {
		double d = 85.4;
//		int score = d;		//오류.		double 8바이트를 	int4바이트에 넣을수 없다.
		int score = (int)d;				//강제 형변환. 형변환 할수 있지만 값이 손실된다.
		System.out.println("score : " + score);
		System.out.println("d : " + d);
		
		double d1 = (double)80;			//강제 형변환. 80은 int로 정수형이지만 double 실수형으로 변환되면서 소수점자리가 생기게된다.
		System.out.println("d1 : " + d1);
		
	}
}
