package chap04;

import java.util.Scanner;

public class BreakExam_05 {

	public static void main(String[] args) {
		int count= 0;
		while(true) {
			int num = (int) (Math.random() * 6) + 1; 
			System.out.println("주사위: "+num);
			if(num == 6) {
				break;
			} 
			count++;
		} 
		System.out.println("게임종료: " + count+1);
		
		// 총 5명이 순차적으로 주사위를 던져서 
		// 각자 6이 나올 때 까지 , 6이 나오면 다음 사람
		for(int i=1; i<=5; i++) {
			
		
			while(true) {
				int num = (int) (Math.random() * 6) + 1; 
				System.out.println(i + "주사위: "+num);
				if(num == 6) {
					break;  // while 소속이라서 while 중단 
				}
			}
			
		}
		
		
		// 총 4층의 주차건물이 있음
		// 각 층에 10대의 자리가 있음 
		// 내 차는 1층 첫번째부터 17번째에 있음 
		
		int count2 = 0;
		boolean flag = false;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=10 ;j++) {
				count2++;
				System.out.println(i + ","+ j);
				if(count2>=17) {
					System.out.println("!!!!!!!!!!!!!!!!!");
					flag=true;
					break; 
				}
			}
			if(flag) {
				break;
			}
		
		}
			
	
		for(int i=01; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
		//2단계 
	//	이외,음수 다시 입력하세요
	//	출금할 수 없다 / 잔고 고려 
	//	잔액이 부족합니다. 
		
		
		
		
		boolean run = true; 
		int balance = 0;
	//	Scanner scanner = new Scanner(System.in);
	//	int menu = scanner.nextInt();
	//	int money =scanner.nextInt();
		int money  = 0;
		int mon = 0;
	
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 |4. 종료");
			System.out.println("------------------------------");
			Scanner scanner = new Scanner(System.in);
			 int menu = scanner.nextInt();
			
			
			if (menu == 1) {
				System.out.println("선택>"+menu);
				System.out.println("예금액을 입력하세요");
				money =scanner.nextInt();
				if (money<=0) {
					System.out.println("예금액이 잘못되었습니다.");
					continue;
				} 
				balance = balance + money; 
				System.out.println("예금액>"+money);
			} else if (menu == 2) {
				System.out.println("선택>"+menu);
				System.out.println("출금액을 입력하세요");
				mon =scanner.nextInt();
				if (mon<=0) {
					System.out.println("출금액이 잘못되었습니다.");
					continue;
				} 
				balance = balance - mon;
				if (balance<0) {
					System.out.println("잔고초과입니다.");
					continue;
				}
				System.out.println("출금액>"+mon);
			} else if (menu == 3) {
				System.out.println("선택>"+menu);
				System.out.println("잔고는" + balance + "원입니다.");
			} else if  (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("정확히 입력해주세요");
			}
			
			
		}
		
		
		int menu = 10; 
		int balance1 = 0;
		do {
			System.out.println("-----------------------------");
			System.out.println("1. 예금 | 2.출금 | 3.잔액조회 | 4. 종료");
			System.out.println("-----------------------------");
			Scanner scan = new Scanner(System.in);
			//메뉴입력 
			menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("입금액 : ");
				Scanner scan2 = new Scanner(System.in);
				int money1 = scan2.nextInt();
				if(money < 0 ) {
					System.out.println("입금액을 확인해 주세요");
				} else {
					balance1 += money; 
				}
				
			} else if (menu == 2) {
				System.out.println("출금액 : ");
				Scanner scan2 = new Scanner(System.in);
				int money1 = scan2.nextInt();
				if(money < 0 ) {
					System.out.println("출금액을 확인해 주세요");
				} else if (balance < money){
					System.out.println("잔액이 부족합니다");
				} else {
					balance1 += money;
				}
				
			}
		}while(menu != 4);
		
		
	}

}
