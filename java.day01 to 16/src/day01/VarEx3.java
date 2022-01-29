package day01;

public class VarEx3 {
	public static void main(String[] args) {
		// final
		int number = 0;
		number = 4;
		
		
		final int MAX_NUMBER = 100;		//상수명은 대문자로, 여러 단어를 이름으로 사용할 시  _사용한다.
		System.out.println("상수 : " + MAX_NUMBER);
//		MAX_NUMBER = 200;		//오류. 상수는 한번 저장된 값을 변경할수 없다.
		
	}
}
