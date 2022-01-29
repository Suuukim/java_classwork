package day01;

public class VarEx1 {
	public static void main(String[] args) {
		//변수의 선언과 초기화
		int x = 10;		
		//int는 변수 타입, x는 변수이름, = 대입연산자, 10 저장될 데이터.
		//int x라는 변수에 데이터 10을 대입(저장)해라.
		int y = 20;
		int tmp = 0;
		
		System.out.println(x);	// 출력 값 : 10
		System.out.println(y);	// 출력 값 : 20
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		//출력하였을때 이해하기 쉽게 하기 위해 " " 설명을 입력해주고 변수 선언하였음.
		
		tmp  = x;
		x = y;
		y = tmp;
		System.out.println("=======");
		System.out.println("x = " + x);		//출력 값 : 20
		System.out.println("y = " + y);		//출력 값 : 10
		System.out.println("tmp = " + tmp);	//출력 값 : 10
		//tmp라는 변수에  x값을 저장하고 또 x라는 값에 y값을 저장하게 되면서 값이 변경되었음.
		
		int sum = 0;
//		int sum = 1;		//오류. 중복된 변수이름은 선언할 수가 없다.
		sum = 1;			//위에 변수에 선언된것과는 다르다. sum변수에 1을 다시 대입하라는 얘기. 
		
	}
}
