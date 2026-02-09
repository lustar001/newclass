package quiz.quiz0.문제;

public class CafeExam {

	public static void main(String[] args) {
		
		Cafe cop1 = new Cafe("red",21000);
		Cafe cop2 = new Cafe("blue",10000);

		
		System.out.println("상호: " + cop1.name +
				" 자본금: " + cop1.cost + 
				" 메뉴1: " + cop1.menu1 + 
				" 메뉴2: " + cop1.menu2);
	}

}
