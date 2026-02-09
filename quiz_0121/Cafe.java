package quiz_0121;

public class Cafe {

	String name; 
	int price;
	int sales = 0; 
	
	Cafe(String name, int price){
		this.name = name; 
		this.price = price;
	}
	
	int sellCoffee(int count) {
		if(count > 0) {
			int money = price * count; 
			sales +=  money;
			//sales += sales + money;
			return money;
		} else {
			System.out.println("1잔 이상 선택해주세요");
			return 0;
		}
	}
	
	void showInfo() {
		System.out.println("카페명: " + name + " ");
		System.out.println("커피 가격: " + price + "원 ");
		System.out.println("총 매출: " + sales + " ");
	}
	
	
	 
}
