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
		
//		System.out.print("문자열 입력 > ");
//		String str = sc.nextLine();		//엔터를 기준으로 문자열을 입력받는다.
//		System.out.println("입력받은 문자열 : " + str);

//		System.out.print("숫자를 입력하세요 > ");
//		String str = sc.nextLine();
//		System.out.println("입력받은 숫자 : " + str);
//		str += 2;			//문자열에선 숫자가 더해지는게 아니고 문자열로 저장되어서 입력된 값 뒤에2라는 값이 나온다.
//		System.out.println("str += 2 : " + str);
//	
//		int result = Integer.parseInt(str);			//문자열 -> 정수로 바꾸는 메소드
//		result += 2;
//		System.out.println("result : " + result);
		
		String jumin = "020311-3456789";
		//index 	(주민번호 3이라는 숫자를 가지고 남자인지 여자인지 구분하고 싶다.)
		/*
		 * 		String str = "abc";
		 * 
		 * 				a	b	c
		 * 		index	0	1	2
		 */
		
		char gender = jumin.charAt(7);			//charAt(int - index) 문자열에서 특정 위치의 문자를 추출하는 메소드
		System.out.println("gender : " + gender);
		
		
		
	}
}
