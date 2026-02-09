package quiz.quiz0.문제;

public class Movie {
		String title; 
		int release; 
		
		void setName(String title) {
			this.title = title;
		}
		
		String getName() {
			return this.title;
		}
		
		int getYear() {
			return this.release;
		}
		
		void setYear(int release) {
			this.release = release; 
		}
		
		String getName2() {
			return this.title + 2 ;
		}
		
}
