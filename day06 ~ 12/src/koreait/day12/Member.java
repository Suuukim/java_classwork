package koreait.day12;

public class Member {
	int id;
	String name;
	
	public Member() {
		
	}
	
	public Member(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	void print() {
		System.out.println("id : " + id + ", name : " + name);
	}
	
	@Override	//단축키 : ctrl + shift + s
	public String toString() {	//최상위 클래스 object의 toStirng()메소드를 재정의.
//		return "Member [id=" + id + ", name=" + name + "]";
		return "id=" + id + ", name=" + name ;
	}
	
	
}
