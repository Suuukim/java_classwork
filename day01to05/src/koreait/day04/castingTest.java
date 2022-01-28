package koreait.day04;

public class castingTest {
public static void main(String[] args) {
//	문제1. 다음중 자동형 변환(캐스팅)이 될수 없는 것은? (답 개수는 ? 3-1번, 5번)
	short b_val;
	int i_val = 87;
	long l_val;
	char ch1='s';
	double d_val=7.345;
	
//	(1)l_val = 234;		// l_val -> 8바이트 , 234 -> 4바이트
//	(2)b_val=23;			// b_val -> 2바이트 , 23 -> 4바이트	정수는 int 4바이트 보다 작은 리터럴 없어서 자동캐스팅
//	(3)i_val = ch1; 		// i_val -> 4바이트 , ch1 -> 2바이트
//	(3-1)b_val=ch1;			// b_val -> 2바이트 , ch1; -> 2바이트   
//	2바이트(음수와 양수) = 2바이트 (양수값만) -> 2바이트 (양수값만) -> 오류 (강제캐스팅 (short)필요)
//	(4)d_val = i_val;		// d_val -> 8바이트 , i_val -> 4바이트
//	(5)i_val = d_val;		// i_val -> 4바이트 , d_val -> 8바이트
	
//	문제2. 클래스 타입의 변수가 참조하는 데이터는 무엇이라 할까요?
//	-> 객체.
	
	}
}
