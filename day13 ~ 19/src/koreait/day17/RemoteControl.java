package koreait.day17;

public interface RemoteControl {
	
	//public static final 생략
	//초기값 필요함.
	int MAX_VOLUME = 20;
	int MIN_VOLUME = 0;
	
	
	//public abstract 생략
	void setVolume(int volume);
	void turnOnOff();		//toggle 기능으로 구현 합니다.
	
	//default : 인스턴스 메소드 (인터페이스를 구현한 클래스가 많은 상태입니다. 그런 인터페이스에 새로운 재정의 할수 있는 메소드를 추가하고 싶다.)
	//			그런 인터페이스에 새로운 재정의 할 수 있는 메소드를 추가하고싶다. -> 추상메소드는 안되고 인스턴스메소드는 가능합니다. 
	//			-> 구현 클래스에서 재정의 할 수 있습니다. 그 때 활용하는 것이 default 메소드 입니다.
	
	default void setMute(boolean mute) {	//toggle 기능으로 구현 가능합니다.
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	default void setBettery() {		//나중에 만든 인스턴스 메소드 : 오류발생 없습니다.
		
	}
	
	//static
	static void changeBattery() {			//나중에 만든 인스턴스 메소드 : 오류발생 없습니다.
		System.out.println("건전지를 교환합니다.");
	}
	
}
