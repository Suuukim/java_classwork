package koreait.day06;

public class StudentTest2 {
	public static void main(String[] args) {
		
		StudentTest stu = new StudentTest();
		
		stu.inputdata();
		stu.printscore();
		System.out.println("합계 : " + stu.sum());
		System.out.printf("평균 : %.3f" , stu.avg());
		
	}
}
