package chap03;

public class OpExam {

	public static void main(String[] args) {
	
		int x = 10; 
		
		x++;
		System.out.println("x: "+ x);
		
		x = 10;
		x = x + 1;
		// 나한테 +1 해서 다시 나한테 저장할 때 줄여쓰는 형태 
		x += 1; // 위와 같은 코드 
		x++; 	// 위와 같은 코드 
				// 단, +1만 가능 
		
		x = 10; 
		++x; 
		System.out.println("++x: " + x);
		
		x = 10; 
		x--; 
		--x;
		System.out.println("x-- : " + x);
		
		x = 10; 
		int z = ++x;
		System.out.println("z(++x) : " + z);
		System.out.println("x(++x) : " + x);
		
		
		x = 10; 
		z = x++; 
		System.out.println("z(x++) : " + z);
		System.out.println("x(x++) : " + x);
		
		
		x = 10 ;
		System.out.println("x++: " + x++ + ("x: "+x));
		
		x = 10 ; 
		// 10 + 12
		z = x++ + ++x;
		//예측 : 21 예측 틀림  
		System.out.println("z: "+ z);
		
		
		x = 1; 
		// 1 - 1 * 1 - 2
		z = x++ - --x * x++ - x-- ; 
		// 1 - 1 * 1 - 2
		//z와x의 출력값 
		// 예측 z : -2
		// 예측 x : 1
		System.out.println("z :" + z);
		System.out.println("x :" + x);
	
		//나누기 할 때 0으로 나누지 않도록 조심 
		int b = 10; 
//		int c = b / 0;
		double d = 7.3; 
		double e = d / 0; 
		System.out.println("d/0 : "+ e); //Infinity
		
		// 나머지 
		int f = 10 % 3;
		System.out.println(f);
		//특징: 0부터 ~  나머지 하는 숫자보다 하나 작은 것만 나온다. 
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f);
		// 소수점은 근사치로 저장된다. 
		// 그나마 같은 타입으로 변환해서 비교하면 수월하다. 
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2) );
		//글씨는 무조건 equals()로 비교한다.
		System.out.println("asdf".equals(s1));
		
		int c1 =22; 
		int c2 = 4; 
		System.out.println("몫 :" + (c1 / c2));
		System.out.println("나머지 : "+ (c1 %c2));
		
		//문제1
		// 난 돈이 10000원 있음
		// 1. 4500원 짜리 쌍화차를 최대 몇 잔 살 수 있는가? 
		// 2. 그리고 남는 돈은 ? 
		int money = 10000; 
		int tea = 4500;
		System.out.println("쌍화차를 최대 " + (money/tea) + "잔 살 수 있다");
		System.out.println("남은 돈은 "+ (money%tea)+"원 입니다.");
		
		
		//문제2 
		//올리브영에서 꿀홍차가 8000원 인데 
		//15% 세일!  그렇다면 가격은? 
		
		int honey = 8000; 
		double discount = 0.85;
		System.out.println("올리브영 꿀홍차 할인 가격은 " + (honey*discount) + "원 입니다." );
		int honey2 = 8000; 
		double discount2 = 0.15;
		System.out.println("올리브영 꿀홍차 할인 가격은 " + (honey2-(honey2*discount2)) + "원 입니다." );
		System.out.println("올리브영 꿀홍차 할인 가격은 " + (honey2*(1-discount2)) + "원 입니다.");
		
		//문제3 
		double v1 = 1000; 
		double v2 = 794.0;
		double result2 = (v1 / v2) *1000 ;
		int result3 = (int)result2; 
		double result4 = (double)result3/1000;
		// v1 / v2를 소수점 3자리까지만 출력하시오 
		System.out.println(((v1/v2)*1000)/1000);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//문제4 
		// 17000원이 있을 떄 
		// 5000 원 몇 장 
		// 1천원 몇장 
		
		int bill = 17000; 
		int o5 = 5000;
		int o1 = 1000; 
		
		System.out.println(bill + "원이 있을 떄 5000원은 "+ (bill/o5) + "장, 1000원은 " +  ((bill - ((bill/o5)*5000))/o1) + "장 입니다" );
	
		
		
		
		int s = 95; 
		String grade = ( s > 90 ) ? "A" : "B";
		System.out.println("grade: " + grade);
	}

}
