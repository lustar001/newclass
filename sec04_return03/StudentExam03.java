package sec04_return03;

public class StudentExam03 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); 
		s1.name = "김지윤";
		s1.age = 32; 
		
		s1.name = null;
		s1.age = -32; 
		
		s1.setName("김지윤");
		String name = s1.getName();
		System.out.println("이름 : " + name);
	}

}
