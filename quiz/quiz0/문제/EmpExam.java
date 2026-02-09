package quiz.quiz0.문제;

import java.util.ArrayList;

public class EmpExam {

	public static void main(String[] args) {
		
//		Emp[] arrList = new Emp[2];
//		arrList[0] = new Emp();
//		arrList[1] = new Emp();
//		// emp는 new emp를 담을 수 있다 
//		Emp a = new Emp(); // 생성자 
// 		Emp b = new Emp();
//		Emp[] arrList2 = {new Emp(),new Emp()};//괄호 없음 무조건 변수
// 		Emp[] arrList2 = {a,b}
//		알트 쉬프트 에이 > 세로 블록
		
		

		Emp p1 = new Emp(7788, "SCOTT", "ANAYLST", 3000, 7566);
		Emp p2 = new Emp(7566, "JONES", "MANAGER", 2975, 7839);
		Emp p3 = new Emp(7369, "SMITH", "CLERK", 800, 7902);
		Emp p4 = new Emp(7876, "ADAMS", "CLERK", 1100, 7788);
		Emp p5 = new Emp(7499, "ALLEN", "SALESMAN", 1600, 7698);
		Emp p6 = new Emp(7521, "WARD", " SALESMAN", 1250, 7698);
		Emp p7 = new Emp(7654, "MARTIN", "MANAGER", 2850, 7839);
		Emp p8 = new Emp(7698, "BLAKE", "MANAGER", 2450, 7839);
		Emp p9 = new Emp(7782, "CLARK", "SALESMAN", 1500, 7698);
		Emp p10 = new Emp(7844, "TURNER", "CLERK", 3000, 7566);

		Emp[] ps = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 };
		
//		EmpTable empTable = new EmpTable(); 
//		empTable.join(e1);   //  얕은 복사 일어남 전달인자 무조건 얕은 복사 
		// class의 깊은 복사 
		
		for (int i = 0; i < ps.length; i++) {
			ps[i].info();
		}
		
		for(Emp p : ps) {
			
		}
		
		ArrayList<Emp> list = new ArrayList();
		list.add(p10);
		

		System.out.print("사번: " + list.get(0).number + " " + 
					"이름: " + list.get(0).name + " " +
					"직급: " + list.get(0).job + " " + 
					"연봉: " + list.get(0).salary + " " +
					"상사사번: " + list.get(0).mgrnum);
		
		System.out.println();

		System.out.println("문제6---------");

		for (int i = 0; i < ps.length; i++) {
			if (ps[i].salary >= 2000) {
				ps[i].info();
			}
		}
		
		System.out.println("문제6-1--------------");

		for (int i = 0; i < ps.length; i++) {
			if (ps[0].mgrnum == ps[i].number) {
				System.out.println("사원1의 상사이름:" + ps[i].name);
			}
			
		}

	}

}
