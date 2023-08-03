
package ConcertProjectGUI.core;

public class Concert{

	private	int 	id;	
	private String firstName;
	private String lastName;
	private String date;
	private String address; 
	
	// Concert constructor 
	public Concert(int id, String firstName, String lastName, String date, String address){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName; 
		this.date = date;
		this.address = address;

	}// end of constructor 
	

	public int getID(){
		return id;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}
	
	public String getDate(){
		return date;
	}
  
  	public String getAddress(){
		return address;
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
	
	public void setDate(String date){
		this.date = date;
	}
  
  	public void setAddress(String address){
		this.address = address;
	}

	@Override
	public String toString() {
		return String
				.format("Concert [id=%s, firstName=%s, lastName=%s, date=%s, address=%s]",
						id, firstName, lastName, date, address);
	}
}// end class
