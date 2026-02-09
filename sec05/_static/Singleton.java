package sec05._static;

public class Singleton {

//	// Singleton singleton = null;
//	static Singleton singleton = null;
//
//	// Singleton get() {
//	static Singleton get() {
//		if (singleton == null) {
//			singleton = new Singleton();
//
//		}
//
//		return singleton;
//	}
	
	static Singleton singleton = new Singleton();
	
	private Singleton() { } 
	
	static Singleton get() {
		return singleton;
	}
}
//heap 영역에 주소가 같게끔 