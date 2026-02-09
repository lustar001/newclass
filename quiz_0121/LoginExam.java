package quiz_0121;

public class LoginExam {

	public static void main(String[] args) {
		
		
		Member m1 = new Member("a1","aa1");
		Member m2 = new Member("b1","bb1");
		
		Naver naver = new Naver(); 
		naver.join(m1);
		naver.join(m2);
		
		//naver.login("a1","aa1");
		naver.login("a1","aaa1");
		
		

	}

}
