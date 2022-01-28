package koreait.day3;

import java.util.Scanner;

public class Jumsu {

	public static void main(String[] args) {
		// 성적 집계 : 평균과 총점 구하기		
		Scanner sc = new Scanner(System.in);
		int korean,english,science,sum;
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		System.out.print("국어 -> ");
		korean = sc.nextInt();
		System.out.print("영어 -> ");
		english = sc.nextInt();
		System.out.print("과학 -> ");
		science = sc.nextInt();
		sum = korean + english + science;
		System.out.println(">>>처리되었습니다.");
		System.out.printf("총점 : %d\n" , sum);
		System.out.printf("평균 : %d (%.2f) , 과목수 : %d\n", sum/3 ,  (double)sum/3 , 3);
	}
}
