package quiz_0121;

public class Main {

	public static void main(String[] args) {
		
		NumberGenerator ng = new NumberGenerator();
		int[] ball = ng.random();
		
		BaseballGame game = new BaseballGame();
		game.play(ball);
	}

}
