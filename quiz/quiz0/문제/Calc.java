package quiz.quiz0.문제;

import java.util.ArrayList;

public class Calc {
	ArrayList<String> log = new ArrayList();

	double calc(int x, String op, int y) {

		double result = 0;
		if ("+".equals(op)) {
			result = x + y;
		} else if ("-".equals(op)) {
			result = x - y;
		} else if ("/".equals(op)) {
			if (y != 0) {
				result = (double) x / y;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		} else if ("*".equals(op)) {
			result = x * y;
		}
		String log = x + op + y + "=" + result;
		this.log.add(log);

		return result;
	}

	void viewLog() {

	}
}
