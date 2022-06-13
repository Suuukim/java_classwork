package day02;

public class OperatorEx5 {
	public static void main(String[] args) {
		//산술변환
		
		byte b1 = 127;			//byte의 범위		-128 ~ 127까지 저장 가능
		byte b2 = 1;
		char ch = 'A';			//내부적으로 정수 65로 저장 -> 아스키 코드 참고.
//		System.out.printf("%c, %d",ch, (int)(ch));
		float f1 = 15.5F;		//F를 써주지 않으면 오류. 이유는 15.5는 기본형 실수 double타입이기 떄문에 에러.
		double d1 = 10.5;
		byte bb3 = -128;
		byte bb4 = 1;
		int i1 = b1 + b2;		//byte + byte -> int + int -> int
		byte b3 = (byte)(b1 + b2);		
//		byte b3 = b1 + b2;		//byte + byte -> int + int -> int이기 떄문에 오류.
		
		int i2 = ch + b2;		//char + byte -> int + int -> int
		float f2 = b1 + f1;		//byte + float -> float + float -> float
		double d2 = f1 + d1;	//float + double -> double + double -> double
	
		System.out.println("i1 : " + i1);
		System.out.println("b3 : " + b3);	
		System.out.println("i2 : " + i2);
		System.out.println("f2 : " + f2);
		System.out.println("d2 : " + d2);
		System.out.println("bb3 - bb4 : " + (byte)(bb3 - bb4));
		
		//overflow : byte -128 ~ 127			최대값  + 1 == 최솟값
		//underflow : byte -128 ~ 127			최솟값  - 1 == 최댓값
	}
}
