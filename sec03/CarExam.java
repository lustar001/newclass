package sec03;

public class CarExam {

	public static void main(String[] args) {
		// new Car();
		//Car c2 = new Car("쉐보레");
		
		Car c3 = null; 
		try {
			// 생성자가 실행 되어야 실제 생성이 된다
			c3 = new Car();
		}catch(Exception e) {
			System.out.println("new Car()에서 예외 발생");
		}
		System.out.println("c3: "+ c3);
		
		
		Book book = new Book();
		book.title = "자바기초";
		book.price = 15000;
		System.out.println(book.title + " " +  book.price);
		
		
		
	} 

	
		
}
