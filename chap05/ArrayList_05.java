package chap05;

import java.util.ArrayList;

public class ArrayList_05 {

	public static void main(String[] args) {

		String[] menu = new String[3];
		menu[0] = "아아";
		menu[0] = "딸기라떼";
		menu[0] = "따뜻한 아이스티";

		// "딸기치즈케이크스무디"를 추가해서
		// 총 4개 출력

		String[] menu2 = new String[menu.length + 1];
		menu2[0] = menu[0];
		for (int i = 0; i < menu.length; i++) {
			menu2[i] = menu[i];

		}
		menu2[menu2.length - 1] = "딸기치즈케이크스무디";

		ArrayList list = new ArrayList();

		// 추가
		list.add(1);
		list.add("글씨");
		list.add(true);

		System.out.println(list.get(0)); // 1
		System.out.println(list.get(1)); // 글씨
		System.out.println(list.get(2)); // true

		// 크기
		System.out.println(list.size());

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		ArrayList<String> list2 = new ArrayList();
		list2.add("첫번째");
		list2.add("두번째");

		for (String s : list2) {
			System.out.println(s);
		}

		ArrayList list3 = new ArrayList();
		list3.add(1);
		list3.add(2);

		int a = (int) list3.get(0);

	}

}
