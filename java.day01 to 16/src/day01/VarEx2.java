package day01;

public class VarEx2 {
	public static void main(String[] args) {
		
		char ch = 'A';		//문자를 표현할 때는 ' '를 사용
//		char ch1 = 'AA';	//오류. 이유는 char변수에는 문자 하나만 저장할수 있음.
		String str = "자바";	//문자열을 표현할때는 " "를 사용.
		int age = 20;
		int year  = 2021;
		
		long result = 10L;	
		float result2 = 10.1f;		
		//float는 4바이트이고 10.1은 기본형실수타입은 double 8바이트이기때문에 강제형변환이 필요하다.
		double d = 3.14;		
		
		System.out.println(ch);		//변수명 자체만으로도 출력 가능하다.
		System.out.println("ch : " + ch);
		System.out.println("나는 " + age + "살이 되고 싶네요.");	//변수와 " "문자열 입력을 통해서 얼마든지 원하는데로 출력 가능하다.
		System.out.println(age + year);		//출력 값 : 2041.	int + int는 20 + 2021로 자바가 반응해서 2041이라는 값이 나온다.
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("d : " + d);
		
	}
}
