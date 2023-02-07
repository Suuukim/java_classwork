package Variable;

public class StringDemo {
	public static void main(String[] args) {
//		String first;
//		first = "coding";
	
		String first = "coding";
		
		String a, b;
		a = "coding";
		b = "everybody";
		System.out.println(a+b);
		
		/* 한줄 주석 */
		//두개의 변수가 같은 데이터 타입 일 때 아래와 같이 코드를 작성한다.
		
		/* 여러줄 주석 */
		/*
		a = "coding";
		b = "everybody";
		System.out.println(a+b);
		*/
		
		/* JavaDoc 주석 */ 
		// -> /**로 시작하는 주석은 JavaDoc 주석이라고 해서 자바의 문서를 만들 때 사용한다. 아래 예제는 다음 URL의 문서를 생성한다.
		/**
		 * Prints an integer and then terminate the line.  This method behaves as
		 * though it invokes <code>{@link #print(int)}</code> and then
		 * <code>{@link #println()}</code>.
		 *
		 * @param x  The <code>int</code> to be printed.
		 */
		
		/* 세미콜론 */
		// -> 세미콜론은 문장(*statement)의 끝을 의미한다. 자바에서는 문장의 끝에 세미콜론을 사용하지 않으면 컴파일 에러가 발생한다.
		int d = 100; double f = 10.1;
	}
}
