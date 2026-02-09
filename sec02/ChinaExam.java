package sec02;

public class ChinaExam {

	public static void main(String[] args) {
		
		
		// 객체 생성
		China china1 = new China();
		//System.out.println(china1.name);
		china1.name = "동부반점";
		System.out.println("상호명: " + china1.name);
		china1.address = "서울";
		System.out.println("주소: " + china1.address);
		
		// 필드값 변경 
		china1.menus[0] = "차돌짬뽕";
		china1.menus[1] = "볶음밥";
		System.out.println("메뉴: " + china1.menus[0] + "," + china1.menus[1]);
		
		
		China china2 = new China();
		
		// 필드값 읽기
		System.out.println("상호명: " + china2.name);
		System.out.println("주소: " + china2.address);
		System.out.println("메뉴: " + china2.menus[0] + "," + china2.menus[1]);
		 

	}

}
