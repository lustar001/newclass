package quiz.quiz0.문제;

import java.util.ArrayList;

public class EmpTable {

	 //1. ArrayList 
	ArrayList list = new ArrayList(); 
	//2. 배열 
	
	
	// 추가 메소드 
	// Emp를 전달 받아서 저장한다 
	
	void join (Emp emp) {  //아무 변수나 사용 가능
		this.list.add(emp);  
		
		//arrList[lastIndex] = emp;
		//lastIndex++;  // 배열로 출력
		//arrList[lastIndex++] = emp;  // 있어보이는 출력
	}
	
//	void print() {  // list는 사이즈 아니면 length  a.length() 로 찾기  
//		//형변환 주의Emp emp = (Emp) list2.get(0);
//	}
	//void whereSal() {
		//for(int i = 0; i<list.size(); i++) {
			
		//}
	//}
	
	
	// 상사 번호 찾기 
	
}
