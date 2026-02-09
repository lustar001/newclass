package sec06._package.pack3;

//import sec06._package.pack1.Edu;
//import sec06._package.pack1.Human;
//import sec06._package.pack2.Human; // 동일한 클래서명이라 안된다
import sec06._package.pack1.*;  //내 폴더만 가져온다 


public class HumanExam {

	public static void main(String[] args) {
		
// 		sec06._package.pack1.Human h1 = new sec06._package.pack1.Human();
		
	//	import sec06._package.pack1.Human; // 이걸 이용해서 편하게 이용 가능 
		Human h1 = new Human() ; 
		
		Edu e1 = new Edu();
		
		// 하위 패키지의 클래스는 가져오지 않는다. 
	//	new Sub1(); 
		
		// import java.lang.* 
		// 자동선언 되어서 import 생략 가능 
		String a = "a";
		System.out.println(a + Math.random());
				
	}

}
