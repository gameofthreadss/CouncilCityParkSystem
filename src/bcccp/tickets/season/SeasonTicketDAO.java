package bcccp.tickets.season;

import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.IUsageRecordFactory;

/*
Modified by: Oshan.s
2017-8-25
Class for season ticket handling
*/
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
        /*
        Method for registering ticket
        */
	public void registerTicket(ISeasonTicket ticket) {
		          registerTicket(ticket);
	}


        /*
        method for deregistering tickets
        */
	@Override
	public void deregisterTicket(ISeasonTicket ticket) {
		          deregisterTicket(ticket);
		
	}


        /*
        return number of tickets
        an int will be return
        */
	@Override
	public int getNumberOfTickets() {
            return getNumberOfTickets();
	}


        /*
        searching a ticket with a given ID
        */
	@Override
	public ISeasonTicket findTicketById(String ticketId) {
            return findTicketById(ticketId);
	}



	@Override
        /*
        does not return anything
        recor entry of ticket
        use id
        */
	public void recordTicketEntry(String ticketId) {
		this.recordTicketEntry(ticketId);
		
	}



	@Override
        /*
        record ticket exit
        */
	public void recordTicketExit(String ticketId) {
		this.recordTicketExit(ticketId);
		
	}
	
	
	
}
