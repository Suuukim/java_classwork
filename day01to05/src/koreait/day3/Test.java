package koreait.day3;

import java.util.Scanner;

public class Test {

		public static void main(String[] args) {
			// 응용 : 국어점수 90이상이고 총점이 250이상이면 국어 특기 우수 학생
		int korean, sum;
		korean = 92;
		sum = 260;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어점수를 입력하세요 -> ");
		korean = sc.nextInt();
		
		if(korean>=90 && sum>=250) 
			System.out.println("국어 특기 우수 학생");
		else
			System.out.println("국어 수준 미달");
		
			
			
			
			
		}
}
