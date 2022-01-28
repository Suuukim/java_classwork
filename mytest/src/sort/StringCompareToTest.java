package sort;

public class StringCompareToTest {
	public static void main(String[] args) {
		//배열에 저장된 값은 참조(데이터의 주소)값이다.
		//참조값으로 접근한 문자열은 > , < 로 비교하지 않는다.  compareTo 메소드로 비교합니다.
		//사전식 비교(알파벳 또는 가나다 순서)
		
		
		String[] names = {"boa","momo","nayeon","zun","nana"};
		
		System.out.println("문자열 비교 1 : " + "boa".compareTo("nana"));	// 왼쪽 < 오른쪽	-12
		System.out.println("문자열 비교 2 : " + "momo".compareTo("nana"));	// 				-1
		System.out.println("문자열 비교 3 : " + "nana".compareTo("boa"));	// 왼쪽 > 오른쪽 	12
		System.out.println("문자열 비교 4 : " + "nana".compareTo("momo"));	//				1
		System.out.println("문자열 비교 5 : " + "nana".compareTo("nayeon"));	//				-11
		
		//a b c d e f g h i j k l m n o p q r s t u v w x y z
		//		알파벳 순서차이		   1
		System.out.println("===============================");
		System.out.println("한글문자열비교 1 : " + "고양이".compareTo("염소"));		//왼 < 오		-6428	
		System.out.println("한글문자열비교 2 : " + "고양이".compareTo("고양니"));		//왼 > 오		5292
		System.out.println("한글문자열비교 3 : " + "다람쥐".compareTo("고양이"));		//왼 > 오		1540
		
		System.out.println("===============================");
		System.out.println("문자열 비교 6 : " + "nana".compareTo("nana"));		//왼 = 오		0

	}
}