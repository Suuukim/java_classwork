package koreait.day17_sort;

import java.util.Arrays;

public class IntDescendingSortTest {
		//내림차순
	public static void main(String[] args) {
	
		int[] datas = {45,34,78,65,99,14};
		
		System.out.println("배열 초기 상태 : " + Arrays.toString(datas));
		for(int i=0;i<datas.length;i++) {
			
			for(int k=i+1;k<datas.length;k++) {
				if(datas[i] < datas[k]) {		//오름차순에서 비교조건 식만 변경.
					//교환 
					int temp = datas[k];
					datas[k] = datas[i];
					datas[i] = temp;	
				}
			}//k변수 for문
		System.out.println("i = " + i + "중간결과 : " + Arrays.toString(datas));
		
		
		}//i변수 for문
		
		}
}
