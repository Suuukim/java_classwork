package koreait.day06;

import java.util.Scanner;

public class StudentTest {

	int num;
	String name;
	int korean,english,science;
	
	
	void inputdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");	this.name = sc.nextLine();
		System.out.print("번호 : ");	this.num = sc.nextInt();
		System.out.print("국어점수 : ");	this.korean = sc.nextInt();
		System.out.print("영어점수 : ");	this.english = sc.nextInt();
		System.out.print("과학점수 : ");	this.science = sc.nextInt();
	}
	
	void printscore() {
		System.out.println("번호 : " + num + "   이름 : " + name + 
				"   국어점수 : " + korean +
				"   영어점수 : " + english +
				"   과학점수 : " + science);
	}
	
	int sum() {
		return (korean + english + science);	
		}
	
	double avg() {
		return (double)sum()/3;
	}
	
	
}
