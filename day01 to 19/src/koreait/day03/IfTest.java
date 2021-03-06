package koreait.day03;

import java.util.Scanner;

public class IfTest {	//boolean 자료형과 관계연산을 이용한 조건제어 연습합니다.

	public static void main(String[] args) {
		// if 문의 형식1 : if(조건관계식) {....A.... } else {....B ....}
		// 	A 는 조건관계식이 참일때 실행하는 명령문들
		// 	B 는 조건관계식이 거짓일때 실행하는 명령문들
		// 	A,B 가 명령문이 1개일 때는 {} 생략합니다.
		
		//응용 : point 가 100점 이상이면 회원등급 VIP , 100점 미만이면 일반회원 출력
		
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포인트 입력하세요. -> ");
		point = sc.nextInt();
		
		//if를 이용합시다.
		System.out.println("회원등급 ");
		if(point >= 100)
			System.out.println("VIP");
		else
			System.out.println("일반 회원");
		
		//point 가  70 이상이면 +100 을 추가 적립, 70 미만이면 +110을 추가적립
		//           "     "감사합니다."  ,      "    "또 오세요." 메시지 출력 
		//실행할 명령이 2문장 이상일때 { } 사용.
		
		if(point >= 70) {
			point += 100;
			System.out.println("100포인트 적립해 드렸습니다.");
			System.out.println("🎁 감사합니다.");
		}
		else {
			point += 110;
			System.out.println("110포인트 적립해 드렸습니다.");
			System.out.println("👍 또 오세요.");
		}
		System.out.println("현재 포인트 : " + point);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
