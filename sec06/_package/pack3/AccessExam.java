package sec06._package.pack3;

import sec06._package.pack1.Edu;
import sec06._package.pack2.Access2;

public class AccessExam {

	public static void main(String[] args) {
		
		// public 이 아니여서 생성 못함 
	//	new Access1();
		
		Access2 a2 = new Access2(); 
		Edu edu = new Edu();
		
	// 	a2.d1 = 10; 
		a2.p1 = 100;
		
	//	a2.d();
		a2.p();
		
		// public 이 없는 class 
		// import 조차 안됨
	//	Access3 a3 = new Access3();
		
	//	a2.hp =10;
	}

}
