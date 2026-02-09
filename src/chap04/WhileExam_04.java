package chap04;

import java.util.Scanner;

public class WhileExam_04 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("메뉴를 고르세요.");
		System.out.println("1:커피, 2:차, 0:종료");
		int menu = 1; 
	//	if(menu == 1) {
	//		System.out.println("커피 드릴께요");
	//	} else if(menu == 2) {
	//		System.out.println("차 드릴께요");
	//	} else if(menu==0) {
	//		System.out.println("종료합니다");
	//	} else {
	//		System.out.println("다시 입력하세요");
	//	}
		
		System.out.println("-------------------");
	//	Scanner scan = new Scanner(System.in);
	//	menu = scan.nextInt();
		
		while(menu !=0) {
			
			System.out.println("메뉴를 고르세요.");
			System.out.println("1:커피, 2:차, 0:종료");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			
			
			if(menu == 1) {
				System.out.println("커피 드릴께요");
			} else if(menu == 2) {
				System.out.println("차 드릴께요");
			} else if(menu==0) {
				System.out.println("종료합니다");
			} else {
				System.out.println("다시 입력하세요");
			}
			
		}
		
		System.out.println("for문 이용---------------");
		
		
		 for (; menu !=0;) {
				if(menu == 1) {
					System.out.println("커피 드릴께요");
				} else if(menu == 2) {
					System.out.println("차 드릴께요");
				} else if(menu==0) {
					System.out.println("종료합니다");
				} else {
					System.out.println("다시 입력하세요");
				}
				

				System.out.println("메뉴를 고르세요.");
				System.out.println("1:커피, 2:차, 0:종료");
				Scanner scan = new Scanner(System.in);
				menu = scan.nextInt();
		 }
		
		
		
		
		
		
		int menu2= -1;
		do {
			System.out.println("메뉴를 고르세요.");
			System.out.println("1:커피, 2:차, 0:종료");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			
			
			if(menu == 1) {
				System.out.println("커피 드릴께요");
			} else if(menu == 2) {
				System.out.println("차 드릴께요");
			} else if(menu==0) {
				System.out.println("종료합니다");
			} else {
				System.out.println("다시 입력하세요");
			}
			
			
		} while (menu2 != 0);
	}

}
