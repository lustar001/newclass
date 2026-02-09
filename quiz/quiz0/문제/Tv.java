package quiz.quiz0.문제;

public class Tv {
	int channel; 
	int volume = 10;
	boolean buttom; 
	
	void powerOn() {
		buttom = true; 
		System.out.println("TV전원을 켭니다. ");
	}
	
	void powerOff() {
		buttom = false; 
		System.out.println("TV전원을 끕니다.");
	}
	
	void volDown() {
		if (volume > 0 && volume<=10) {
			System.out.println("볼륨을 줄입니다.");
			volume--; 
			System.out.println("현재 볼륨: " + volume);
		} else if(volume == 0 ) {
			System.out.println("음소거");
		} 
	}
	
	void volUp() {
		if (volume > 0 && volume<10) {
			System.out.println("볼륨을 높입니다.");
			volume++; 
			System.out.println("현재 볼륨: " + volume);
		} else if (volume == 10) {
			System.out.println("최대볼륨입니다.");
		} 
	}
	
	void channel(int channel) {
		this.channel = channel;
		System.out.println("현재 채널: " + channel);
	}
	
	void setting() {
		if (buttom = true) {
		System.out.println("현재상태보기 - 전원켜짐, 볼륨 :" + volume + "채널: " + channel);
		} else {
			System.out.println("티비 꺼짐");
		}
	}
	
}
