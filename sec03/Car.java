package sec03;

public class Car {

//	Car() {
//		System.out.println("Car 생성자 실행");
//	}
	//생성자를 생략한경우 
	// 즉, 생성자가 하나도 없는 경우
	// 기본 생성자가 자동 완성된다
	// 반대로 생성자가 있으면 기본 생성자는 안만들어진다.
	
// 	Car(){ } //기본생성자
	
	//String brand = "KIA"; 
	String brand;
	
//	Car(){
//		// 보통 생성자는 
//		// 필드값을 초기화 하는데 많이 사용된다
//		brand = "KIA";
//	}
	
	// 기본 생성자 생성 안됨 why? 
//	Car(String b){
//		brand = b; 
//	}
	
//	Car(){ //무조건 예외 발생
//		int b = 5 / 0 ;
//	}
	
	
	String model; 
	int maxSpeed; 
	Car(String b, String m, int ms){
		brand = b; 
		model = m; 
		maxSpeed = ms; 
	}
	
	// 생성자 오버로딩 가능 
	Car(){
//		brand = "현대";
//		model = "그랜저";
//		maxSpeed = 240; 
		
		// 다른 오버로딩된 생성자 호출 : this()
		// 무조건 가장 먼저 실행되어야 한다. 
		this("현대","그랜저",240);
		System.out.println("다른 생성자 호출 이후 실행");
	}
	
	
	
	
	
}

	class Book {
		String title; 
		int price; 
	}
