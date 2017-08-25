package bcccp.tickets.adhoc;

import java.text.SimpleDateFormat;
import java.util.Date;
import bcccp.carpark.exit.ExitUI;   // To Access ExitUI Class
import bcccp.carpark.paystation.IPaystationController;//To access payStaion
import bcccp.carpark.paystation.PaystationUI; // To Access PaystaionUI Class
public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;
        private IAdhocTicket iAdhocTicket;
        private IAdhocTicketDAO iAdhocTicketDAO;
        private ExitUI exitUI; //Access ExitUI Class
        private PaystationUI payStationUI;// Access PaystaionUI Class
        private IPaystationController paystaionController;
        

	
	
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
                //sets the car entry date and time for adhoc ticket holder.
                this.entryDateTime = dateTime;
	}


	@Override
	public long getEntryDateTime() {
		// Returns the entry date and time of the car.  
                //important and useful to calculate the charges for car park.
		return entryDateTime;
	}


	@Override
	public boolean isCurrent() {
		// It will check for current entry of the car in the car park
                // return true if it matches with the data already stored.
                iAdhocTicket = iAdhocTicketDAO.findTicketByBarcode(barcode);
                if(this.barcode.equals(iAdhocTicket.getBarcode()))
                    return true;
                else
                    return true;
                    
	}
	@Override
	public void pay(long dateTime, float charge) {
		// This will allow Adhoc CustoMer to print the Ticket for the parking 
                //to pay at pay station office
               String LCD = "Pay Receipt";
               Date date = new Date(dateTime);
               LCD += "The time of car park is " + date.toString() + 
                     " and Amount to be paid is $" + charge;
               System.out.println(LCD);
              
               payStationUI.ticketPrinterTextArea.setText(LCD);
               
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
		// Returns the Charge that have been calculated for parking.
                //Car park charge,based on time charge is calculated
		return charge;
	}


	@Override
	public void exit(long dateTime) {
		// sets the Car exit date and time. useful for the future record.
		this.exitDateTime = dateTime;
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
