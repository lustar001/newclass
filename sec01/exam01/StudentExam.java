package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Student s2; 
		s2 = new Student();
		
		System.out.println(s1 == s2);//false
		
		Student s3 = null; 
		s3 = s1; 
		System.out.println(s3 == s1); //true
		
		s1= null; 
		// s3는  null 이 아님
		// 여전히 s1에서 들어갔던 인스턴스를 보고있다.
		
		s1 = s2; 
		// s3는 여전히 s1에서 들어갔던 인스턴스를 보고있다.
		
		
	}

}
