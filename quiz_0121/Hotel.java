package quiz_0121;

public class Hotel {
	int family;
	boolean pet;
	boolean bbq;
	int count;
	int pick = 1;

	Hotel(int family, boolean pet, boolean bbq) {
		this.family = family;
		this.pet = pet;
		this.bbq = bbq;
	}

	void reservation1(int date) {

		if (date > 0 && date < 10) {
				count = count + date;
			if (count > 10) {
				System.out.println("1번방 예약이 꽉찼습니다. 다른 빈 객실을 이용해주세요");
				
			} else {
				System.out.println("1번 방 " + pick + "일에 총" + date + "일 예약되었습니다.");
				System.out.println("시작일: " + pick + "일 & 종료일: " + (pick + date-1) + "일");
				pick = pick + count;
			}

		}

	}

	void reservation2(int date) {

		if (date > 0 && date < 10) {
				count = count + date;
			if (count > 10) {
				System.out.println("2번방 예약이 꽉찼습니다. 다른 빈 객실을 이용해주세요");
				
			} else {
				System.out.println("2번 방 " + pick + "일에 총" + date + "일 예약되었습니다.");
				System.out.println("시작일: " + pick + "일 & 종료일: " + (pick + date-1) + "일");
				pick = pick + count;
			}

		}

	}
}
