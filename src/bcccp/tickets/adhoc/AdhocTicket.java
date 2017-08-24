package bcccp.tickets.adhoc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {
		//constructor Implementation
                this.carparkId= carparkId;
                this.ticketNo= ticketNo;
                this.barcode= barcode;
	}


	@Override
	public int getTicketNo() {
		// returns the Ticket Number 
		return ticketNo;
	}


	@Override
	public String getBarcode() {
		// Returns the Barcode of the Adhoc ticket
		return barcode;
	}


	@Override
	public String getCarparkId() {
		// Returns the carpark ID of the Adhoc adhoc ticket holder
		return carparkId;
	}


	@Override
	public void enter(long dateTime) {
		// Recieves a long datetime format and convert it to sample date format
		Date date=new Date(dateTime);
                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
                String dateText = df2.format(date);
                System.out.println(dateText);
	}


	@Override
	public long getEntryDateTime() {
		// TODO Auto-generated method stub                
		return entryDateTime;
	}


	@Override
	public boolean isCurrent() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getPaidDateTime() {
		//Implemented the incomplete Method getPaidDateTime() 
                // to get date time of payment for adhock ticket.                
                 return getPaidDateTime();
	}


	@Override
	public boolean isPaid() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public float getCharge() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void exit(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getExitDateTime() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
