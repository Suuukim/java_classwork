package koreait.day06;

public class Test {
	public static void main(String[] args) {
	
		testMethod1();
		System.out.println(testMethod33());
		System.out.println(testMethod4(49, 5050));
		
	}

	static void testMethod1() {
		System.out.println("테스트");
	}
	static String testMethod33() {
		return "수요일";
	}
	static int testMethod4(int a, int b) {
		return (a+b);
	}
	
}
