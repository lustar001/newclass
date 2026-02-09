package chap05;

import java.util.Scanner;

public class ArrayExam_02 {

	public static void main(String[] args) {
		// String 타입의 변수 '배열'
		/*
		 * 배열 array
		 * 
		 * 한 번에 여러 변수를 만드는 방법 같은 타입만 선언할 수 있음 생성할 때 전체 크기를 지정해줘야 함 생성된 여러 변수들은 index로
		 * 관리한다 index는 0번부터 시작
		 */

		// 선언 방법
		int[] a1; // java스타일
		int a3[]; // C 스타일

		// 배열 변수는 참조 타입이라서 null을 넣을 수 있다
		a1 = null;

		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 70;

		/*
		 * 첫 번째 [] : int[] int만으로 구성된 배열 변수 타입이다. 두 번째 [] : new int[30] 배열의 크기, 즉, 한 번에
		 * 만들 변수의 개수 세 번째 [] : score[0] 만들어진 변수 중에서 몇번째인가? index는 0부터 시작한다.
		 * 
		 */

		// 배열을 선언하는 첫번째 방법
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 85;
		score[2] = 70;
		// score[3] = null; int는 null 안됨

		System.out.println("score[0]: " + score[0]);

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30
		// out of bounds for length 30
		// at chap05.ArrayExam_02.main(ArrayExam_02.java:48) 길이가 30이라 0~29까지 가능한데 범위를
		// 벗어났다
//		score[30] = 2; 

		String[] str = new String[3];
		System.out.println("str[0]: " + str[0]);
		System.out.println("score[5]: " + score[5]);

		// int a;
		// System.out.println(a);
		// 배열 생성 후 기본값
		// 0, false, null로 초기화 됨

		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 알고 있는 경우
		int[] i1 = new int[] { 90, 85, 70 };
		System.out.println("i1[1]: " + i1[1]);

		// 선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[] { 90, 85, 70 };

		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용가능
		// new int[]를 생략할 수 있다.
		int[] i3 = { 90, 85, 70 };
		// i3 = {90, 85, 70}

		int sum = 0;
		// sum = sum + i3[0];

		for (int i = 0; i < 3; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum / 3.0);

		sum = 0;
		System.out.println("배열의 길이: " + i3.length);
		for (int i = 0; i < i3.length; i++) {
			sum = sum + i3[i];
		}
		// 순차적 연습
		// 5개 변수를 한번에 만들기
		// 5개 크기의 int 배열 만들기
		int[] a5 = new int[5];
		a5[0] = 1;
		a5[1] = 2;

		// 문제1
		// 첫번째 반복문에서
		// 10개의 변수에 각 1~10까지담기
		// 두번째 반복문에서
		// 모든 값을 순서대로 출력

		int[] j10 = new int[10];
		for (int j = 0; j < j10.length; j++) { // j는 0~9
			j10[j] = j + 1;
			// System.out.println("j10[" + j + "] = " + (j+1) );

		}

		System.out.println("모든 값을 순서대로 출력");
		System.out.print("j10[] ={");
		for (int j = 0; j < j10.length; j++) {

			System.out.print(j10[j]);
		}
		System.out.print("}");

		System.out.println();
		// null인지 혹시 몰라서 출력
		System.out.println("args: " + args);

		System.out.println("-------------------");
		System.out.println("개수 : " + args.length);

		if (args != null) {
			for (int a = 0; a < args.length; a++) {

				System.out.println(args[a]);
			}
		}

		// 문제2
		// 7,12,8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에도 7,12,8로 순서대로 저장하시오
		// 단 b = a 안됨

		int[] z2 = null;
		z2 = new int[] { 7, 12, 8 };
		int[] z3 = null;
		for (int q = 0; q < z2.length; q++) {

			System.out.println("z3[" + q + "] =" + z2[q]);
		}

		System.out.println("문제2완--------------");
		System.out.println();
		System.out.println();

//		강사님 풀이 		
//		int[] d = {7,12,8};
//		int[] f = new int[d.length];
//		for (int i=0; i<d.length ; i++) {
//			f[i] = d[i];
//		}

		// 문제3
		// 7,12,8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에도 8,12,7로 순서대로 저장하시오

		for (int q = 0; q < z2.length; q++) {

			System.out.println("z3[" + q + "] =" + z2[2 - q]);
		}

		System.out.println("문제3완--------------");
		System.out.println();
		System.out.println();

		// 문제4
		// (3,4,7,5,1,4,6}
		// 4-1. 배열에서 홀수의 개수 구하기
		// 4-2. 4보다 큰 수의 개수 구하기

		int[] z4 = { 3, 4, 7, 5, 1, 4, 6 };
		int sum1 = 0;
		int count = 0;
		for (int w = 0; w < z4.length; w++) {
			if (z4[w] % 2 == 1) {
				sum1 = sum1 + 1;

			}
			if (z4[w] > 4) {
				count = count + 1;
			}
		}
		System.out.println("홀수의 개수는 " + sum1 + "개입니다");
		System.out.println("4보다 큰 수의 개수는 " + count + "개입니다.");
		System.out.println("문제4완-------------------");
		System.out.println();
		System.out.println();

		// 문제5(어려움)
		/*
		 * 마라톤에서 5명의 선수가 참여했음 선수들은 1번부터 5번까지 등번호 있음 대회가 끝났을 떄 완주하지 못한 선수를 찾으시오 완주 목록
		 * {2,4,5,1}
		 */

		int[] z6 = { 1, 2, 3, 4, 5 };
		int[] z6_1 = { 2, 4, 5, 1 };

		for (int v = 0; v < z6.length; v++) {
			boolean fin = false;
			for (int b = 0; b < z6_1.length; b++) {
				if (z6[v] == z6_1[b]) {
					fin = true;
					break;

				}
			}
			if (fin == false) { // = 대입 연산자 ==는 비교연산자
				System.out.println(z6[v]);
			}
		}

		for (int i = 0; i < z6.length; i++) {
			boolean finish = false; // boolean 여기다 두는 이유
			// for 문이 사라지면 j 의 결과는 사라짐

			for (int j = 0; j < z6_1.length; j++) {
				if (z6[i] == z6_1[j]) { // 마라톤 선수와 완주선수 비교
					finish = true; // 둘이 같으면 true
					break;
				}
			}
			if (finish == false) {
				System.out.println("완주 실패 : " + z6[i] + "번 선수");
			}
		}

		System.out.println("6666666666666666666");

		// 문제6
		// {3,4,7,5,1,4,6}
		// 여기서 가장 큰 수 찾기

		int[] z7 = { 3, 4, 7, 5, 1, 4, 6 };
		int num10 = z7[0];
		for (int r = 0; r < z7.length; r++) {
			if (num10 < z7[r]) {
				num10 = z7[r];
			}
		}
		System.out.println(num10);

		int[] z5 = { 3, 4, 7, 5, 1, 4, 6 }; // 배열
		int num = 0; // 비교할 변수 0 도 ok but z5의 첫번째 값으로 주면 음수가 나와도 해결가능
		for (int i = 0; i < z5.length; i++) { // for문 조건식
			if (num < z5[i]) { // 새로 준 변수와 기존 z5 1~i 까지 비교 큰수 num 대입
				num = z5[i];
			}
		}
		System.out.println(num);

		// int max = Integer.MIN_VALUE; //int 정수 가장 작은 값

		// if ( w == 2 ) {// 가장 큰 값을 가지는 w 값을 찾는건가유??
		// System.out.println("여기서 가장 큰 수는 " + z5[w] + "입니다");
		// }

		System.out.println("문제7");
		// 문제7
		// { 3, 4, 7, 5, 1, 4, 6 };
		// 두번째 큰 수 찾기

		num = z5[0];
		int num2 = z5[0];
		for (int i = 0; i < z5.length; i++) {
			if (num < z5[i]) {
				num = z5[i]; // num 은 7
			} else if (num > z5[i] && num2 < num) {
				num2 = z5[i];
			}
		}

		System.out.println("두번째로 큰수는 " + num2 + "입니다 ");

		System.out.println("문제8-------------");
		// 문제8
		// 오른쪽으로 한칸 씩 밀기 (왼쪽은0으로 채우기)
		// 예 :
		// 1라운드 : { 3, 4, 7, 5, 1, 4, 6 }
		// 2라운드 : { 0, 3, 4, 7, 5, 1, 4 }
		// 3라운드 : { 0, 0, 3, 4, 7, 5, 1 }

		// for (int i = z5.length-1 ; i >= 0 ; i--) {
		// z5[i] = z5[i+1];
		//
		// System.out.println("z5[" + i + "] = " + z5[i]);
		// }

		// 대체할 값 블록 처리해서 ctrl + f 해서 바꾸기
		for (int k = 0; k <= z5.length; k++) {
			for (int i = z5.length - 1; i > 0; i--) {
				z5[i] = z5[i - 1];
			}
			z5[0] = 0;

			for (int i = 0; i < z5.length; i++) {
				System.out.print("z5[" + i + "] = " + z5[i] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------");

		// 문제9
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로 보내기
		// 예 :
		// 1라운드 : { 3, 4, 7, 5, 1, 4, 6 }
		// 2라운드 : { 6, 3, 4, 7, 5, 1, 4 }
		// 3라운드 : { 4, 6, 3, 4, 7, 5, 1 }

		int[] z8 = { 3, 4, 7, 5, 1, 4, 6 };
		int arr = z8[z8.length - 1];
		for (int i = z8.length - 1; i > 0; i--) {
			z8[i] = z8[i - 1];
		}
		z8[0] = arr;

		for (int i = 0; i < z8.length; i++) {
			System.out.println("z8[" + i + "] = " + z8[i]);
		}

		System.out.println("-----------");

		arr = z8[z8.length - 1];
		for (int i = z8.length - 1; i > 0; i--) {
			z8[i] = z8[i - 1];
		}
		z8[0] = arr;

		for (int i = 0; i < z8.length; i++) {
			System.out.println("z8[" + i + "] = " + z8[i]);
		}

		System.out.println("-----------");

		// 문제10
		// 임시비밀번호 8자리
		// 10-1. 숫자만
		// 10-2. 소문자만
		// 10-3. 숫자 2개 이상, 대/소문자 각 1개 이상

		System.out.println("10-1 숫자만 -------------");
		int[] passq = new int[8];
		System.out.print("임의의 암호코드");
		for (int i = 0; i < 8; i++) {
			passq[i] = (int) (Math.random() * 10);
			System.out.print(passq[i]);
		}
		System.out.println();

		System.out.println("10-2 소문자만 -------------");

		char chaa = (char) ((Math.random() * 26) + 97);

		for (int i = 0; i < 8; i++) {
			passq[i] = (char) ((Math.random() * 26) + 97);
			System.out.print((char) (passq[i]));
		}
		System.out.println();

		System.out.println("10-3 숫자2개 이상, 대소문자 각 1개 이상");

		int[] mix = new int[8];

		int aa = 0;
		int bb = 0;
		int cc = 0;

		do {
			aa = 0; // do 안에서 초기값 0 필요!!!!
			bb = 0;
			cc = 0;

			for (int i = 0; i < 8; i++) {
				mix[i] = (int) (Math.random() * 3);

				if (mix[i] == 1) {
					passq[i] = (char) ((Math.random() * 10) + 48);
					aa = aa + 1;
				} else if (mix[i] == 2) {
					passq[i] = (char) ((Math.random() * 26) + 97);
					bb = bb + 1;
				} else {
					passq[i] = (char) ((Math.random() * 26) + 65);
					cc = cc + 1;
				}

			}

		} while (!(aa > 2 && bb > 1 && cc > 1));

		for (int i = 0; i < passq.length; i++) { // for 문으로 i값 다시 설정 후 출력하기
			char mmmix = (char) passq[i];
			System.out.print(mmmix);
		}
		System.out.println();

		// 문제11
		// 자리가 10개 있는 소극장의 예약 시스템
		// 자리 번호는 1~10번까지 번호의 자리가 있다
		// 메뉴 : "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료"
		// 조건 1 : 예약이 가능하다면 "n번 자리 예약되었습니다"
		// 조건 2 : 예약이 되어있다면 "이미 예약되어 있습니다."
		System.out.println("문제 11-------------");
		int i = 0;
		int[] seats = new int[10];
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예약 2. 모든 좌석 현황 3. 잔여 좌석 0. 종료");
			System.out.println("------------------------------");

			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				System.out.println("선택>" + menu);
				System.out.println("좌석을 선택하세요");
				int sn = scanner.nextInt();
				if (seats[sn - 1] == 1) {
					System.out.println(sn + "번 좌석은 이미 예약되었습니다.");
				} else {
					seats[sn - 1] = 1; // 예약 처리
					System.out.println(sn + "번 좌석이 예약되었습니다.");
				}
			} else if (menu == 2) {
				System.out.println("모든 좌석 현황");
				for (i = 0; i < seats.length; i++) {
					if (seats[i] == 0) {
						System.out.println((i + 1) + "(예약가능)");
					} else {
						System.out.println((i + 1) + "(예약석)");
					}
				}
			} else if (menu == 3) {
				System.out.println("잔여 좌석입니다");
				for (i = 0; i < seats.length; i++) {
					if (seats[i] == 0) {
						System.out.print((i + 1) + " ");
					}
				}
				System.out.println();
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("메뉴를 다시 입력해주세요");
			}

		} // Cwhile

		// 문제12
		// 로또 번호 6개 배열에 저장
		// 단, 중복 없이 !

		System.out.println("문제12------------");

		int[] lotto = new int[6]; // 로또 6자리
		boolean lucky;

		for (i = 0; i < lotto.length; i++) {

			// lotto i 배열

			do {
				lucky = false;
				lotto[i] = (int) ((Math.random() * 45) + 1);
				for (int j = 0; j < i; j++) {

					if (lotto[j] == lotto[i]) { // 조건 값이 같으면 true;
						lucky = true; // false 될 떄까지 반복
						break;
					}

				}
			} while (lucky); // while false
			System.out.print(lotto[i] + " ");
		}

		System.out.println();

		// 문제13
		// 주차장에
		// 0 : 주차되어 있음
		// 1 : 비어있음
		/*
		 * { {0, 0, 0, 0}, // 1층 {0, 0, 0, 1}, // 2층 {0, 0, 1, 0}, {1, 0, 1, 1}, {1, 1,
		 * 1, 1}, }
		 */
		// 13-1. 2층에 주차된 차량 수 출력
		// 13-2. 전체 남은 자리 수 출력

		System.out.println("문제13---------");
		int[][] park = { { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 } };

		int countp = 0;
		int val = 0;
		for (i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length; j++) {
				if (i == 1 && park[1][j] == 0) { // 2층에서 0일 떄
					countp = countp + 1;
					// 출력값
				}

			}
		}
		System.out.println("2층에 주차된 차량 수 = " + countp);
		countp = 0;
		for (i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length; j++) {
				if (park[i][j] == 0) {
					countp = countp + 1;
				}
			}
		}
		System.out.println("남은 주차 자리수: " + countp);
	}

}
