package quiz_0121;

public class HotelExam {

	public static void main(String[] args) {
		
		Hotel room1 = new Hotel(15, true, true);
		Hotel room2 = new Hotel(6, false, true);
		Hotel room3 = new Hotel(4, false, false );
		
		
		System.out.println("===1번방 예약 안내===");
		room1.reservation1(2);
		room1.reservation1(5);
		room1.reservation1(4);
		//room1.reservation1(4);
		System.out.println();
		System.out.println("===2번방 예약 안내===")
		;
		room2.reservation2(3);
	}

}
