package quiz_0123;

import java.util.Scanner;

public class CafeExam {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		Cafe cafe = null;

		while (run) {
			System.out.println("\n==== 카페 프로그램 ====");
			System.out.println("1. 메뉴 선택 || 2. 종료");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("\n[커피 종류]");
				System.out.println("1. 아메리카노 (3000원)");
				System.out.println("2. 카페라떼 (4000원)");
				System.out.println("0. 처음으로");
				System.out.print("선택 ▶ ");
				int drink = sc.nextInt();

				if (drink == 0) continue;

				if (drink == 1) {
					cafe = new Cafe("아메리카노", 3000);
				} else if (drink == 2) {
					cafe = new Cafe("카페라떼", 4000);
				}

				// 옵션 선택
				System.out.println("\n[옵션 선택]");
				System.out.println("1. 샷 추가 (+500)");
				System.out.println("2. 시럽 추가 (+500)");
				System.out.println("3. 없음");
				System.out.print("선택 ▶ ");
				int opt = sc.nextInt();

				if (opt == 1) {
					cafe.addShot();
				} else if (opt == 2) {
					cafe.addSyrup();
				}

				System.out.println("\n[선택 확인]");
				cafe.showInfo();

			} else if (menu == 2) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		sc.close();
	}
}