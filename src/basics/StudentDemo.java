package basics;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("abc","12345678");
		
		s1.toString();
		s1.setPhone(124554455);
		s1.setCity("Mum");
		s1.setState("MH");
		s1.pay(1000);
		s1.checkBalance();
		s1.enroll();
		s1.showCourses();
	}

}
