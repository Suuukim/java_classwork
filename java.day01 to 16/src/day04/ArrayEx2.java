package day04;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i = 0; i< arr1.length;i++) {
			arr1[i] = i + 1;		//i의 값 : 0~9
			/*
			 * arr1[0] = 0 + 1;
			 * arr1[1] = 1 + 1;
			 * ...
			 * arr1[9] = 9 + 1;
			 */
		}
		//arr1 : [1,2,3,4,5,6,7,8,9,10]
		for(int i = 0; i<arr1.length;i++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = (int)(Math.random() * 10) + 1;
			//난수 (int)(Math.random() * 10) + 1 의 범위 : 1 ~ 10
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(chArr));
	}
}
