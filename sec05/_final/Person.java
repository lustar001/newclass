package sec05._final;

public class Person {

	final String nation = "Korea";
	final String ssn; 
	
	
	// final 
	// 값을 할당한 경우 변경할 수 없게 막아줌 
	Person(String ssn){
//		this.nation = "asdf";
		// 선언할 때 값이 없으면 
		// 딱 한번 할당할 수 있다. 
		this.ssn = ssn;
	// 	this.ssn = ssn;
		
		int[] a = new int[3];
	//	a.length = 30; // final 변수 
	}
	
}
