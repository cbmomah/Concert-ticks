
package ConcertProjectGUI.core;


/*
Alloctes the attributes of tickets

*/

public class Ticket{
	
	private int confirmationNO;
	private int concertID;
	private int seatNO;
	private int price;
        
        public Ticket() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
        public Ticket(int concertID, int seatNO, int price){
		this.concertID = concertID;
		this.seatNO = seatNO;
		this.price = price;

	}
	//Constructor
	public Ticket(int confirmationNO, int concertID, int seatNO, int price){

		this.confirmationNO = confirmationNO;
		this.concertID = concertID;
		this.seatNO = seatNO;
		this.price = price;

	}

	public int getConfirmationNo(){
		return this.confirmationNO;
	}

	public int getConcertID(){
		return this.concertID;
	}

	public int getSeatNO(){
		return this.seatNO;
	}

	public int getTicketPrice(){
		return this.price;
	}

	public void setConfirmationNO(int confirmationNO){
		this.confirmationNO = confirmationNO;
	}

	public void setConcertID(int concertID){
		this.concertID = concertID;
	}

	public void setSeatNO(int seatNO){
		this.seatNO = seatNO;
	}

	public void setPrice(int price){
		this.price = price;
	}

	@Override
	public String toString() {
		return String
				.format("Ticket [seatNum=%s, price=%s]",
						 seatNO, price);
	}
} // end class
