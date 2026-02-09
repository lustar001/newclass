package chapinf;

public class CarExam {

	public static void main(String[] args) {

		Car car1 = new Car("현대", "그랜저", 240);
		Car car2 = new Car("기아", "K5", 220);
		Car car3 = new Car("쉐보레", "말리부", 200);

		Car[] cars = { car1, car2, car3 };

		for (Car c : cars) {
			c.printCarInfo();
		}
	}

}
