package koreait.day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	//1)_ 정수형 배열에서 최대값 최소값 찾기
	//2)_ LottoTest.java while문을 do_while문으로 변경해보기. 단 변경할떄 isOK변수를 사용하지않고 해보기.
	//3)_ 문자열 2개를 입력받아서 1개로 합치고 EvenOdd 예제로 만들어보기.
	Scanner sc = new Scanner(System.in);
	Random r1 = new Random(System.currentTimeMillis());
	int[] arr1 = new int[50];

	
	for(int i=0;i<50;i++) {		//인덱스 범위 : 0~49
		arr1[i]=i+1;			//값 범위 : 1~50
		}
		
	int max;
	int min;
		System.out.println("[[랜덤숫자 10개]]");
	for(int i=0;i<10;i++)						// 인덱스 값 랜덤으로 입력
		System.out.print(r1.nextInt(50) + "  ");	
	
		
		
	
	
		
	
	
//		System.out.println(arr1.length);
//		System.out.println("최대값  = " + max);
//		System.out.println("최소값  = " + min);
//	sc.close();
	
	
	
	
	
	
	
	
	}
}
