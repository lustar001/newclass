package sec04_return03;

public class Calc {

	// 두 int 를 받아서 
	// 더한 결과를 int 로 돌려주는 메소드 
	
	int plus(int a, int b) {
		return a+b; 
		
	}
	// 두 int를 받아서 
	// 평균을 double로 돌려주는 메소드 
	double avg(int x, int y) {
		//int sum = x + y; 
		int sum = plus(x,y);
		double result = (double)sum/2; 
		return result; 
	}
	
	void execute(int j1, int j2) {
		double result = avg(j1,j2);
		System.out.println(j1 + ", " + j2 + "의 평균은 " + result);
	}
	
}
