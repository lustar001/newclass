package quiz.quiz0.문제;

public class Login {

	String id;
	String password;

	Login(String id, String password) { // 생성자
		this.id = id;
		this.password = password;
	}

	void newAccount() {  // 새로운 회원 
		System.out.println();
	}

	void info() {  // 출력값 
		System.out.println("회원아이디: " + id + "회원비밀번호: " + password);
	}

	void logiin(Compare b1, Login[] ms) {  // 비교문 
		
		for (int i = 0; i < ms.length; i++) { // 틀린것 확인 !
			if (b1.id.equals(ms[i].id) && b1.password.equals(ms[i].password)) {
				System.out.println("메인페이지 이동");
			} 
			
		}
		System.out.println("다시 로그인 하세요 ");
	}

}

class Compare {
	String id;
	String password;
	
	Compare(String id, String password){
		this.id = id; 
		this.password = password;
	}
	
	
}
