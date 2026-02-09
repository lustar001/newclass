package chap05;

public class EnumExam_06 {

	public static void main(String[] args) {
		
		Week week; 
		Week week2; 
		
		week = Week.금;
		
		System.out.println(week);
		
		if(week == Week.월) {
			System.out.println("월요일");	
		} else if(week == Week.금) {
			System.out.println("금요일");
		} else {
			System.out.println("다른 요일");
		}
		
		
	}

}
