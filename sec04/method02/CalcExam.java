package sec04.method02;

public class CalcExam {
	// 선언 ()
	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.powerOn();
		// 실행()\
		int a = calc.plus(5, 7);
		System.out.println("a: " + a);

		// 호출할 때 이름과 전달인자를 꼭 맞춰야 실행
		// calc.plus();

		int i = 4;
		a = calc.plus(i, 8);
		
		// calc.plus(5,7)  +3
		// calc.plus( calc.plus(5,7),3)
		
		double b = calc.divide(3,2);
		System.out.println("b: "+ b);
		
		///////////////////
		//num = scanner.nextLine();
		String c = calc.num;
		System.out.println(c);
		
		//calc.fitness("덤벨",20,5);
		
	}

}
