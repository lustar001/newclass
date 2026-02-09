package chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {
	
		// for문의 기본 형식 
		// for( ; ; ){}
		
		
		int sum = 0; 
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		//int i = 0; 
		//for (i = 1; i <=100;i++ ) {
		//	sum = sum + i;
		//}
		//System.out.println(sum);
		//System.out.println(i);
		
		
		for (int j=1 ; j <= 10 ;j++) { 
			System.out.println(j);
		}
		
		// 1+1+1+1+1
		// 1씩 더하는 것을 5번 하고 싶다.
		int sum1 = 0; 
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);
		
		// 시작 값
		// 종료 조건 
		int sum2 = 0;
		for (int j = 1; j<=5 ; j++) {
			sum2 = sum2 + 1;
		}
		System.out.println(sum2);

		// 1~5까지 합을 구하기 
		sum = 0; 
		sum = sum + 1; 
		sum = sum + 2; 
		sum = sum + 3; 
		sum = sum + 4; 
		sum = sum + 5; 
		
		sum = 0; 
		int k = 1;
		sum = sum + k; //k ==1
		k++;
		sum = sum + k; //k==2
		k++;
		sum = sum + k; //k==3
		
	//	for(k=1;k<=5;k++) {
		//	sum = sum + k;
	//	}
		
		/* 
		 * 반복문 만드는 원리 
		 * 1. 반복 되는 것 찾기 
		 * Ctrl+c,v 했을 때 바뀌지 않는 것 찾기 
		 * 2. 반복되지 않는 것의 
		 * 	2-1. 규칙(패텬) 찾기 
		 * 	2-2. 변수로 바꿔서 더 이상 바뀌지 않게 만들기 
		 * 3. 시작 값 파악 
		 * 4. 종료 조건 파악 
		 * */
		
		
		//깜짝 퀴즈 
		// 구구단 2단 출력 
		//2x1=2 
		
		 System.out.println("구구단 2단");
		 
		 int n = 1; 
		 for ( n = 1; n<= 9 ; n++) {
			 
			 System.out.println("2 x " + n + " = " + (2*n));
		 } 
		 
		 
		 //10부터 1까지 출력
		 //10부터 2까지 짝수만 출력 
		 
		 int nu = 10;
		 for ( int d = 0; d<=9; d++) {
			System.out.println(nu - d );  
		 }
		 
		 for (int c= 10; c>0 & c<=10; c=c-1) {
			 System.out.println(c);
		 }
		 System.out.println("-------------");
		 
		 
		 nu = 10;
		 for(int e = 0; e<=5; e++) {
			 System.out.println(nu - (2*e));
		 }
		 
		 for (int c= 10; c>0 & c<=10; c=c-1) {
			 if(c%2==0) {
				 System.out.println(c);
			 }
		 }
		 for (int w= 10; w>=1; w=w-2) {
			 
				 System.out.println(w);
				 
		 }
		 
		 
		 //문제 1 
		  for(int ff= 1; ff<=5 ; ff++) {
			  if (ff%2 == 0) {
				  System.out.println(ff + ": 짝수");
			  }else {
				  System.out.println(ff + ": 홀수");
			  }
		  }
		  
		  System.out.println("문제1완--------------");
		  
		  
		  //문제2 
		  int suum = 0;
		  int vvv = 0; 
		  for ( int gg = 1; gg<= 100 ; gg = gg + 2) {
			 suum = suum + gg; 
			 vvv = vvv + 1;
		  }
		  	System.out.println("1~100의 홀수 합" + suum + "홀수 개수" + vvv);
		  	
		  	
		 //문제3
		 Scanner pluus = new Scanner(System.in);
		 String repeat = pluus.nextLine();
		  int aaa = Integer.parseInt(repeat); 
		 System.out.println("출력값:"+ aaa);
		  
		 int ccc = 0;
		 for(int bbb = 1 ;  bbb <= aaa; bbb++) {
			  ccc = ccc + bbb;
		  }
		  System.out.println("다 더하면 "+ccc);
		 
		  // 문제4
		 for (int ddd = 1; ddd<=10; ddd++) {
			  System.out.print(ddd + "	");
			  
			  if(ddd%3 == 0) {
			  System.out.println();//엔터}
			  }
		  }

		////이중 for문
		  //문제1
		  
		 for (int rr=1; rr<= 9 ; rr++) {
			 for (int tt=1; tt<=9 ; tt++) {
				  System.out.println(rr + " x " + tt + " = " + (rr*tt));
			  }
		  }
		 
		 //주석 꼭 쓰기 
		 //문제 2 
		 // 구구단 단마다 옆으로 출력 
		 
		 for (int qq=1; qq<= 9 ; qq++) {
			 System.out.println();
			 for (int tt=1; tt<=9 ; tt++) {
				  System.out.print(qq + " x " + tt + " = " + (qq*tt)+" ");
			  }
		  }
		 
		 System.out.println("-------------");
		 //문제3 
		 // 구구단 3단씩 옆으로 출력 
	//	 for (int qqq=1; qqq<= 9 ; qqq++) {
	//		
	//		 for (int ttt=1; ttt<=9 ; ttt++) {
	//			  System.out.println(qqq + " x " + ttt + " = " + (qqq*ttt)+" ");
	//			
	//		  }
	//		 
	//	  }
		 
		 System.out.println("--------------");
		
	//	for(int ddd=2; ddd<=9; ddd=ddd+3) {
	//		for(int ttt=1; ttt<=9; ttt++) {
	//			System.out.print(ddd + "x" + ttt + "=" + (ddd*ttt));
	//			if(ddd+1<=9) {
	//				System.out.print((ddd+1) + "x" + ttt + "=" + (ddd*ttt));
	//		}  if (ddd+2<=9) {
	//			System.out.print((ddd+2) + "x" + ttt + "=" + (ddd*ttt));
	//		}
	//		System.out.println();
	//	}
	//	}
		 System.out.println("----------------");
		
		for(int tv=2; tv<=9 ; tv=tv+3) {
			for(int gm =1;gm<=9;gm++) {
				System.out.print(tv + "x" + gm + "=" + (tv*gm)+ " ");
					if(tv+1<=9) {
					System.out.print((tv+1)+ "x" + gm + "=" + (tv+1)*gm+ " ");
				}	if(tv+2<=9) {
					System.out.print((tv+2)+ "x" + gm + "=" + (tv+2)*gm+ " ");
				}System.out.println();
			}
			
		}
		
		
		// for(int g=1; g<=9; g++){
		// System.out.println("2x" + g + "=" + (2*g) + " 3x" + g + "=" + (3*g) + ...);}
		 
		
		// 문제 3  강사님 풀이 
	//	for(int j=2 ; j<=9 ; j=j+3) {
	//		for (int g=1; g<=9; g++ ) {
	//			for(int h=j; h<=(j+3-1); h++) {	
	//				if(h<=9) {
	//					System.out.println(h+"x + g_"=" + (h*g)+", ");
	//				}
	//			}System.out.println();
	//		}System.out.println();
	//	}
		 
		 
		 
		 
		 //문제4 
		 //주사위 2개를 굴려서 나올 수 있는 모든 조합 출력 
		 for (int dice = 1; dice<=6 ; dice++) {
			 for( int dice2 = 1; dice2 <= 6 ; dice2++) {
				 System.out.println("[" + dice + "," + dice2 + "]");
			 } 
		 }
		System.out.println("문제4완-------------");	 
		 
		 //문제5
		 //주사위 2개를 굴려서 합별로 출력
	//	int sum11  = 1;
	//	int dice11= 0;
	//	int dice12 = 0;
	//	 for ( sum11 =2 ; sum11 <= 12 ; sum11++) {
	//		 System.out.print("합:"+sum11);
	//		for(dice11 = 1; dice11<=6 ; dice11++) {
	//		 dice12 = sum11 - dice11;
	//		 if(dice12>=1 && dice12 <= 6) {
	//			 System.out.print("["+dice11+","+dice12+"]");
	//		 }
	//		}
	//		System.out.println();
	//	 }
		 
		 int sumsum = 0;
		 for ( sumsum = 2; sumsum<=12;sumsum++) {
			 System.out.print("합이 " + sumsum + "이(가) 나오는 조합은");
		 
			 for( int ndice1 = 1; ndice1<=6 ; ndice1++ ) {
				 for (int ndice2 =1; ndice2<=6 ; ndice2++ ) {
					 if(ndice1+ndice2 == sumsum) {
					 System.out.print("[" + ndice1 + "," + ndice2 + "]");
				 } 
		 }
		 }System.out.println();
		 }
		 
		 //문제6 
		 // 주사위 2개를 굴려서 나올 조합에서 중복 없이 출력
		 
	//	 	 sum11  = 1;
	//		 dice11= 0;
	//		 dice12 = 0;
	//		 for ( sum11 =2 ; sum11 <= 12 ; sum11++) {
	//			 System.out.print("합:"+sum11);
	//			for(dice11 = 1; dice11<=6 ; dice11++) {
	//			 dice12 = sum11 - dice11;
	//			 if(dice12>=1 && dice12 <= 6 && dice11<=dice12) {
	//				 System.out.print("["+dice11+","+dice12+"]");
	//			 }
	//			}
	//			System.out.println();
	//		 }
			 
		  sumsum = 0;
		 for ( sumsum = 2; sumsum<=12;sumsum++) {
			 System.out.print("합이 " + sumsum + "이(가) 나오는 중복 제거조합은");
		 
		 for( int ndice1 = 1; ndice1<=6 ; ndice1++ ) {
			 for (int ndice2 =1; ndice2<=6 ; ndice2++ ) {
				 if(ndice1+ndice2 == sumsum && ndice1>=ndice2) {
					 System.out.print("[" + ndice1 + "," + ndice2 + "]");
				 } 
		 }
		 }System.out.println();
		 }
		 
		 
		//크리스마스 트리 만들기
		String uu = "";
		String j="-";
		for (String u = "*" ; u.length()<=4 ; u=u+"*") {  
			uu ="" + u;
			 System.out.println(uu);
			
		} 
		String cccc="*";
		String xxx="-";
		for(int zzzz=1;zzzz<=1;zzzz++) {
			for(int qqq=1 ; qqq<=4 ; qqq= qqq+1) {
				System.out.print(xxx);
			}
			for(int qqq = 1; qqq<=1;qqq++) {
				
				System.out.print(cccc);
			}
			for(int qqq=1 ; qqq<=4 ; qqq= qqq+1) {
				
				System.out.print(xxx);
			}System.out.println();
		for(int vvvv=1;vvvv<=1;vvvv++) {
			for(int qqq=1 ; qqq<=3 ; qqq= qqq+1) {
				System.out.print(xxx);
			}
			for(int qqq = 1; qqq<=3;qqq++) {
				
				System.out.print(cccc);
			}
			for(int qqq=1 ; qqq<=3 ; qqq= qqq+1) {
				
				System.out.print(xxx);
			}System.out.println();
		for(int gggg=1;gggg<=1;gggg++) {
			for(int qqq=1 ; qqq<=2 ; qqq= qqq+1) {
				System.out.print(xxx);
			}
			for(int qqq = 1; qqq<=5;qqq++) {
				
				System.out.print(cccc);
			}
			for(int qqq=1 ; qqq<=2 ; qqq= qqq+1) {
				
				System.out.print(xxx);
			}System.out.println();
		for(int eeee=1;eeee<=1;eeee++) {
			for(int qqq=1 ; qqq<=1 ; qqq= qqq+1) {
				System.out.print(xxx);
			}
			for(int qqq = 1; qqq<=7;qqq++) {
				
				System.out.print(cccc);
			}
			for(int qqq=1 ; qqq<=1 ; qqq= qqq+1) {
				
				System.out.print(xxx);
			}System.out.println();
		for(int wwww=1;wwww<=1;wwww++) {
			
			for(int qqq=0 ; qqq<=0 ; qqq= qqq+1) {
				
			}
			for(int qqq = 1; qqq<=9;qqq++) {
				
				System.out.print(cccc);
			}
			for(int qqq=0 ; qqq<=0 ; qqq= qqq+1) {
				
				
			}System.out.println();
		}
		}
		}
		}
		}
		
		System.out.println("/////////////////");
		
		for(int kk=1; kk<=6;kk++) {
			for (int hh=1;hh<=10 ; hh++) {
			if (kk==2 && (hh==3 || hh==4 ||hh==7 ||hh==8)) {
				 System.out.print("*");
				} else if (kk==3 && (hh>=2 && hh<=9)) {
					 System.out.print("*");
				} else if (kk==4 && (hh>=4 && hh<=7)) {
					 System.out.print("*");
				} else if (kk==5 && (hh==5 || hh==6)) {
					 System.out.print("*");
				} else{System.out.print("-");} 
	
			}
		
			System.out.println();
		}
		
		
		
		 
	//	if (kk==4 && (hh>=4 && hh<=7)) {
	//		 System.out.print("*");
	//	} else{System.out.print("-");} 
	//	if (kk==5 && (hh==5 && hh==6)) {
	//		 System.out.print("*");
	//	} else{System.out.print("-");} 
		
		
	//	for (String u = "*"; u.length()<=4 ; u = u + "*") {
	//		for (String j = "-";j.length()<=4; j=j +"-") {
	//			uu = j+u + j ;
	//			System.out.println(uu);
	//		}
	// }	
	}

}
