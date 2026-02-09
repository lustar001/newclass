package quiz.quiz0.문제;

public class Emp {

	int number; 
	String name; 
	String job; 
	int salary; 
	int mgrnum;
	
	
	Emp(int number, String name, String job, int salary, int mgrnum){
		this.number = number; 
		this.name = name; 
		this.job = job; 
		this.salary = salary;
		this.mgrnum = mgrnum;
	}
	
	void info() {
		System.out.print("사번: " + number + " ");
		System.out.print("이름: " + name + " ");
		System.out.print("직급: " + job + " ");
		System.out.print("연봉: " + salary + " ");
		System.out.println("상사사번: " + mgrnum + " ");
	}
	
}
