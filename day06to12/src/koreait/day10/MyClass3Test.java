package koreait.day10;

import java.util.Scanner;

public class MyClass3Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//객체 생성
		MyClass3 my = new MyClass3();
		my.setAge(20);		//MyClass3 클래스에서 int age필드를 가져와서 초기화 시켜줌.
		my.print(); 		//MyClass3 클래스에서 print 출력값을 그대로 가져옴.
		int age = my.getAge();	//age필드값 가져오기		//age는 setAge와 다른 변수값임.
		System.out.println("나이 = " + age);
		
		my.score=123;	//자바에서는 사용하지 않는 방법입니다. 상수만 필드를 직접 사용합니다. static final
	}

}
