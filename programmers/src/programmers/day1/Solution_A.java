package programmers.day1;

import java.util.Scanner;

public class Solution_A {
//		프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//		전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

//		제한 조건
//		s는 길이 4 이상, 20이하인 문자열입니다.
//		입출력 예
//		phone_number	return
//		"01033334444"	"*******4444"
//		"027778888"	"*****8888"
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("전화번호를 입력하세요 -> ");
			String number = sc.nextLine();
			System.out.println(solution(number));
		}
	
		static String solution(String phone_number) {
		        String answer = "";

		        String front = "";
		        String back = "";
		        for(int i = 0; i < phone_number.length()-4; i++){
		            answer += "*";
		        }

		        back = phone_number.substring(phone_number.length()-4,phone_number.length());
		        answer += back;

		        return answer;
		    }
}
