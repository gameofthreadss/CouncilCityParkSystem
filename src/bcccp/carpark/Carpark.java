package bcccp.carpark;

import java.util.List;

import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;
import java.util.ArrayList;
import java.util.Date;

public class Carpark implements ICarpark {
	
	private List<ICarparkObserver> observers;
	private String carparkId;
	private int capacity;
	private int numberOfCarsParked;
	private IAdhocTicketDAO adhocTicketDAO;
	private ISeasonTicketDAO seasonTicketDAO;
	
	
	
	public Carpark(String name, int capacity, 
			IAdhocTicketDAO adhocTicketDAO, 
			ISeasonTicketDAO seasonTicketDAO) {
        //Implement constructor    
	this.carparkId = name;
        this.capacity = capacity;
        this.adhocTicketDAO = adhocTicketDAO;
        this.seasonTicketDAO = seasonTicketDAO;

        observers = new ArrayList<>();
	}



	@Override
	public void register(ICarparkObserver observer) {
		//Added observer on each carpark registeration
                observers.add(observer);
		
	}



	@Override
            public void deregister(ICarparkObserver observer) {
		//deregisteration on carkpark 
                    observers.remove(observer);
                    numberOfCarsParked--;
		
	}



	@Override
	public String getName() {
		// returned carparkId value
		return carparkId;
	}



	@Override
	public boolean isFull() {

		return (numberOfCarsParked >= capacity) ? true : false ;
	}



	@Override
	public IAdhocTicket issueAdhocTicket() {
		//return issued adhoc ticket.
		return adhocTicketDAO.createTicket(carparkId);
	}



	@Override
	public void recordAdhocTicketEntry() {
		
            numberOfCarsParked++;
		
	}



	@Override
	public IAdhocTicket getAdhocTicket(String barcode) {
            //return adhocTicketDAO ticket
		return adhocTicketDAO.findTicketByBarcode(barcode);
	}



	@Override
	public float calculateAddHocTicketCharge(long entryDateTime) {
		// Calculation: get current Date and Time, subtract entryDateTime, multiply result by
        // the $ charge rate and return charge. Assumption that rates are a fixed rate of $5.00 per hour.
        // Convert time to hours by dividing by 60,000. Assumption this is short-stay tariff car park.

        float rates = 5.0f;

        Date dateTime = new Date();

        float chargeAmount = (dateTime.getTime() - entryDateTime) * rates / 60000;

        return chargeAmount;
        
	}



	@Override
	public void recordAdhocTicketExit() {
		
                numberOfCarsParked--;
		
	}



	@Override
	public void registerSeasonTicket(ISeasonTicket seasonTicket) {
		//registerTicket for season type
                seasonTicketDAO.registerTicket(seasonTicket);
		
	}



	@Override
	public void deregisterSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean isSeasonTicketValid(String ticketId) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isSeasonTicketInUse(String ticketId) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void recordSeasonTicketEntry(String ticketId) {
		// Added seasonticket entry method
                seasonTicketDAO.recordTicketEntry(ticketId);
		
	}



	@Override
	public void recordSeasonTicketExit(String ticketId) {
		//Added seasonticket exit method
                seasonTicketDAO.recordTicketExit(ticketId);
		
	}

	
	

}
