package sec04_return03;

public class Student {

	String name; 
	int age; 
	
	
	// setter 
	// 필드 값을 수정하는 용도의 메소드 
	// 메소드명 : set + 필드명(첫글자는 대문자) 
	// 전달인자 필드의 타입 ( 하나만) 
	// 리턴타입 : void (없음) 
	
	// 메소드명 : setName
	// 전달인자 : String 
	// 리턴타입 : void 
	void setName(String n) {
		if(name != null) {
			name = n; 
		}
		return; 
	} 
	
	// getter 
	// 메소드명 : get + 필드명(첫글자는 대문자) 
	// 전달인자 : 없음 
	// 리턴타입 : 필드의 타입 
	
	String getName() {
		return name; 
	}
}
