package programmers.day1;

public class SolutionTest {		//한 파일에 여러개 클래스 작성 가능합니다. public은 1개만
								//public 클래스이름이 파일명입니다.

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		int[] numbers = {1,2,3,4,5,6,7,8,0};
		
		int result = sol.solution(numbers);
		
		
		
		System.out.println("result = " + result);
	
	}
}


class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        return answer;
    }
}