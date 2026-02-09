package quiz.quiz0.문제;

public class Execution {

	
	public static void main(String[] args) {

		Item p1 = new Item("시계");
		Item p2 = new Item("자동차");

		Process i1 = new Process();

		i1.run(p1);
		i1.run(p2);

	}
}

class Item {
	String name;

	Item(String name) {
		this.name = name;
	}

}

class Process {

	void run(Item item) {
		System.out.println("이름: " + item.name + " 생산완료");
	}
}

