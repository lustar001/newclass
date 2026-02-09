package chap04;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
	
		// 1단계 
		// +++++
		
		
		System.out.println("1단계-----------------");
		for ( int i=1; i<=5 ; i++ ) {
			System.out.print("+");
		}
		System.out.println();
		System.out.println();
		// 2단계
		// +_+_+_+_+_
		
		
		System.out.println("2단계--------------");
		for(int ii = 1; ii <=5 ; ii++) {
			System.out.print("+");
			System.out.print("_");
		}
			System.out.println();
			System.out.println();
		// 3단계 
		// +++++
		// +++++
		// +++++
		
		System.out.println("3단계---------------");
		for(int q=1; q<=3 ; q++) {
			for(int w=1;w<=5; w++) {
				System.out.print("+");
			}System.out.println();
		}
		System.out.println();
		System.out.println();
		// 4단계
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		
		System.out.println("문제4-------------");
		for(int e=1;e<=5 ;e++) {
			for(int r=1;r<=5;r++) {
				System.out.print(e);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 5단계
		// 1
		// 22
		// 333
		// 4444
		// 55555
		
		System.out.println("문제5--------------");
		for(int qq=1; qq<=5 ; qq++) {
			for(int ww=1; ww<=qq ; ww++) {
				System.out.print(qq);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 6단계
		// +
		// ++ 
		// +++
		// ++++
		// +++++
		
		System.out.println("문제6---------------");
		for(int ee=1; ee<=5 ; ee++) {
			for(int rr=1 ; rr<=ee ; rr++) {
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 7단계 
		// 11111
		// 2222
		// 333
		// 44
		// 5
		
		System.out.println("문제7---------------");
		for( int a=5 ; a>=1 ; a--) {
			for(int s=1; s<=a; s++) {
				 System.out.print(a);
			} 
			System.out.println();
		} 
		System.out.println();
		System.out.println();
		
		// 8단계 
		// +____
		// ++___
		// +++__
		// ++++_
		// +++++
		
		System.out.println("문제8---------------");
		for(int z=1; z<=5; z++) {
			for(int x=1;x<=z;x++) {
				System.out.print("+");
			}
			for(int c=1; c<=5-z;c++) {
				System.out.print("_");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		// 9단계 
		// ____+
		// ___++
		// __+++
		// _++++
		// +++++
		
		
		System.out.println("문제9---------------");
		for(int zz=1; zz<=5; zz++) {
			for(int xx=1;xx<=5-zz;xx++) {
				System.out.print("_");
			}
			for(int cc=1; cc<=zz ; cc++) {
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 10단계 
		// ____+
		// ___+++
		// __+++++
		// _+++++++
		// +++++++++
		
		System.out.println("문제10---------------");
		for(int zz=1; zz<=5; zz++) {
			for(int xx=1;xx<=5-zz;xx++) {
				System.out.print("_");
			}
			for(int cc=1; cc<=(zz*2)-1 ; cc++) {
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		// 11단계 
		// ____+____
		// ___+++___
		// __+++++__
		// _+++++++_
		// +++++++++
		
		System.out.println("문제11---------------");
		
		for(int zz=1; zz<=5; zz++) {
			for(int xx=1;xx<=5-zz;xx++) {
				System.out.print("_");
			}
			for(int cc=1; cc<=(zz*2)-1 ; cc++) {
				System.out.print("+");
			}
			for(int xx=1;xx<=5-zz;xx++) {
				System.out.print("_");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 12단계 
		// 입력받은 줄 수대로 출력 
		
		System.out.println("문제12---------------");
		
		Scanner scanner = new Scanner(System.in); 
		String inputData = scanner.nextLine();
		
		int abc = Integer.parseInt(inputData);
		
		for(int zz=1; zz<=abc; zz++) {
			for(int xx=1;xx<=5-zz;xx++) {
				System.out.print("_");
			}
			for(int cc=1; cc<=(zz*2)-1 ; cc++) {
				System.out.print("*");
			}
			for(int xx=1;xx<=5-zz;xx++) {
				System.out.print("_");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

	}

}
