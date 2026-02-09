package quiz_0121;

import java.util.ArrayList;

public class Naver {

	// 필드 - 회원목록
	ArrayList<Member> members = new ArrayList<Member>();

	// 회원가입받기
	// 필드에 저장한다
	//
	// 메소드명 : join
	// 전달인자 : Member
	// 리턴타입 : 없음
	void join(Member member) {
		this.members.add(member);
	}

	// 로그인
	// 기능 : 회원 목록 전체에서
	// 아이디, 비번 &&로 비교
	// 찾으면 결과에 따라 출력 다르게
	// 메소드명 : login
	// 전달인자 : 아이디, 패스워드
	// 리턴타입 : 없음

	void login(String id, String pw) {

		boolean flag = false;
		for (int i = 0; i < members.size(); i++) {
			Member m = members.get(i);

			if (m.id.equals(id) && m.password.equals(pw)) {
				flag = true;
				break;
			}
//				System.out.println("메인페이지");
//				
//			} else {
//				System.out.println("아이디 또는 패스워드가 다릅니다");
//			}

		}

		if (flag) {
			System.out.println("메인페이지");
		} else {
			System.out.println("아이디 또는 패스워드가 다릅니다");
		}
	}

}
