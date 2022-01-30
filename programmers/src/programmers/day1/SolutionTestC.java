package programmers.day1;

import java.util.Scanner;

public class SolutionTestC {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int leng;			//가로입력값
		int bre;			//세로입력값
		
		
		System.out.print("가로 값을 입력하세요. -> ");
		leng = sc.nextInt();
		System.out.print("세로 값을 입력하세요 . -> ");
		bre = sc.nextInt();
		
		for(int i=0;i<leng;i++) {
			System.out.print("★");
		}
	}
}

