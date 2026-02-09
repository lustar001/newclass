package sec06._package.pack1;

public class Access1 {

	Access1(){
		System.out.println("Access1 생성자 실행");
	}
	
}

// 다른 패키지에서 안보이는 class
class Access3{
	// 다른 패키지에서 사용할 기회도 없다
	public Access3() {}
}