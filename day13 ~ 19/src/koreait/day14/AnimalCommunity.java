package koreait.day14;

import java.util.Scanner;

public class AnimalCommunity {
	//반려동물 커뮤니티에는 무엇이 필요할까요? 용품, 공동구매, 반려<동물>분양, .... , <회원>
	public static void main(String[] args) {
		//동물클래스는 고양이 객체, 강아지 객체, 토끼 객체... 등을 참조하도록 합니다.
		//분양가능한 동물객체를 생성해서 참조하기
		Animal[] animals = new Animal[10];
		
		animals[0] = new Puppy("브라우니", "Brown");
		animals[1] = new Cat();
		animals[2] = new Rabbit("바니바니", "White");
		animals[1].setName("냥이");
		animals[1].setColor("Black");
		animals[3] = new Puppy();
//		animals[4] = new Animal(); //오류 : 추상클래스는 객체 생성 못합니다.
		
		//회원은 반려동물 분양. 
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for(int i=0;i<animals.length;i++) {
			if(animals[i]!=null)
				System.out.println((i+1) + ":" + animals[i]);	//자식클래스의 toStirng 재정의 내용으로 실행됩니다.
		}
		
		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.");
		for(int i=0;i<animals.length;i++) {
			if(animals[i] != null )animals[i].sound();
			
		}
		//분양을 원하면 회원생성을 합니다.
		Member sana = new Member("사나",15);
//		System.out.println("분양가능한지 확인 :" + sana.isAdopt(animals[0]));//true
//		System.out.println("분양가능한지 확인 :" + sana.isAdopt(animals[1]));//false
//		System.out.println("분양가능한지 확인 :" + sana.isAdopt(animals[2]));//true
//		System.out.println("분양가능한지 확인 :" + sana.isAdopt(animals[3]));//true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분야을 원하는 아이의 숫자를 선택해주세요. ->");
		int sel = sc.nextInt();
		
		System.out.print("선택하신" + animals[sel] + "는");
		if(sana.isAdopt(animals[sel])) {
			System.out.println("😄분양 가능합니다.");
		}else {
			System.out.println("😥아쉽지만 분양 하실수 없는 나이 입니다.");
		}
		
		System.out.println("TYPE 상수 필드 확인합니다.");
		System.out.println(Animal.TYPE);	//static 필드는 속해 있는 클래스로 구별합니다.
		System.out.println(Cat.TYPE);
		System.out.println(Puppy.TYPE);
		System.out.println(Rabbit.TYPE);
	}	
}
