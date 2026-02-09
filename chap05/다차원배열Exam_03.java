package chap05;

public class 다차원배열Exam_03 {

	public static void main(String[] args) {

		int a0 = 5;
		int a1 = 15;
		int a2 = 34;

		// int 를 여러개 만들기
		int[] b0 = new int[3];
		// b의 첫번째 변수에 a0 넣기
		// 두번째 변수에 a1넣기

		b0[0] = a0;
		b0[1] = a1;
		b0[2] = a2;

		int[] b1 = new int[3];
		b1[0] = a0 + 1;
		b1[0] = a1 + 1;
		b1[0] = a2 + 1;

		// b0과 b1을 배열로 만들기
		int[][] c0 = new int[2][3];
		c0[0] = b0;
		c0[1] = b1;

		System.out.println(c0[0][1] == a1);

		System.out.println("c0.length: " + c0.length);
		System.out.println("b1의 길이: " + c0[1].length);

		int[][] c1 = new int[][] { { 1, 2, 3 }, new int[] { 4, 5, 6 } };
		int[][] c2 = { { 1, 2, 3 }, { 4, 5, 6, 7 }, null };

		int[][] arr = new int[2][];
		// 가장 바깥 차원은 꼭 있어야 한다
		// heap에 공간은 만들어야 해서
		// 모두 null로 초기화
		// 참조 공간만 만들고 실제 배열은 나중에 만들기
		// 가변(비정형) 배열
		// 공간을 연속으로 잡지 않아서 고성능에서는 불리할 수 있다.
		System.out.println(c0);
		System.out.println(c0[0]);
		System.out.println(c0[0][0]);
		///////////////////////////////////////
		System.out.println("--------------------------");

		int k1 = 10;
		int k2 = k1;
		System.out.println(k2);
		k1 = 5;
		System.out.println(k2);

		int[] d1 = { 1, 2, 3 };
		// 얕은 복사 (call by reference)
		// = 기호는 stack의 값(또는 주소) 만 복사
		// 원본을 변경하는 경우 사본도 바뀐다.
		// 값을 변경하는 경우 원본도 바뀐다.

		int[] d2 = d1;

		System.out.println(d2[0]);
		d1[0] = 4;
		System.out.println(d2[0]);

		System.out.println(d1[2]);
		d1[2] = 40;
		System.out.println(d1[2]);

		// 깊은복사 (call by value)
		int[] d3 = new int[d1.length];
		for (int i = 0; i < d1.length; i++) {
			d3[i] = d1[i];

			System.out.println("-----------------");
			// 깜짝 퀴즈
			// 꼭 반복문 쓰기
			// 1~5까지 , 11~15까지 , 101~105까지 저장하는 2차원 배열을 만드시오.
			// 그리고 거기말고 다른 반복으로 모두 출력하시오.
			int[] v1 = new int[5];
			int[] v2 = new int[5];
			int[] v3 = new int[5];

			int j = 0;
			int[][] v4 = new int[3][5];

			for (i = 0; i <= 2; i++) {
				for (j = 0; j <= 4; j++) {
					if (i == 0) {
						v1[j] = j + 1;
						v4[i] = v1;
					}
					if (i == 1) {
						v2[j] = 11 + j;
						v4[i] = v2;
					}
					if (i == 2) {
						v3[j] = 101 + j;
						v4[i] = v3;
					}
					System.out.println("v4[" + i + "][" + j + "]=" + v4[i][j]);
				} // syso 엔터 조심
			}

			int[] q1_1 = new int[5];
			int[] q1_2 = new int[5];
			int[] q1_3 = new int[5];

			for (i = 0; i < q1_1.length; i++) {
				q1_1[i] = i + 1;
			}
			for (i = 0; i < q1_1.length; i++) {
				System.out.println(q1_1[i]);
			}
			for (i = 0; i < q1_1.length; i++) {
				q1_2[i] = i + 11;
			}
			for (i = 0; i < q1_1.length; i++) {
				q1_3[i] = i + 101;
			}

			// 4.2차원 배열
			int[][] q1 = new int[3][5];
			q1[0] = q1_1;
			q1[1] = q1_2;
			q1[2] = q1_3;
			for (i = 0; i < q1.length; i++) {
				for (j = 0; j < q1[0].length; j++) {
					System.out.println("q1[" + i + "][" + j + "] = " + q1[i][j]);
				}
			}

			System.out.println("-p-----------");
			// 정수형 3차원 배열
			int[][][] arr1 = new int[2][3][4];
			int count = 0;
			for (i = 1; i < arr1.length; i++) {
				for (j = 1; j < 4; j++) {
					for (int n = 1; n < 5; n++) {
						count = count + 1;
						System.out.println("arr1[" + i + "][" + j + "][" + n + "]=" + count);
					}
				}
			}

			String[] oldStrArray = { "java", "array", "copy" };
			String[] newStrArray = new String[5];
			System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

			for (i = 0; i < newStrArray.length; i++) {
				System.out.println(newStrArray[i] + ",");
			}

			System.out.println("-------------------");

			int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

			int sum = 0;
			double avg = 0.0;
			int cou = 0;

			System.out.println(array.length);
			System.out.println(array[0].length);
			System.out.println(array[1].length);
			System.out.println(array[2].length);
			System.out.println(array[1][0]);

			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array[i].length; j++) {
					sum = sum + array[i][j];
					cou = cou + 1;
					avg = sum / cou;
				}
			}

			System.out.println("sum: " + sum);
			System.out.println("avg: " + avg);

			// 가장 칸 값과 그 위치(행, 열 ) 출력
			// 출력값 . 최댓값 : 9 , 위치 : (0,1)
			int[][] map = { { 3, 9, 2 }, { 8, 1, 7 }, { 4, 6, 5 } };

			int stand = map[0][0];
			int xi = 0;
			int yi = 0;

			for (i = 0; i < map.length; i++) {
				for (j = 0; j < map[i].length; j++) {
					if (stand <= map[i][j]) {
						stand = map[i][j];
						xi = i;
						yi = j;
					}

				}
			}
			System.out.println("최댓값은" + stand);
			System.out.println("최댓값의 위치는 (" + xi + "," + yi + ")");

			System.out.println("3차배열 도전이얌 ------------------");

			// int[][][] arr = new int[층][행][열];

			// AI -1
			int[][][] arr2 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

			for (i = 0; i < arr2.length; i++) {
				System.out.print("층: " + i);
				System.out.println();
				for (j = 0; j < arr2[i].length; j++) {
					for (int m = 0; m < arr2[i][j].length; m++) {

						System.out.print(arr2[i][j][m] + " ");

					}
					System.out.println();
				}
				System.out.println();
			}

			int sum5 = 0;
			int sum6 = 0;
			int xxi = 0;
			int xxii = 0;

			for (i = 0; i < arr2.length; i++) {
				for (j = 0; j < arr2[i].length; j++) {
					for (int m = 0; m < arr2[i][j].length; m++) {

						if (i == 0) {
							sum5 = sum5 + arr2[i][j][m];
							xxi = i;
						}
						if (i == 1) {
							sum6 = sum6 + arr2[i][j][m];
							xxii = i;
						}
					}
				}
			}
			System.out.println(xxi + "층의 합: " + sum5);
			System.out.println(xxii + "층의 합: " + sum6);

			System.out.println("-------------");

			int[][][] logData = new int[3][4][6];
			int sum3 = 0;
			int count3 = 0;
			int val = 0;

			for (i = 0; i < logData.length; i++) {
				for (j = 0; j < logData[i].length; j++) {
					for (int m = 0; m < logData[i][j].length; m++) {
						sum3 = sum3 + 1;
						System.out.println("logData[" + i + "][" + j + "][" + m + "] =" + sum3);

					}
				}
			}

//			 값: 1부터 시작하여 1씩 증가하는 연속된 정수 (총 72개)
//			 [2] 장애 의심 구간 필터링 조건
//			 서버: 0번 서버를 제외한 나머지 모든 서버
//			 날짜: 인덱스 번호가 홀수인 날
//			 시간: 각 날짜의 마지막 3개 시간대
//			 수치: 기록된 값이 40 이상인 경우
//			 [3] 최종 출력값
//			 위 조건을 모두 만족하는 데이터들의 합계와 해당 데이터의 개수
//			

			System.out.println("---------------");
			count3 = 0;
			sum3 = 0;
			for (i = 0; i < logData.length; i++) {
				for (j = 0; j < logData[i].length; j++) {
					for (int m = 0; m < logData[i][j].length; m++) {
						sum3 = sum3 + 1;
						if (i != 0) {
							if (sum3 % 2 == 1) {
								if (m == 4 || m == 5 || m == 6) {
									if (sum3 >= 40) {
										val = val + sum3;
										count3 = count3 + 1;
										System.out.println("logData[" + i + "][" + j + "][" + m + "] =" + sum3);

									}
								}
							}
						}
					}
				}
			}
			System.out.println("총 합은 " + val);
			System.out.println("해당 개수는 " + count3);
			//
			

		}

		//
		
		
		
	}

}
