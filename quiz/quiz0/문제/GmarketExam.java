package quiz.quiz0.문제;

public class GmarketExam {

	public static void main(String[] args) {

		Product p1 = new Product("키보드", 50000, "바다고래축");
		Product p2 = new Product("머그컵", 10000, "파손주의");
		Product p3 = new Product("노트북", 70000, "Ram12G");
		Product p4 = new Product("리모컨", 5000, "모든 TV 호환");
		Product p5 = new Product("조명등", 20000, "LED조명");

		Product[] ps = { p1, p2, p3, p4, p5 };

		User u1 = new User("SCOTT");
		User u2 = new User("BOB");
		User u3 = new User("JONES");
		
		User[] us = { u1, u2, u3 };
		
		
		us[0].cart[0] = ps[0];
		us[0].cart[1] = ps[1];
		us[1].cart[0] = ps[0];
		us[1].cart[1] = ps[1];
		us[1].cart[2] = ps[2];
		
		System.out.print(us[0].id + "의 장바구니 내역 :");
		for(int i = 0; i<2 ; i++) {
		System.out.print(us[0].cart[i].name + ",");
		}
		
		System.out.println();
		System.out.print(us[1].id + "의 장바구니 내역 :");
		for(int i = 0; i<3 ; i++) {
		System.out.print(us[1].cart[i].name + ",");
		}
		
		
	}

}
