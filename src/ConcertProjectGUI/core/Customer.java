
package ConcertProjectGUI.core;

/*

Customer class responsible for keeping track of customer transcations

*/


public class Customer{

	private	int    id;
	private String firstName;
	private String lastName;
	private String email;
	private double balance;
	private String phoneNO;

	//Constructor
	Customer(int id ,String firstName, String lastName, String email, double balance, String phoneNO){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.balance = balance;
		this.phoneNO = phoneNO;
	}


	public int getID(){
		return this.id;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public String getEmail(){
		return this.email;
	}

	public double getBalance(){
		return balance;
	}

	public String getPhoneNo(){
		return this.phoneNO;
	}

	public void setID(int id){
		this.id = id;
	}
	
	public void setFirstName(String fName){
		this.firstName = fName;
	}

	public void setLastName(String lName){
		this.lastName = lName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void addBalance(int newBalance){
		this.balance = this.balance + newBalance;
	}

	public void setPhoneNO(String phoneNO){
		this.phoneNO = phoneNO;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
} // end class
