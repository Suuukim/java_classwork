package day02;

public class OperatorEx6 {
	public static void main(String[] args) {
		boolean result = false;
		int i = 10;
		char ch = 'b';			//98
		
		result = (i > 5);		
		System.out.println("(i > 5) : " + (i > 5)); 		//true
		
		result = (i >= 9) && (i < -8);						
		System.out.println("(i >= 9) && (i < -8) : " + result);		//false.	&&조건은 두 조건식이 모두 참이어야 true
		
		result = (i >= 9) || (i < -8);
		System.out.println("(i >= 9) && (i < -8) : " + result);		//true.		||조건은 두 조건식 중 하나라도 참이면 true./
		
		/*
		 * A : 65
		 * Z : 90
		 * a : 97
		 * z : 122
		 */
		
		result = (ch >= 'a' && ch <= 'z');		//소문자인지 확인하는 조건문.
		System.out.println("(ch >= 'a' && ch <= 'z') : " + result); 	//true
		
		result = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');		//해당문자가 알파벳인지 확인하는 조건문.	true
//		result = (ch >= 'a' && ch <= 'z') && (ch >= 'A' && ch <= 'Z');		//false
		System.out.println("알파벳 여부 : "  + result); 		
		
	}
}
