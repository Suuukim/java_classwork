package day01;

import java.util.Scanner;		// ==> Scanner 클래스를 사용하려면 import가 필요하다.

public class ScannerEx {
	public static void main(String[] args) {
		//Scanner 클래스 이용
		// ==> 입력을 받기 위한 클래스이다.
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한자리 입력 > ");
//		int num = sc.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자 : " + num);
//		
//		System.out.print("실수 입력 > ");
//		double dnum = sc.nextDouble();		//실수를 입력받음.
//		System.out.println("사용자로부터 입력받은 숫자(실수) : " + dnum);
		
		//문자열 받기 ==> next(), nextLine()
//		System.out.print("문자열 입력 > ");		
//		String str = sc.next();			//공백을 기준으로 문자열을 입력받는다. 예를들어 중간에 공백이 생기면 그 앞에 입력한 문자까지만 입력된다.
//		System.out.println("입력받은 문자열 : " + str);
		
		System.out.print("문자열 입력 > ");
		String str = sc.nextLine();		//엔터를 기준으로 문자열을 입력받는다.
		System.out.println("입력받은 문자열 : " + str);
		
		
		
	}
}
