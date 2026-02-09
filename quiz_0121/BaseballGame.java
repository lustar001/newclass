package quiz_0121;

import java.util.Scanner;

public class BaseballGame {

	NumberGenerator ng = new NumberGenerator();

	public void play(int[] number) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int[] player = new int[3];

		while (true) {

			int strike = 0;
			int ball = 0;

			System.out.println("[숫자 3개를 입력해주세요]");

			for (int i = 0; i < 3; i++) {
				player[i] = scan.nextInt();
			}

			   for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                if (i == j && player[i] == number[j]) {
		                    strike++;
		                } else if (i != j && player[i] == number[j]) {
		                    ball++;
		                }
		            }
		        }
			System.out.println("현재 " + strike + "스트라이크 " + ball + "볼 ");
			
			if(strike == 3) {
				System.out.println("3스트라이크 정답입니다@");
				break;
			}
		}

	}

	void checkScore() {

	}

}
