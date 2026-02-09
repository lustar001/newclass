package chap02;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3);
		System.out.print(4);
		
		System.out.println(5);
		
		System.out.println(); // <br> 처럼 걍 엔터 
		System.out.println(6);
		System.out.println("----------");
		
		String name = "김지윤"; 
		int age = 20; 
		System.out.println("이름: " + name + ", 나이:" + age );
		System.out.printf("이름: %s, 나이 : %d", name,age );
		///////////////////////////
		//입력 
		int keyCode; 
		
		// 스캐너 연습할거라서 주석처리함 
//		
//		try {
//			System.out.print("입력하시오 >> ");
//			keyCode = System.in.read();
//			System.out.println("keyCode: "+ keyCode);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 이클립스 단축키 
		/*
		 * 한줄 지우기 : Ctrl + d 
		 * 한줄 복사 : Ctrl + Alt + 위 아래 방향키 
		 * 한줄 이동 : Alt + 위 아래 방향키 
		 * 주석 단축키 : Ctrl + / 
		 * 자동 정렬 : Ctrl + Shift + f 
		 * import 자동 : Ctrl + Shift + o
		 */
		
		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		System.out.println("inputData: " + inputData);
		// 엔터쳤을 때 첫번째 띄어쓰기 까지만 
		//inputData = scanner.next();
		
		//문제 
		//나이를 입력하고 내년에 몇 살인지 
		System.out.print("나이를 입력하세요");
		//String age2 = scanner.nextLine();
		//int age3 = Integer.parseInt(age2);
		
		int age3= scanner.nextInt();
		System.out.println("내년엔 " + (age3+1) + "살 입니다.");
	}

}
