package basics;

public class Student {
	
	private String name;
	private String ssn;
	private String email;
	private static int id = 100;
	private String userid;
	private int phone;
	private String city;
	private String state;
	private double balance = 0;
	String course[] = {"English","Maths","Science","History","Economics"};

	//Defining Constructor
	Student(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		email = name + "@test.com" ;
		id++;
		setuserid();
		
	}
	
	private void setuserid() {
		int random = (int)(Math.random() *10000);
		//System.out.println(random);
		userid = id +""+ random + ssn.substring(4);
	}
	

	public String toString() {
		String str = "xyz";
		System.out.println("UserId :" + userid + " Name :"+name + " Email: " + email + " SSN: " + ssn);
		return str;
	}
	
	//Getters and Setters
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	void enroll() {
		System.out.println("Student " + name + " is enrolled.");
	}
	
	void pay(double amount) {
		balance = balance + amount;
	}
	
	void checkBalance() {
		System.out.println("Balance :" +balance);
	}
	
	void showCourses() {
		for(int i=0; i<course.length;i++)
		{
			System.out.println(course[i]);
		}
	}
}
/*- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state*/