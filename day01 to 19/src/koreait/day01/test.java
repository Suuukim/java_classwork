package koreait.day01;

public class test {
	public static void main(String[] args) {
	
		int number = 10;

		int num = number > 5 ? 1 : 0;
		System.out.println(num);
		System.out.println(number);
		
		
		int sum = 13;
		sum += 2;				// sum = sum + 2;
		System.out.println("sum += " + sum);

		sum -= 2;				// sum = sum - 2;
		System.out.println("sum -= " + sum);
		
		sum *= 2;				// sum = sum * 2;
		System.out.println("sum *= " + sum);
		
		sum /= 2;				// sum = sum / 2;
		System.out.println("sum /= " + sum);
		
		sum %= 2;				// sum = sum % 2;
		System.out.println("sum %= " + sum);
		
		
		
		
	}
	
}
