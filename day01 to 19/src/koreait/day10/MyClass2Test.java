package koreait.day10;

public class MyClass2Test {
	//MyClass2 클래스의 접근권한 확인.
		public static void main(String[] args) {

			MyClass2 my = new MyClass2();
			System.out.println(my.score);	// public
			System.out.println(my.messege);	// protected
			System.out.println(my.name);	// (default)
//			System.out.println(my.age);	// private 에러
			
			//my. 보이는 필드(name,score)와 안보이는 필드(age)를 구분해보세요.
			
			
			
		}

}
