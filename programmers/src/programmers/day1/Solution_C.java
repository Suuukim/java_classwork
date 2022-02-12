package programmers.day1;

import java.util.Scanner;

public class Solution_C {
	public static void main(String[] args) {
		//직사각형 별찍기.
		 Scanner sc = new Scanner(System.in);
	        System.out.print("가로개수 입력하세요. -> ");
	        int a = sc.nextInt();
	        System.out.print("세로개수 입력하세요. -> ");
	        int b = sc.nextInt();
	       
	        for(int i=0; i<b; i++){
	            for(int k=0; k<a; k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}

