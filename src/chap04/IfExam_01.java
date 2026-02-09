package chap04;

import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {
		
		int score = 85; 
		
		boolean over90 = score >= 90 ; 
		
		{
			System.out.println("항상 실행되는 실행 블럭");
		}
		//만약
		if(over90)
		{
			System.out.println("90이상입니다.");
		}
		if(score < 90) {
			System.out.println("90미만입니다.");
		}
		
		// 정반대일 경우 !를 활용하는 것도 좋다.
		if(!(score >= 90)) {
			System.out.println("90미만입니다.");
		}
		
		if(score >=90 ) {
			System.out.println("90 이상입니다");
		} else { //그렇지 않으면 
			System.out.println("90 미만입니다.");
		}
		// else 가 있으면 무조건 하나는 실행되는게 보장된다.
		score = 95; 
		if(score >= 90 ) {
			System.out.println("90이상");
		} 
		// *이전과 관계 없이 무조건 다시 판단 
		if ( (score<100) && (score >= 80)) {
			System.out.println("80~100");
		}
		System.out.println("-------------------");
		
		if(score >= 90 ) {
			System.out.println("90이상");
	//	} else if ( score < 100 && score >= 80) {
		}	else if ( score >= 80) {
			// *위의 if 나 else if 가 거짓일 때만 판단한다
			System.out.println("90미만 80이상");
		}	else if ( score >= 70) {
			System.out.println("80미만 70이상");
		} else {
			System.out.println("70미만");
		}
		
		// 97점이면 
		//		90이상
		//		95이상
		// 92점이면
		//		90이상
		if(score >= 90) {
			System.out.println("90 이상");
			
		}
		if(score >= 90) {
		//	System.out.println("90 이상");
		} if( score >= 95) 
		{System.out.println("95 이상");}
		
		
		if(score >= 90 && score >= 95) 
		{System.out.println("95 이상");}
		
		//홀짝
		int x = 3; 
		
		if (x%2 == 0){
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		double random1 = Math.random();
		System.out.println("random1: "+random1);
		// Math.random()
		// 0 <= Math.random() < 1
		// 0~ 0.99999999999999
		// 
		// 이해하고 만들어가기
		//1. 홀짝
		//두개의 케이스로 만들어보자
		//0 <= Math.random() * 10 < 10
		// 0~ 9.999999999999
		// int 로 형변환 
		// 0 ~ 9 
		// if( (Math.random() ) * 10 ) % 2 == 0
		
		
		
		// 정교한 방식
		// 0과1을 구하는 정교한 방식
		// 0*2 <= Math.random() * 2 < 1*2
		// 0 ~ 1.9999999999999999
		// int로 형변환 해서 정수만 남기기 
		
		double rand2 = Math.random(); //0~0.999
		double temp1 = rand2 * 2; // 0~1.999
		int result = (int)temp1; 
		if(result == 0) { 
			System.out.println("짝수");	
		} else {
			System.out.println("홀수");
		}
		
		
		// 1~6까지 구하기 (주사위)
		// 0*6 <= Math.random() * 6 < 1*6
		// 0 ~ 5.99999999999
		// int 로 바꾸고 
		// + 1 하면 1~6 
		
		rand2 = Math.random();
		double temp2 = rand2 * 6; //0~5.999999
		int result0 = (int)temp2; //0~5
		result = result0 + 1 ;// 1~6 
		System.out.println("주사위 결과: " + result);
		
		
		// 5~10 까지 구하기
		result = result0 + 5 ;
		System.out.println("주사위 결과: " + result);
		
		
		
		
		// 변수로 범위를 잡아서 보편화
		int min = 5; 
		int max = 10;
		rand2 = Math.random();
		temp2 = (int) (rand2 * (max - min + 1) ) + min;
		System.out.println();
		
		//쉬운방식  - 큰 수를 뽑아서 나머지로 구함 
		rand2 = Math.random();
		temp2 = rand2 * 100000; 
		result0 = (int) temp2;
		result = result0 % 6 + 1;
		
		// 로또 번호 
		// 1~45 까지 6개의 숫자를 랜덤으로 뽑아서 제출하시오 
		// 단, 중복 없이 
		min = 1; 
		max = 45;  
		rand2 = Math.random();
		temp2 = (int) (rand2 * (max - min + 1)) + min; 
		System.out.println(temp2);
		
		
		System.out.println("-------------------");
		// 임의의 수를 입력받아 
		//문제 1 
		// "양수", 0, "음수" 판단하여 출력 
		Scanner scanner = new Scanner(System.in); 
		String inputData = scanner.nextLine();
		
		int abc = Integer.parseInt(inputData);
		
		System.out.println("문제1 임의의 수를 입력하시오");
		if(abc > 0)
		{ System.out.println("양수"); }
		else if (abc==0){ System.out.println("0"); }
		else{ System.out.println("음수"); }
		
		System.out.println("---------------");	
		//문제2 
		//홀수인지 짝수인지 판단하여 출력 
		
		int number = scanner.nextInt();
		System.out.println("문제2 짝홀 판단하기");
		if ( number% 2 == 0)
		{System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("----------------");
		//문제3 
		// 임의의 두 수 x,y 받아서 
		//둘 중에 큰 값 출력 
		
		int xx = scanner.nextInt();
		System.out.println("x는 : " + xx);
		int yy = scanner.nextInt();
		System.out.println("y는 : "+ yy);
		if (xx >= yy) {
			System.out.println("둘 중 더 큰 값은 " + xx + "입니다");
		} else {
			System.out.println("둘 중 더 큰 값은 " + yy + "입니다");
		}
		
		
		// 강사님 풀이
		//if (num1 > num2) {
		// syso("%d와 %d 중 %d가 크다", num1, num2, num3)}
		
		System.out.println("문제3 완---------------");
		//문제4 
		//임의의 money를 입력 받아서 
		//7000원 이상이면 "택시타자" 출력 
		//3000원 미만이면 "걸어가자"출력 
		
		int money = scanner.nextInt();
		if (money >= 7000) { 
			System.out.println("택시타자");
		} else if (money < 3000) { 
			System.out.println("걸어가자");
		} else {
			System.out.println("버스타자");
		}
		System.out.println("문제4완-----------");
		
		//문제5
		//'가위', '바위','보' 입력 받아서 
		// 5-1. 컴퓨터는 항상 '바위'만 낼 경우 
		//5-2. 컴퓨터도 random으로 
		// '이겼다', '비겼다', '졌다' 출력
		
		
		
		Scanner scanner2 = new Scanner(System.in); 
		String rock = scanner2.nextLine();
		System.out.println(rock);
		if (rock.equals("가위")) {
			System.out.println("졌네요ㅜㅜ");
		} else if (rock.equals("바위")){
			System.out.println("비김");
		} else {
			System.out.println("이겼다!@@");
		}
		
		String rock2 = scanner2.nextLine();
		double random2 = Math.random();
		double result2 = random2*3;
		int result3 = (int)result2;
		//강사님 풀이 : int com_int = (int)(Math.random() * 3);
		String oo = "";
		
		if (result3 == 0) {
			oo = "가위";
		} else if (result3 == 1) {
			oo = "바위";
		} else {
			oo = "보";
		}
		
		
	
		
		System.out.println("나는" + rock2 + "냄");
		System.out.println("컴퓨터는" + oo + "냄");
		
		if (oo.equals(rock2)) {
			System.out.println("무승부");
		} else if ( (oo.equals("가위") && rock2.equals("보")) || 
					(oo.equals("바위") && rock2.equals("가위")) ||
					(oo.equals("보") && rock2.equals("바위"))
			) {
						System.out.println("컴퓨터 이김"); } 
					else {
						System.out.println("내가 이김");
					} 
						
					
		
		
		System.out.println("문제5완 ----------------");
		
		//문제6
		//임의 세 수 x,y,z를 받아서 
		//z가  x~y 사이에 있는지(포함)판단 
		int box = scanner.nextInt();
		System.out.println("x: " + box);
		int boy = scanner.nextInt();
		System.out.println("y: " + boy);
		int boz = scanner.nextInt();
		System.out.println("z: " + boz);
		
		if (box > boy && boz >= boy && boz <= box) {
			System.out.println("z는 x와 y 사이 포함된다.");
		} else if (box < boy && boz >= box && boz <= boy) {
			System.out.println("z는 x와 y 사이 포함된다.");
		} else {
			System.out.println("z는 x와 y 사이 포함되지 않는다");
		}
		
		System.out.println("문제6완------------");
		
		
		
		//문제7
		//月을 입력 받아서 
		//계절 출력 
		// 13,-1 등 입력하면 "정확히 입력해주세요" 출력 
		
		int season = scanner.nextInt();
		if ( (season>=1 && season <= 2 )|| season == 12) {
			System.out.println(season + "월은 겨울입니다 ");
		} else if ( season>=3 && season <= 5 ) {
			System.out.println(season + "월은 봄입니다 ");
		} else if (season>=6 && season <= 8) {
			System.out.println(season + "월은 여름입니다 ");
		} else if (season>=9 && season <= 11){
			System.out.println(season + "월은 가을입니다 ");
		} else {
			System.out.println("정확히 입력해주세요");
		}
		
		System.out.println("문제7완--------------");
		
		
		
		//문제8 
		//임의의 수를 입력받아서 다음과 같이 출력 
		//예 : 125 
		//입력한 수는 100보다 크고, 양수이고, 홀수입니다. 
		
		int bomb = scanner.nextInt();
		if (bomb>100) {System.out.println("100보다 크고");}
		else {System.out.println("100보다 작거나 같고");}
		if (bomb>=0) {System.out.println("양수이고");}
		else {System.out.println("음수이고");}
		if (bomb%2==0) {System.out.println("짝수입니다.");}
		else {System.out.println("홀수입니다.");}
		System.out.println("문제8완------------------");
		
	//	if (bomb >= 100 && bomb%2 == 0) { 
	//		System.out.println(bomb + "는 100보다 크고, 양수이고, 짝수입니다.");
	//	} else if ((bomb >= 100 && bomb%2 == 1)) {
	//		System.out.println(bomb + "는 100보다 크고, 양수이고, 홀수입니다.");
	//	} else if (bomb >= 0 && bomb%2 == 0) {
	//		System.out.println(bomb + "는 100보다 작고, 양수이고, 짝수입니다.");
	//	} else if (bomb >= 0 && bomb%2 == 1) {
	//		System.out.println(bomb + "는 100보다 작고, 양수이고, 홀수입니다.");
	//	} else if (bomb < 0 && bomb%2 == 0) {
	//		System.out.println(bomb + "는 100보다 작고, 음수이고, 짝수입니다.");
	//	} else {
	//		System.out.println(bomb + "는 100보다 작고, 음수이고, 홀수입니다.");
	//	}
		
		//문제9 
		//온도를 입력받아서 다음과 같이 출력 
		// 예: -3 
		//영하 3도 입니다. 
		//예 : 5
		// 영상 5도 입니다. 
		
		int tem = scanner.nextInt();
		if (tem < 0) {
			System.out.println("지금은 영하" + tem*(-1) + "도 입니다.");
		} else {
			System.out.println("지금은 영상" + tem + "도 입니다.");
		}
		
		System.out.println("문제9완--------------------");
		
		//응용문제 
		//문제10 
		//시, 분을 입력 받아서 35분 후의 시, 분을 출력 
		//3,51을 입력받으면 
		// 4시 26분을 출력 
		
		int hour = scanner.nextInt();
		System.out.println("지금은" + hour + "시");
		int miin = scanner.nextInt();
		System.out.println("지금은" + miin + "분");
		
		int htm = hour*60; 
		int plus = htm + miin + 35 ; 
		System.out.println("35분 후는" +plus/60 + "시" + plus%60 + "분");
		System.out.println("문제10완-------------");
		
		
		
		//문제11
		//두자리 숫자를 입력받아서 
		//10의 자리와 1의 자리가 같은지 판단 
		//예 : 77 => 같음, 94 => 다름 
		
		int doub = scanner.nextInt();
		int head = doub/10;
		int tail = doub%10;
		if (head == tail) {
			System.out.println("십의 자리와 일의 자리가 같음");	
		} else {
			System.out.println("십의 자리와 일의 자리가 다름");
		}
		
		System.out.println("문제11완----------------");
		
		
		//문제12
		//1~99까지 369게임 
		//임의의 수를 받아서 3,6,9 숫자가 있으면 "박수"출력 
		//없으면 그 숫자 그대로 출력 
		//예 : 33 => 박수 ,31 => 박수, 12 => 12, 14 => 14
		
		int game = scanner.nextInt();
		int head2 = game/10;
		int tail2 = game%10; 
		if (head2 == 3 || head2 == 6 || head2 == 9) {
			System.out.println("박수");
		} else if (tail2 == 3 || tail2 == 6 || tail2 == 9) {
			System.out.println("박수");
		} else {
			System.out.println(game);
		}
			System.out.println("문제12완--------------");
				
		
		
		//문제13
		//사각형의 한쪽 모서리 : x1: 10, y1: 20 
		//반대편 모서리 : x2 : 90 , y2 : 100 
		//입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가? 
			
			int boxx = scanner.nextInt();
			System.out.println("x좌표는 "+ boxx);
			int boxy = scanner.nextInt();
			System.out.println("y좌표는"+ boxy);
			
			int x1 = 10; 
			int y1 = 20;
			int x2 = 90;
			int y2 = 100;
			
			if ( boxx>=x1 && boxx<=x2 && boxy>=y1 && boxy<=y2) {
				System.out.println("입력받은 좌표의 점은 사각형에 겹친다");	
			} else {
				System.out.println("입력받은 좌표의 점은 사각형에 안겹친다.");
			}
			
			System.out.println("문제13완------------------");
			
			
			
			
			
			
	}

}
