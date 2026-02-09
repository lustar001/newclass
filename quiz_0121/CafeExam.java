package quiz_0121;

public class CafeExam {

	public static void main(String[] args) {

		Cafe cafe = new Cafe("스타카페", 3000);
		Cafe cafe1 = new Cafe("스타카페", 4000);

		Cafe[] cafes = { cafe, cafe1 };

		cafe.sellCoffee(2);
		cafe1.sellCoffee(3);
		
		int totalsales = 0; // 변수에서 총액 더해서 총매출은 main 에서 구함 
		
		for(int i = 0; i  <cafes.length ; i++) {
			totalsales += cafes[i].sales;
		}
		System.out.println("전체 카페 총매출 : " + totalsales + "원");

		for (int i = 0; i < cafes.length; i++) {
			cafes[i].showInfo();
		}

	}

}
