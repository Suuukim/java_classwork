package day02;

public class OperatorEx4 {
	public static void main(String[] args) {
		//비트연산
		int x = 8;		//	00001000
		int y = 5;		//	00000101		^
						//	--------
						// 	00001101		1 	4	8
		
		
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x));	 	
		System.out.println("y를 2진수로 변환한 결과 : " + Integer.toBinaryString(y));
		
		//AND : 두 비트 모두 1이어야 1
		System.out.println("x와 y를 &(AND)연산 결과 : " + (x&y));	 	//0
		
		//OR : 둘 중 하나라도 1이면 1
		System.out.println("x와 y를 |(OR)연산 결과 : " + (x|y)); 		//13
		
		//XOR : 두 비트가 서로 다르면 1
		System.out.println("x와 y를 ^(XOR)연산 결과 : " + (x^y));		//13
		
		
	}
}
