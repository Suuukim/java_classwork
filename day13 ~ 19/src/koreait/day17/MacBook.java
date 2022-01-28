package koreait.day17;

public class MacBook extends SmartMachine {
	//SmartMachine 은 이미 RemoteControl, WebSearch 인터페이스 구현했습니다.

	//인터페이스의 인스턴스 (default) 메소드를 재정의 할 수 있습니다.
	@Override
	public void setMute(boolean mute) {
		System.out.println("mute 기능 없습니다.");
	}
	@Override
	public void setBettery() {
		System.out.println("영구적인 배터리 사용 가능합니다.");
	}
	
}
