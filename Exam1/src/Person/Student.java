package Person;

public class Student extends Person{
	 
	private final String ClassstatuS;
	
	public Student(String name, String address, String phone, String email,String ClassstatuS){
		 super(name, address, phone, email);
		 this.ClassstatuS =ClassstatuS;
	 	 }
	 
	 public String getClassStatus(){
	 return ClassstatuS;
	 }

}
