package quiz.quiz0.문제;

public class Fan {

	int wind; // 세기 0 약풍 1 강풍
	boolean start;

	void powerOn() {
		start = true;
		System.out.println("전원을 켭니다");
	}

	void powerOff() {
		start = false;
		System.out.println("전원을 끕니다");
	}

//	Fan(int wind){
//		this.wind = wind;
//	}

	void setting1() {

		if (start == false) {
			System.out.println("선풍기를 켜주세요.");
		} else if (wind == 0){
			System.out.println("약풍입니다");
		}
	}

	void setting2() {

		if (start == false ){
			System.out.println("선풍기를 켜주세요.");
		} else if (wind == 1){
			System.out.println("강풍입니다.");
		}

	}

}
