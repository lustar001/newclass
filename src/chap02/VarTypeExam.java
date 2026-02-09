package chap02;

public class VarTypeExam {

	public static void main(String[] args) {
		
		byte b1;
		b1 = 127;
		System.out.println("b1: "+ b1);
//		b1 =128; // 128은 byte 에 못 들어간다 
		
		char c1 = 65;
		System.out.println("c1: "+ c1);
		char c2 = 65 + 2;
		System.out.println("c2: "+ c2);
		char c3 = 'B'; 
		System.out.println("c3 - c1 : "+ (c3 - c1));
		
		// L 또는 l을 붙이면 명시적인 long 
		long l1 = 2200000000L; //22억 그냥 쓰면 int로 인식 그래서 뒤에 L 붙임(long 타입)
		long l2 = 30; 
		
		String s1 = "김지윤"; 
		System.out.println("s1: "+ s1);
		
		String s2 = "김\"지윤\"";
		System.out.println("s2: "+ s2);
		
		String s3 = "\\김\t지\n윤";  //tab(t) & enter(n)
		System.out.println(s3);
		
		System.out.println("글씨"+3);
		System.out.println("글씨"+ 3 + 2); //글씨32 출력 
		System.out.println("글씨"+ (3 + 2)); //글씨5 출력 
		System.out.println(3 + 2 + "글씨"); //5글씨 
		
		float f1 = 3.14f;
		System.out.println("f1: "+ f1);
		
		double d1 = 3.14;
		System.out.println("d1: " + d1);
		
		float f2 = 0.1234567890123f;
		System.out.println("f2: " + f2);
		//float의 정밀도 : 소수점 7자리 
		
		double d2 = 0.12345678901234567890;
		System.out.println("d2: " + d2);
		//double 의 정밀도 : 소수점 16자리 
		
		double d3 = 5e3; 
		System.out.println("d3: " + d3);
		
		boolean stop = true;
		boolean start = false; 
		System.out.println("stop: "+ stop);
		
		
		//문제1 
		// 내 나이를 저장 
		short age = 32 ; 
		System.out.println("나이: "+ age);
		//문제2 
		//운전면허가 있다/없다 
		boolean license = true;
		System.out.println("운전면허가 있다" + license);
		//문제3
		//우리집에 있는 스마트 폰의 개수
		int phone = 4 ; 
		System.out.println("스마트 폰의 개수: " + phone);
		//문제4
		//내 이름 저장 
		String name = "김지윤";
		System.out.println("이름: " + name);
		//문제5
		//1평은 3.3제곱미터 
		//5평이 몇 제곱미터인지 계산해서 저장 
		double smeter = 3.3; 
		System.out.println("5평은: "+ (smeter*5));
	
		//문제 6
		//6-1 : 두 변수 x,y 에 각각 숫자를 넣고 
		//출력 결과 : "3 > 4 결과는 false 입니다. 
		
		int x = 3;
		int y = 4; 
		
		System.out.println(x + " > " + y + "결과는" + (x>y) + "입니다.");
		
		boolean z = x > y ;
		
		//6-2 : x,y 값 바꿔서 정답 나오는지 출력 
		System.out.println(y + " > " + x + "결과는" + (y>x) + "입니다.");
		
		
		//문제7 
		/*
		 * 숫자 149 
		 * 출력 결과 
		 * "백의 자리 : 1 " 
		 * "십의 자리 : 4" 
		 * "일의 자리 : 9" 
		 */
	
		int b = 149; 
		System.out.println("백의 자리: " + (b/100));
		System.out.println("십의 자리: " + ((b / 10) - (b/100)*10));
		System.out.println("일의 자리: " + (b - ((b/10)*10)) );
		
		System.out.println("백의 자리: " + (b/100));
		System.out.println("십의 자리: " + (b%100)/10) ;
		System.out.println("일의 자리: " + (b%10));
		
		
		
		
		
		//문제8
		//회식비 43000원 
		//참석인원 4명 
		//인당 얼마 ? 
		
		// 8-1 : 디테일하게 원단위까지 
		// 8-2 : 만원 단위까지만 받기 
		// 8-2-1 : 주최자는 얼마 내야하는가? 
	
	
		int d = 43000;
		System.out.println("정확하게 뿜빠이: "+ (d/4) + "원");
		System.out.println("만원 단위로 나누면: " + ((d/4)/10000*10000) + "원");
		System.out.println("주최자는 " + (d-((d/4)/10000*10000)*3)+ "원 내세요");
		
		
		int 회식비 = 43000; 
		int 참석인원 = 4 ; 
		
		
		//문제9 
		String left = "오예스"; 
		String right = "사탕"; 
		
		String gg = left;
		left = right ;
		right = gg;
		
		
				
		// 뭔가 하기 
		System.out.println("left: "+ left ); //사탕
		System.out.println("right: "+ right ); //오예스 
		
	
	}
	

}
