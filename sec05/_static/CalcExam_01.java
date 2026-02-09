package sec05._static;

public class CalcExam_01 {
	
	int a = 10;

	public static void main(String[] args) {
		// 언급되는 순간 
		// static 을 모두 로딩한다(처리한다)
		double p = Calc.pi; 
		
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		
		c1.color = "하늘색";
		c2.color = "핑쿠";
		
		System.out.println(c1.color);
		System.out.println(c2.color);
		
		System.out.println(c1.pi);
		c1.pi = 3.141592653;
		System.out.println(c2.pi);
		
		System.out.println(Math.PI);
		
		
		Calc.test();
		
		// this.eat(); 
		// CalcExam_01 c = new CalcExam_01();
		
		// static 에서는 static만 사용가능하다  
	}
	
	void eat() {
		System.out.println("먹는다");
	}
}
