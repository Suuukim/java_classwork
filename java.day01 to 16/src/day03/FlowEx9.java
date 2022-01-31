package day03;

public class FlowEx9 {
	public static void main(String[] args) {
		//이중 for문
		
		//구구단 세로버젼
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\n", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
		//구구단 가로버젼
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%3d X %d = %2d", i, j, i*j);
			}
			System.out.println();
		}
	
	
	
	}
}
