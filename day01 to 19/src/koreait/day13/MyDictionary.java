package koreait.day13;


import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {
	public static void main(String[] args) {
		
		TreeMap<String, String> mydic = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String sel,eng,kor;
		System.out.println("선택기능 	1. 단어저장	2. 단어검색	3. 단어장보기	4. 프로그램끝내기");
		
		boolean run = true;
		while(run) {		// while 반복안에 switch로 종료조건을 동작시킬때 break로 못합니다. -> 변수를 사용했습니다.
			System.out.print("선택 -> ");
			sel = sc.nextLine();
			switch (sel) {
			case "1" :
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("Korean -> ");
				kor = sc.nextLine();
				if(mydic.containsKey(eng))
					{//존재하는 key값을 value를 ","로 구분하여 연결 저장합니다.
					String temp = mydic.get(eng);	//Map에 저장되어있는  value 가져옵니다.
					temp += "/" + kor;	
					mydic.put(eng,temp);
					}
				else mydic.put(eng, kor);
				break;
			case "2" :
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();		
				System.out.print("단어장에 검색했습니다. 결과 => " + mydic.get(eng));
				break;
			case "3" :
				System.out.println("단어장 전체보기 : " + mydic);
				break;
			case "4" :
				run=false;
				break;
			default:
				System.out.println("잘못입력된 선택입니다. 1~4중에 입력하세요.");
				break;
			}
		}
		System.out.println("::::: 너의 단어장 종료합니다. :::::");
	
	
	}
}
