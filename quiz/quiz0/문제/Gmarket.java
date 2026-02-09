package quiz.quiz0.문제;

public class Gmarket {

}

	class Product {
		
		String name; 
		int price; 
		String details; 
		
		Product(String name, int price, String details){
			this.name = name; 
			this.price = price; 
			this.details = details; 
		}
		
		void info() {
			System.out.print("상품명: "+ name + " ");
			System.out.print("가격: "+ price + " ");
			System.out.println("상세정보: "+ details + " ");
		}
		
	}
	
	class User {
		
		String id;
		Product[] cart = new Product[5];
		
		User(String id){
			this.id = id; 
		}
		
		void info() {
			System.out.println("이름: " + id + " ");
		}
		
	} 
	
	
	
	class Shoppingmall {
		
	} 
