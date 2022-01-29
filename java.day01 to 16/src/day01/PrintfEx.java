package day01;

public class PrintfEx {
	public static void main(String[] args) {
		boolean flag = true;
		float number = 1.2f;
		char ch = 'A';
		String name = "Lee";
		
		System.out.printf("flag : %b\n", flag);			//출력 값 : true
		System.out.printf("number : %f\n", number);		//출력 값 : 1.200000
		System.out.printf("number : %.1f\n", number);		//출력 값 : 1.2		.1은 실수를 출력할때 소수점자리수를 뜻함.
		System.out.printf("ch : %c\n", ch);				//출력 값 : A
		System.out.printf("name : %s\n", name);			//출력 값 : Lee
	
	}
}
