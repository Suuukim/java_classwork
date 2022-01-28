package koreait.day10b;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen {
	public static void main(String[] args) {
//		*실행화면*
//		----------------------------------------------------------
//		빨간펜 수학 2자리 덧셈 문제 풀기
//		----------------------------------------------------------
//		시작합니다
//		문제1. 	23 + 56 = 답 입력 ->
//		문제2. 	33 + 19 = 답 입력 ->
//				:
//		문제 10. 28 + 32 = 답 입력 ->
//		---------------------------------------------------------
//		채점합니다. 맞은 개수 ...(.. 점)
//
//		추가 기능 : 틀린 문제 다시 보기 (배열), 계속하시겠습니까?(반복)
//
//		처리 조건 : 문제 숫자들은 난수이고 2자리 숫자로 하세요.
//		코딩 순서 : 1. 반복문을 작성합니다.
//				 2. 출력문을 작성합니다. - 반복문에 포함된것, 포함되지 않은것
//				 3. 변수값을 사용하는 출력문은 변수를 적용합니다.
//		 	     4. 필요한 변수들을 선언합니다.
//				 5. 난수 필요한 경우 난수값을 변수에 저장합니다.
//				 6. 계산식이 필요한 부분을 찾아 계산식을 작성합니다.
//				 7. 실행결과를 테스트하여 결과를 보면서 잘못된 부분의 명령문을 수정합니다.
//		*틀린문제 다시보기를 하려면 3개의 배열이 필요합니다. (덧셈의 첫번쨰 값 저장배열, 두번째 값 저장배열, 문제번호 저장배열)
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();			
	
	
		
	int[] n1= new int[10];			//문제 횟수 (10개)
	int[] n2= new int[10];			//
	int[] n3= new int[10];			//
	boolean check;						//정답확인
	int ans;
	int cnt = 0;
	int k=0;
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("시작합니다.");
		int i;
		for(i= 1; i<n1.length; i++) {
			int num1 = rnd.nextInt(99)+1;	
			int num2 = rnd.nextInt(99)+1;
			System.out.print("문제" + i +". " + num1 +"+"+ num2+ "= ");
			ans = sc.nextInt();
			if(ans==(num1 + num2)) {
				cnt++;
			}else {
				n1[i] = k;
				n2[i] = k;
				n3[i] = k;
				k++;
			}
		}
			System.out.println("정답개수" + cnt);
			System.out.println("틀린 개수" + k);
//	System.out.println("문제"+ i +  + "+" +  "=");
//	System.out.println("채점합니다. 맞은 개수 : "+ + +"( "+")점" );
//		
		
	}
}

