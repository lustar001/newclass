package quiz_0121;

public class League {

	void Battle(Pokemon m1, Pokemon m2) {
		
		int count = 1; 
		
		while(true) {
			if(m1.HP <= 0) {
				System.out.println(m1.name + "이 쓰러졌습니다.");
				break;
			} 
			
			if(m2.HP <= 0 ) {
				System.out.println(m2.name + "이 쓰러졌습니다.");
				break;
			}
			
			System.out.println(count + "회차");
			
			int damage = m1.ATK - m2.DFS; 
			if(damage < 0) damage = 0; 
			m2.HP -= damage; 
			System.out.println(m2.name + "HP : " + m2.HP);
			
			int damage2 = m2.ATK - m1.DFS; 
			if(damage2 < 0) damage2 = 0;
			m1.HP -= damage2; 
			System.out.println(m1.name + "HP : " + m1.HP);
			
			System.out.println();
			count++;
			
		} 
			
	}

	public static void main(String[] args) {

		Pokemon m1 = new Pokemon("피카츄",7,3,10);
		Pokemon m2 = new Pokemon("라이츄",8,2,10);
		
		League battle = new League();
		
		battle.Battle(m1,m2);
		
		
	}

}
