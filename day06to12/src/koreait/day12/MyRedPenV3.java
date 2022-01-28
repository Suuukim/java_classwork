package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV3 {
	public static void main(String[] args) {
		
		
//	0) MathProblem.java 클래스 객체들을 ArrayList를 이용하여 저장합니다. (참조값 저장.)
		
//	1) 덧셈문제 10개 생성하여 addList 변수로 참조합니다.변수이름으로 참조합니다
		ArrayList<MathProblem> addList = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);
		
		int ans;
		int cnt=0;	//맞은개수 카운트
		
		System.out.println("--------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------------");
		//여기서부터
		System.out.println("시작합니다.");
		
		for(int i=0;i<5;i++) {
			
			MathProblem p1 = new MathProblem('+');
			addList.add(p1);
			p1.makeProb();	//문제 만드는 메소드 : 연산종류에 따라 숫자가 다른범위 난수로 만들어집니다.
			//p1.print();          
			System.out.print("문제 "+(i+1)+ ".  " + p1 +  "답 입력 : ");
			ans = sc.nextInt();
			if(ans == p1.showAnswer()) {
				cnt++;	p1.setCorrect(true);	// boolean correct= true; 
			}
		}
			//for end
			System.out.println("--------------------------------");
			System.out.println("채점 합니다. 맞은 개수 " + cnt + " ( " + (cnt*20) + " 점)");
			System.out.println(":::::::틀린문제 다시보기::::::");
			for(MathProblem prob : addList)	// for( 변수를 선언하여 리스트에 있는 데이터 하나씩 반복 : 리스트)
				if(!prob.isCorrect())
					System.out.println(prob + " 정답 : " + prob.showAnswer());
			sc.close();
		}
		//계속할까요? -> 연산자를 선택할수 있도록. 그 기능을 추가해서 V4를 만들어 보세요.(주말 미션입니다.)

	}
