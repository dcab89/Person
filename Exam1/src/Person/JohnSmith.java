package Person;

public class JohnSmith {

		public static void main(String[] args) {
		
		Person person = new Person("Dean Winchester", "123 Nowhere Ln.", "302-666-1212", "dwinchester@spooky.com");
		System.out.println(person.toString() + "\n");
		
		Person student = new Student("Roberta Sparrow", "452 Cellar Door Rd.", "402-555-1212", "rsparrow@donny.com", "senior");
		System.out.println(student.toString() + "\n");
		
		Person employee = new Employee("Les Claypool", "420 Tomcat Av.", "502-444-1212", "lclaypool@seasofcheese.com");
		System.out.println(employee.toString() + "\n");
		
		Person faculty = new Faculty("Darth Vader", "666 Death Star Ct.", "302-333-1212", "dvader@tiefighter.com");
		System.out.println(faculty.toString() + "\n");
		
		Person staff = new Staff("Tyler Durden", "412 Paper St.", "202-222-1212", "tdurden@fightclub.com");	
		System.out.println(staff.toString() + "\n");
		}
		} 

