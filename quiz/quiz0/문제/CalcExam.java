package quiz.quiz0.문제;

public class CalcExam {
	
	public static void main(String[] args) {
		
		Calc c1 = new Calc(); 
		double a = c1.calc(3, "+", 0);
		System.out.println(a);
		
		a = c1.calc(3, "/",0);
		System.out.println(a);
		
		c1.viewLog(); 
		c1 = null;
	}
}
