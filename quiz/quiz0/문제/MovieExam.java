package quiz.quiz0.문제;

public class MovieExam {

	public static void main(String[] args) {
		
		Movie show1 = new Movie();
		Movie show2 = new Movie();
		Movie show3 = new Movie();
		
		show1.setName("아바타");
		show2.setName("짱구극장판");
		show3.setName("시스터");
		
		show1.setYear(2025);
		
		
		String title1 = show1.getName();
		String title2 = show2.getName();
		String title3 = show3.getName();
		int titl1 = show1.getYear();
		
		
		System.out.println("영화이름: "+ title1);
		System.out.println("영화이름: "+ title2);
		System.out.println("영화이름: "+ title3);
		
		
		
	}

}
