package sec04.method02;

import java.util.Scanner;

public class Calc {
	
	//메소드 선언
	void powerOn() {
		int a; 
		a = 10; 
		
		System.out.println("전원을 켭니다");
	}
	 // 잠깐 return 배우고 왔음 
	
	int plus(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		int result = x + y;
		return result; 
	}
	
	int minus(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		int result = x - y;
		return result; 
	}
	
	int time(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		int result = (x * y);
		return result; 
	}
	
	
	
	
	double divide( int x, int y) {
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		double result  = 0;
		if ( y == 0 ) {
			System.out.println("0으로 나눌 수 없다");
		} else {
			result = (double)x / y;
		}
		return result;
		
		
//		if (y == 0) {
//			//double b = calc.divide(4,0);
//			System.out.println("0으로 나눌 수 없다");
//			System.out.println("b: "+ 0);
//
//		} else {
//			
//		
//			
//		}
		
	} 
	/*
	 *  javadoc 주석 
	 *  두 정수를 입력 받아서 
	 *  나누기한 결과를
	 *  double로 돌려주는 메소드 
	 *  단! y가 0일때는 "0으로 나눌 수 없다" 고 출력하고 0을 돌려줌 
	 *  
	 *  메소드명 : divide 
	 *  전달인자 : int x, int y
	 *  리턴타입 : double 
	 *  
	 *  @param int x, int y
	 *  @return double 
	 *  @author lustar001@naver.com
	 *  
	 */
	
//	Calc 클래스에 숫자와 문자를 받을수 있는 
//	scanner ,더하기, 빼기 , 나누기 , 곱하기 Method를 만든다.
//
//	CalcExam 클래스 에서 
//
//	scanner 메소드를 호출하여 
//	1번째 숫자 , 2번째 연산자 , 3번째 숫자 를 입력하여 ArrayList 로 return 을 받는다.
//	연산자를 if 하여 연산자에 맞는 메소드에 숫자를 보내 리턴받고 출력한다. 
//
//	scanner 은 String 으로 받아서 형변환 가능 , 0번째 숫자  , 1번째 문자 , 2번째 숫자 로 받아도 됨
//
//	예 
//
//	>"1 * 2"
//
//	>"2 입니다."
	
	
	
	Scanner scanner = new Scanner(System.in); 
	String num;
	
	
	
	
}
