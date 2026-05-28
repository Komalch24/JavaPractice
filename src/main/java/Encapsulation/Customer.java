package Encapsulation;

public class Customer {
	
	private int Age = 0;
	private String firstName;
	private String lastName;
	private String custID;
	private String PhoneNumber;
	
	public void settttttAge(int age) {
		if(age<0 || age>150){
			
		} else
		 {this.Age = age;}
	}
	
	public int gettttttttttttAge() {
		return this.Age;
	}
}
