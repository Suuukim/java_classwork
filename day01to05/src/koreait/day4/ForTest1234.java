package koreait.day4;

import java.util.Arrays;
import java.util.Random;

public class ForTest1234 {
	public static void main(String[] args) {
		
//		1부터 10까지 모든 수를 더한 값을 result 변수에 담은 후 result 출력하기
//		int result = 0;
//		
//		for(int i=1;i<=10;i++) {
//			result += i;
//		}
//			System.out.println("result = " + result);
//			
////		1~30 중에 2의 배수만 반복문을 이용하여 아래 두 가지 형태로 출력해라	
////		1. 증감식에서만 2의 배수를 해결
//			for(int i=2;i<=30;i=i+2) {
//				System.out.println("i = " + i);				
//			}
//			
////		2. if문으로 2의 배수 해결	
//			for(int i=2;i<=30;i++) {
//				if(i%2 == 0) {
//					System.out.println("i = " + i);
//				}
//			}
////		3. 5 ! = 5*4*3*2*1=?
//			int num = 10;
//			result = 1;
//			for(int i=num;i>0;i--) 
//				result *= i;
//			System.out.println("result = " + result);
			
			
//		4. num = 100;	-> 3의 배수가 몇개인가.
//			int cnt = 0; 	//3의 배수개수.
//			int num = 150;
//			int n2 = 7;
//			for(int i=1;i<num;i++) {
//				if(i%n2 == 0)
//					cnt++;
//			}
//			System.out.println(cnt);
//			
//			for(int i=0;i<num;i+=3) {
//				cnt++;
//			}
//		5. 배열의 크기 20 난수 경계값을 100 4의 배수만 출력
			int[] arr = new int[20];	//배열 크기 20
			Random r = new Random();
			int max = 100, min = 0;	// 난수 경계값
			int cnt = 0;		// 4의배수 개수.
			int count = 4;		// 4의 배수
			int num;			// 4의 배수 값.
			for(int i=0;i<arr.length;i++) {
				arr[i] = r.nextInt(max-min+1)+min;
				if(arr[i] %count == 0) {
					cnt++;
				System.out.println("4의 배수 값 = " + arr[i] + " 4의 배수 개수 = " + cnt);
				}
			}
			System.out.println(Arrays.toString(arr));
	}
}
