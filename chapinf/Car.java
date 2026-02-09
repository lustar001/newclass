package chapinf;

public class Car {

	String brand; 
	String model; 
	int maxSpeed;
	
	Car(String b, String m, int s) {
		brand = b; 
		model = m;
		maxSpeed = s;
	}
	
	void printCarInfo() {
		System.out.println("브랜드: " + brand + ", 모델: " + model + ", 최대속도: " + maxSpeed );
	}
}
