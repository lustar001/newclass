package quiz_0121;

import java.util.ArrayList;

public class NumberGenerator {

	public int[] random() {

		int[] number = new int[3];

		for (int i = 0; i < 3; i++) {
			number[i] = (int) ((Math.random() * 9) + 1);

			for (int j = 0; j < 3; j++) {
				if (number[j] == number[i]) {
					j--;  // i 랑 j 랑 둘 다 0인 경우??
					break;
				}

			}

		}
		return number;
	}
}
