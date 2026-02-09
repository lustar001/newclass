package sec02;

public class CarExam {

	static int a = 10;	
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		myCar.company = "벤틀리";
		System.out.println(myCar.company);
		
		System.out.println(myCar.speed);
		myCar.speed = 170; 
		System.out.println(myCar.speed);
		
		Car myCar2 = new Car(); 
		System.out.println(myCar2.company);
		
		System.out.println("a: "+ a);
	}

}
