package Person;

public class Person {

	
	
public String NamE;
public String AddresS;
public String PhonE;
public String EmaiL;



	public Person(String name, String address, String phone, String email){
		 this.NamE = name;
		 this.AddresS = address;
		 this.PhonE = phone;
		 this.EmaiL = email;
		 }
		 public String getName(){
		 return NamE;
		 }
		 public void setName(String name){
		 this.NamE = name;
		 }
		 public String getAddress(){
		 return AddresS;
		 }
		 public void setAddress(String address){
		 this.AddresS = address;
		 }
		 public String getPhone(){
		 return PhonE;
		 }
		 public void setPhone(String phone){
		 this.PhonE = phone;
		 }
		 public String getEmail(){
		 return PhonE;
		 }
		 public void setEmail(String email){
		 this.EmaiL = email;
		 }
		 @Override
		 public String toString(){
		 return getClass().getName() + "\n" + NamE;
		 }

}
