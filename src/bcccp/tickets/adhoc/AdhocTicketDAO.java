package bcccp.tickets.adhoc;

import java.util.List;
import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.AdhocTicket;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;
        private IAdhocTicket iAdhocTicket;
        private AdhocTicket adhocTicket;

	
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		//Constructor Implementation
                //initialize with IAdhocTicketFactory interface
                this.factory = factory;
	}

	@Override
	public IAdhocTicket createTicket(String carparkId) {
		// TODO Auto-generated method stub
                
		return null;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
