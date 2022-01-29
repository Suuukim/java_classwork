package day01;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";		//"Java" 문자열  + 문자열 => 연결
		System.out.println(name);		//출력 값 : Java
		
		String str = name + 1.8;		// "Java" + 1.8
		System.out.println(str); 		//출력 값 : Java1.8
		
		/*
		 *  String str = name + 0.8
		 *  	   str = "Java" + 1.8
		 *  	   str = "Java" + "1.8"
		 *  	   str = "Java1.8"
		 */
		
		System.out.println(7 + "");			//출력 값 : 7
		System.out.println("" + 7);			//출력 값 : 7
		System.out.println(7 + 7 + "");  	//출력 값 : 14
		/*
		 * 	7 + 7 + ""
		 * 	14 + ""
		 * 	"14" + ""
		 * 	"14"
		 */
		System.out.println("" + 7 + 7);		//출력 값 : 77	-> 문자열
		
	}
}
