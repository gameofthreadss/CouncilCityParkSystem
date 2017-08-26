package bcccp.tickets.season;

import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.IUsageRecordFactory;

public class SeasonTicketDAO implements ISeasonTicketDAO {

	private IUsageRecordFactory factory;

	
	/*
        This is the constructor method for this class
        @author Oshan.s
        @date 2107-08-25
        */
	public SeasonTicketDAO(IUsageRecordFactory factory) {
            this.factory = factory;
	}



	@Override
        
	public void registerTicket(ISeasonTicket ticket) {
		String strID = ticket.getId();		
	}



	@Override
	public void deregisterTicket(ISeasonTicket ticket) {
		String strID = ticket.getId();
		
	}



	@Override
	public int getNumberOfTickets() {
            return getNumberOfTickets();
	}



	@Override
	public ISeasonTicket findTicketById(String ticketId) {
            return findTicketById(ticketId);
	}



	@Override
	public void recordTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void recordTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
