package quiz_0121;

public class Reservation {

	int duration = 10;
	int chkin;
	int chkout;
	
	void setting() {
		
		if (chkout - chkin + 1 < 10) {
		System.out.println("시작일: " + chkin + "종료일: " + chkout);
		} else {
			System.out.println("날짜를 다시 선택해주십시오");
		}
	}
	
	
}
