package sec05._static;

import java.util.Scanner;

public class Calc {

	
	String color; 
	// 어차피 변수이긴 하다 
	// 정적멤버, 공용변수, 클래스 변수 
	static double pi = 3.14;
	
	//static int price;
	//price = 100;
	
//	Calc() {
//		this.price = 100; 
//	}
	
	static int price; 
	
	static {
		System.out.println("으잉?");
//		Scanner s = new Scanner(System.in);
//		price= s.nextInt() + 10;
	}
	
	// price = 100; 
	Calc(){
		
		System.out.println("Calc 생성자 실행");
		//this.price = a + 100; 
	}
	
	// this 는 new 가 된 나, 즉 , 인스턴스를 뜻하므로
	// new 이전에 사용할 수 있는 static에서는 못쓴다. 
	
	
	static void test() {
		System.out.println("잘 된다");
	}
	
}
