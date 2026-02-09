package quiz.quiz0.문제;

import java.util.ArrayList;

public class LoginExam {

	public static void main(String[] args) {
		
		
		Login m1 = new Login("Amy","amy11");
		Login m2 = new Login("Bob","bob11");
		Login m3 = new Login("Cat","cat11");
		Login m4 = new Login("Daddy","daddy11");
		Login m5 = new Login("Emily","emily11");
		Login m6 = new Login("Family","family11");
		
		Login[] ms = {m1, m2, m3, m4};
		
		Login n1 = new Login("Emily","emily11");
		
		ArrayList<Login> list = new ArrayList();
		list.add(n1);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		
		Compare b1 = new Compare("Amy","amy11");
		
		
		for(int i=0; i<ms.length;i++) {
//			System.out.println(ms[i].id);
			ms[i].logiin(b1,ms);
		}
		
	}

}
