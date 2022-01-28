package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	//반려동물 커뮤니티에는 무엇이 필요할까요? 용품, 공동구매, 반려<동물>분양, .... , <회원>
	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Puppy("브라우니", "Brown")); //index 0
		animals.add(new Cat());		//index 1
		animals.add(new Rabbit("바니바니", "White"));	// index 2
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]");
		animals.get(1).setColor("black");
		animals.get(1).setName("냥이");
			
		for(int i=0;i<animals.size();i++)	//list의 size()는 데이터갯수를 반환.
			System.out.println((i+1) + ":" + animals.get(i));
		
		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.");
		for(int i=0;i<animals.size();i++) {
			animals.get(i).sound();
		}
		Member sana = new Member("사나",15);
		Scanner sc = new Scanner(System.in);
		System.out.print("분야을 원하는 아이의 숫자를 선택해주세요. ->");
		int sel = sc.nextInt();
		
		System.out.print("선택하신" + animals.get(sel-1) + "는");
		if(sana.isAdopt(animals.get(sel-1))) {
			System.out.println("😄분양 가능합니다.");
		}else {
			System.out.println("😥아쉽지만 분양 하실수 없는 나이 입니다.");
		}
	
	}	
}
