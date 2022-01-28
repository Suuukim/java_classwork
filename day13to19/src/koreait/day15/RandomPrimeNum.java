package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {
	static final int NUM=7;	//상수를 이용해서 하는방법.
	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수를 7개 만듭니다. 소수 7개는 배열 저장하여 출력합니다.
		// -> 주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다. (메소드 이름 isPrime, 리턴형식은 boolean, 인자는 정수1개)
		//범위 100~999 -> 수식 만들어서 하세요.
		Random r = new Random();	
	
		long start = System.currentTimeMillis();		//현재시간을 ms(0.001초) 단위로 가져옵니다. 형식은 long
	
		int[] numbers = new int[NUM];
		int cnt = 0, max=99999999,min=33333333;
		while(cnt < NUM) {
			int temp = r.nextInt(max-min+1)+min;
			if(isPrime(temp))	
				numbers[cnt++]=temp;
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간 = " + (end-start) + " ms 소요되었습니다.");	//0ms 는 매우 짧은시간이 걸렸다는 뜻.
		System.out.println(Arrays.toString(numbers));
		
	}
	
	//-> 주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다.(메소드 이름 isPirme, 리턴형식은 boolean, 인자는 정수1개)	
	//메소드 부터 만들어보세요.
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
