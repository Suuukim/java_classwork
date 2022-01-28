package koreait.day10a;

import koreait.day10.MyClass2;

class MyVariable extends MyClass2{
	void v1() {
		System.out.println(score);	//public
		System.out.println(messege);	// protected
//		System.out.println(name);	// default 에러
//		System.out.println(age);	// private 에러
	}
}


public class MyClass2Test {
	//MyClass2 클래스의 접근권한 확인.
		public static void main(String[] args) {

			MyClass2 my = new MyClass2();	//*다른 패키지의 클래스를 사용할때 import 필요합니다.
			System.out.println(my.score);	// public
//			System.out.println(my.messege);	// protected 에러
//			System.out.println(my.name);	// default 에러
//			System.out.println(my.age);		// private 에러
			//my. 보이는 필드(score)와 안보이는 필드(age,name)를 구분해보세요.
			
			
			
		}

	}