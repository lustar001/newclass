package quiz.quiz0.문제;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {

		int answer = (int) (Math.random() * 10) + 1;
		int count = 0;
		// System.out.println("숫자입력하세요:" + answer);
		while (true) {
			System.out.println("번호를 입력해주세요");
			Scanner scan = new Scanner(System.in, "utf-8");
			int player = scan.nextInt();
//		UpDown(int number){
//			this.number = number; 
//		}
			count++;
			if (player == answer) {
				System.out.println("정답입니다");
				System.out.println(count + "번 만에 맞춤");
				break;
			} else if (player < answer) {
				System.out.println("UP");
			} else {
				System.out.println("DOWN");
			}
		}

	}
}
